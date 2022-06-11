package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.Recap;
import pfaProject.gestionStation.repositories.RecapRepo;
import pfaProject.gestionStation.service.RecapService;
@Service
public class RecapServiceImplement implements RecapService {
    @Autowired
    private RecapRepo recapRepo;
    @Override
    public Recap saveRecap(Recap ricap) {
        return recapRepo.save(ricap);
    }
}
