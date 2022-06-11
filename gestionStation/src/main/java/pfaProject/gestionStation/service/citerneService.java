package pfaProject.gestionStation.service;


import pfaProject.gestionStation.entities.citerne;


public interface citerneService {
    public void AddStock(String code,float ajouter);
    public citerne getByCode(String code);
    public void retrancherStock(String code,float quantite);
    public citerne getById(Long id);

}
