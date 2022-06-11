package pfaProject.gestionStation.service;

import pfaProject.gestionStation.entities.Achat;

import java.util.List;
import java.util.Optional;

public interface AchatService {
 public void addAchat(String date,String heur,String nomProduit,String fournisseur,float quantity,float prixU, float montant);
 public List<Achat> getAllAchats();
 public void deleteAchat(Long id);
 public Achat getById(Long id);
 public Achat saveAchat(Achat achat);
}
