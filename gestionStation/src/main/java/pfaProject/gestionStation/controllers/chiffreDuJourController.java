package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.ChiffreDuJour;
import pfaProject.gestionStation.service.chiffreDuJourServiceImplement;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
public class chiffreDuJourController {
    @Autowired
    private chiffreDuJourServiceImplement chiffreService;
    @GetMapping("/AllchiffresJour")
    public List<ChiffreDuJour> getAll(){
        return chiffreService.getAll();
    }
    @GetMapping("/chiffre")
    public ChiffreDuJour getChiffre(@PathVariable Long id){

        return chiffreService.getById(id);
    }

    @PostMapping("/saveChiffre")
    public ChiffreDuJour saveChiffre(ChiffreDuJour chiffre){

        return chiffreService.saveChiffreDuJour(chiffre);
    }

    @PutMapping("/chiffreJour/{id}")
    public ChiffreDuJour UpdateChiffre(@PathVariable Long id, @RequestBody ChiffreDuJour chiffre){
        return chiffreService.updateChiffre(id,chiffre);
    }

}
