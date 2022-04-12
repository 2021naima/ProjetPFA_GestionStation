package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.pompe;
import pfaProject.gestionStation.repositories.pompeRepo;


import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
public class pompeController {
    @Autowired
    private pompeRepo pompeRepo;
    @GetMapping("/pompes")
    public List<pompe> getPompe(){
        return pompeRepo.findAll();
    }
    @PostMapping("/AddPompe")
    public List<pompe> addPompe (@RequestBody pompe Pompe){
        pompeRepo.save(Pompe);
        return pompeRepo.findAll();
    }
}
