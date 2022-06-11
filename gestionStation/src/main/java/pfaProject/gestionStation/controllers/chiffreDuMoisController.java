package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.ChiffreDuMois;
import pfaProject.gestionStation.service.chiffreDuMoisServiceImplement;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
public class chiffreDuMoisController {

    @Autowired
    private chiffreDuMoisServiceImplement chiffreDuMoisService;


    @GetMapping("/chiffresMois")
    public List<ChiffreDuMois> getAll(){
        return chiffreDuMoisService.getAll();
    }
    @GetMapping("/getChiffre/{id}")
    public ChiffreDuMois getChiffre(@PathVariable Long id){
        return chiffreDuMoisService.getById(id);
    }

    @PostMapping("/saveChiffreMois")
    public ChiffreDuMois saveChiffre(ChiffreDuMois chiffre){
        return chiffreDuMoisService.saveChiffreDuMois(chiffre);
    }

    @PutMapping("/updateChiffre/{id}")
    public ChiffreDuMois UpdateChiffre(@PathVariable Long id, @RequestBody ChiffreDuMois chiffre){
        return chiffreDuMoisService.updateChiffre(id,chiffre);
    }


}
