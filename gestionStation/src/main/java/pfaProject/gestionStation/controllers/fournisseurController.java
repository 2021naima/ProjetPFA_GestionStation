package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.fournisseur;
import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.repositories.fournisseurRepo;

import java.util.List;

@RestController
@RequestMapping("/api/station")
public class fournisseurController {
    @Autowired
    private fournisseurRepo fR ;
    @GetMapping("/fournisseurs")
    public List<fournisseur> getFournisseur(){
        return fR.findAll();
    }
    @PostMapping("/addFournisseur")
    public List<fournisseur> createFournisseur(@RequestBody fournisseur fournisseur){
      fR.save(fournisseur);
      return fR.findAll();
    }
}
