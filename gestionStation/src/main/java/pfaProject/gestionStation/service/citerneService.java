package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import pfaProject.gestionStation.entities.citerne;
import pfaProject.gestionStation.repositories.citerneRepo;

public interface citerneService {
    public void AddStock(String code,float ajouter);
    public citerne getByCode(String code);
}
