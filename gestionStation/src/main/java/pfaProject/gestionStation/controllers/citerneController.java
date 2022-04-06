package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pfaProject.gestionStation.entities.citerne;
import pfaProject.gestionStation.repositories.citerneRepo;

import java.util.List;
@RestController
@RequestMapping("/api/station")
public class citerneController {
    @Autowired
    private citerneRepo citernRepo ;
    @GetMapping("/citernes")
    public List<citerne> getCiterne(){
        return citernRepo.findAll();
    }
    @PostMapping("/addCiterne")
    public List<citerne> addCiterne (@RequestBody citerne citerne){
        citernRepo.save(citerne);
        return citernRepo.findAll();
    }
}
