package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.carburant;
import pfaProject.gestionStation.repositories.carburantRepo;
@Service
public class carburantServiceImpl implements carburantService{
    @Autowired
    private carburantRepo carburantRepo;
    @Override
    public void addStock(String nomProduit, float ajouter, float prixU) {
       carburant C= carburantRepo.findByNomProduit(nomProduit);
       C.setQuantiteStock(C.getQuantiteStock()+ajouter);
       C.setPrixU(prixU);
        carburantRepo.save(C);
    }
}
