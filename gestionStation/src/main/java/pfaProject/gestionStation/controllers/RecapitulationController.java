package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.Recap;
import pfaProject.gestionStation.service.AchatServiceImpl;
import pfaProject.gestionStation.service.carburantServiceImpl;
import pfaProject.gestionStation.service.citerneServImpl;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
public class RecapitulationController {
    @Autowired
    private citerneServImpl serviceCiterne;
    @Autowired
    private carburantServiceImpl serviceCarburant;
    @Autowired
    private AchatServiceImpl achatService;


    @PostMapping("/recapitulation")
    public void Achat(@RequestBody Recap recap){

        serviceCiterne.AddStock(recap.getCodeCitern(), recap.getQuantiteAjout());
        serviceCarburant.addStock(recap.getTypeCarburant(), recap.getQuantiteAjout(),recap.getPrixU());

        String date=recap.getDate();
        String nomProduit=recap.getTypeCarburant();
        String fournisseur=recap.getFournisseur();
        float quantity=recap.getQuantiteAjout();
        float prixU=recap.getPrixU();
        float montant=recap.getMontantTotal();

        achatService.addAchat(date,nomProduit,fournisseur,quantity,prixU,montant);
        System.out.println("achat added successfully");

    }


}
