package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.repositories.clientRepo;

@Service
public class clientServiceImplement implements clientService{
    @Autowired
    private clientRepo clientRepo;
    @Override
    public Long count() {
        return clientRepo.count();
    }
}
