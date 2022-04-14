package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.facture;

import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.repositories.factureRepo;


import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/factures")
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
    @PutMapping("/update/{id}")
    public ResponseEntity updateFacture(@PathVariable Long id, @RequestBody facture facture) {
        facture currentFacture = factureRepo.findById(id).orElseThrow(RuntimeException::new);
        currentFacture.setDateFacture(facture.getDateFacture());
        currentFacture.setQuantiteProduit(facture.getQuantiteProduit());
        currentFacture.setMontant(facture.getMontant());
        currentFacture = factureRepo.save(facture);
        return  ResponseEntity.ok(currentFacture);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteFacture(@PathVariable Long id) {
        factureRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
