package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.citerne;
import pfaProject.gestionStation.repositories.citerneRepo;
@Service
public class citerneServImpl implements citerneService{
    @Autowired
    private citerneRepo citerneRepo;
    @Override
    public void AddStock(String code, float ajouter) {
        citerne C=citerneRepo.findByCode(code);
        C.setStockRestant(C.getStockRestant()+ajouter);
        citerneRepo.save(C);

    }

    @Override
    public citerne getByCode(String code) {
       return citerneRepo.findByCode(code);
    }

    @Override
    public void retrancherStock(String code, float quantite) {
        citerne C=citerneRepo.findByCode(code);
        C.setStockRestant(C.getStockRestant()-quantite);
    }

    @Override
    public citerne getById(Long id) {
        return citerneRepo.findById(id).orElseThrow(RuntimeException::new);
    }
}

