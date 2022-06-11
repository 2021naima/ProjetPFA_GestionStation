package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.Achat;
import pfaProject.gestionStation.repositories.achatRepo;

import java.util.List;
import java.util.Optional;

@Service
public class AchatServiceImpl implements AchatService{
    @Autowired
    achatRepo achatRepo;
    @Override
    public void addAchat(String date,String heur, String nomProduit, String fournisseur, float quantity, float prixU, float montant) {
        Achat achat=new Achat();
        achat.setDate(date);
        achat.setHeur(heur);
        achat.setNomProduit(nomProduit);
        achat.setFournisseur(fournisseur);
        achat.setQuantity(quantity);
        achat.setPrixU(prixU);
        achat.setMontant(montant);
        achatRepo.save(achat);
    }

    @Override
    public List<Achat> getAllAchats() {
        return achatRepo.findAll();
    }

    @Override
    public void deleteAchat(Long id) {
        achatRepo.deleteById(id);
    }

    @Override
    public Achat getById(Long id) {
        return achatRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Achat saveAchat(Achat achat) {
        return achatRepo.save(achat);
    }

}
