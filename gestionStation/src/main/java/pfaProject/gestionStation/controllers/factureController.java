package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.facture;
import pfaProject.gestionStation.entities.user;
import pfaProject.gestionStation.repositories.factureRepo;
import pfaProject.gestionStation.repositories.userRepo;

import java.util.List;

@RestController
@RequestMapping("/api/station")
public class factureController {
    @Autowired
    private factureRepo factureRepo ;
    @GetMapping("/factures")
    public List<facture> getUser(){
        return factureRepo.findAll();
    }
    @PostMapping("/createFacture")
    public List<facture> createFacture(@RequestBody facture Facture){
        factureRepo.save(Facture);
        return factureRepo.findAll();
    }

}
