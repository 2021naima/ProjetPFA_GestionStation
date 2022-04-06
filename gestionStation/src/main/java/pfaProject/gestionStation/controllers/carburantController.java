package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.carburant;
import pfaProject.gestionStation.repositories.carburantRepo;


import java.util.List;

@RestController
@RequestMapping("/api/station")
public class carburantController {
    @Autowired
    private carburantRepo carburantRepo;
    @GetMapping("/carburants")
    public List<carburant> getCarburat(){
        return carburantRepo.findAll();
    }
    @PostMapping("/AddCarburant")
    public List<carburant> addCarburant (@RequestBody carburant Carburant){
        carburantRepo.save(Carburant);
        return carburantRepo.findAll();
    }
}
