package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.Achat;
import pfaProject.gestionStation.entities.Recap;
import pfaProject.gestionStation.service.AchatServiceImpl;
import pfaProject.gestionStation.service.RecapServiceImplement;
import pfaProject.gestionStation.service.carburantServiceImpl;
import pfaProject.gestionStation.service.citerneServImpl;

import java.util.List;


@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
public class AchatController {
    @Autowired
    private citerneServImpl serviceCiterne;
    @Autowired
    private carburantServiceImpl serviceCarburant;
    @Autowired
    private AchatServiceImpl achatService;
    @Autowired
    private RecapServiceImplement recapService;


    @PostMapping("/recapitulation")
    public void Achat(@RequestBody Recap recap){
        recapService.saveRecap(recap);
        serviceCiterne.AddStock(recap.getCodeCitern(), recap.getQuantiteAjout());
        serviceCarburant.addStock(recap.getTypeCarburant(), recap.getQuantiteAjout(),recap.getPrixU());

        String date=recap.getDate();
        String heur=recap.getHeur();
        String nomProduit=recap.getTypeCarburant();
        String fournisseur=recap.getFournisseur();
        float quantity=recap.getQuantiteAjout();
        float prixU=recap.getPrixU();
        float montant=recap.getMontantTotal();

        achatService.addAchat(date,heur,nomProduit,fournisseur,quantity,prixU,montant);
        System.out.println("achat added successfully");

    }
    @GetMapping("/Achats")
    public List<Achat> getAchats(){
        return achatService.getAllAchats();
    }

    @GetMapping("/AchatsDuMois")
    public List<Achat> getAchatMois(){
        return achatService.getAllAchats();
    }

    @DeleteMapping("/Achat/delete/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id) {
        achatService.deleteAchat(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping ("/Achat/{id}")
    public Achat getAchat(@PathVariable Long id){
        System.out.println("l identifier est:"+id);
        return achatService.getById(id);
    }

    @PutMapping("/achat/update/{id}")
    public  ResponseEntity updateAchat(@PathVariable Long id,@RequestBody Achat achat){
       System.out.println("the callback is ready"+achat);
        Achat currentAchat=achatService.getById(id);

        currentAchat.setDate(achat.getDate());
        currentAchat.setHeur(achat.getHeur());
        currentAchat.setNomProduit(achat.getNomProduit());
        currentAchat.setFournisseur(achat.getFournisseur());
        currentAchat.setQuantity(achat.getQuantity());
        currentAchat.setPrixU(achat.getPrixU());
        currentAchat.setMontant(achat.getMontant());
        currentAchat=achatService.saveAchat(currentAchat);

        return ResponseEntity.ok(currentAchat);

    }
}
