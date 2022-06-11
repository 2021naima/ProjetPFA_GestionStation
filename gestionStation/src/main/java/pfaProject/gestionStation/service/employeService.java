package pfaProject.gestionStation.service;

import pfaProject.gestionStation.entities.employe;

public interface employeService {
    employe findById(Long id);
    public Long count();

}
