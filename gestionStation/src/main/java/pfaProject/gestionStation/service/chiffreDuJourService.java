package pfaProject.gestionStation.service;

import pfaProject.gestionStation.entities.ChiffreDuJour;


import java.util.List;

public interface chiffreDuJourService {
    public ChiffreDuJour saveChiffreDuJour(ChiffreDuJour chiffre);
    public void deleteChiffreDuJour(Long id);
    public List<ChiffreDuJour> getAll();
    public ChiffreDuJour getById(Long id);
    public ChiffreDuJour updateChiffre(Long id, ChiffreDuJour chiffre);
}
