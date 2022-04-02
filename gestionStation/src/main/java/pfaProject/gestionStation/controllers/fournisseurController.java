package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pfaProject.gestionStation.entities.fournisseur;
import pfaProject.gestionStation.repositories.fournisseurRepo;

import java.util.List;

@RestController
@RequestMapping("/api/station")
public class fournisseurController {
    @Autowired
    private fournisseurRepo fR ;
    @PostMapping("/fournisseur")
    public List<fournisseur> createFournisseur(@RequestBody fournisseur fournisseur){
      fR.save(fournisseur);
      return fR.findAll();
    }
}
