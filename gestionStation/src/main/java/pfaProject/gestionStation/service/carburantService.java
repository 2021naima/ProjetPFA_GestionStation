package pfaProject.gestionStation.service;

import org.springframework.stereotype.Service;


public interface carburantService {
    public void addStock(String nomProduit,float ajouter, float prixU);
}
