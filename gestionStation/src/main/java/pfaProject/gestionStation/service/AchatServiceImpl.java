package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.Achat;
import pfaProject.gestionStation.repositories.achatRepo;
@Service
public class AchatServiceImpl implements AchatService{
    @Autowired
    achatRepo achatRepo;
    @Override
    public void addAchat(String date, String nomProduit, String fournisseur, float quantity, float prixU, float montant) {
        Achat achat=new Achat();
        achat.setDate(date);
        achat.setNomProduit(nomProduit);
        achat.setFournisseur(fournisseur);
        achat.setQuantity(quantity);
        achat.setPrixU(prixU);
        achat.setMontant(montant);
        achatRepo.save(achat);
    }
}
