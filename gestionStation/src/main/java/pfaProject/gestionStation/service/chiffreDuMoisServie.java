package pfaProject.gestionStation.service;

import pfaProject.gestionStation.entities.ChiffreDuMois;

import java.util.List;

public interface chiffreDuMoisServie {
    public ChiffreDuMois saveChiffreDuMois(ChiffreDuMois chiffre);
    public void deleteChiffreDuMois(Long id);
    public List<ChiffreDuMois> getAll();
    public ChiffreDuMois getById(Long id);
    public ChiffreDuMois updateChiffre(Long id, ChiffreDuMois chiffre);
  //  public List<float> getChiffres();
}
