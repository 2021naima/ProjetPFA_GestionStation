package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pfaProject.gestionStation.entities.citerne;
import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.repositories.citerneRepo;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/citerne")
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
/*    @PutMapping("/update/{id}")
    public ResponseEntity updateProduct(@PathVariable Long id, @RequestBody produit produit) {
        produit currentProduct = produitRepo.findById(id).orElseThrow(RuntimeException::new);
        currentProduct.setDesignation(produit.getDesignation());
        currentProduct.setType(produit.getType());
        currentProduct.setPrixU(produit.getPrixU());
        currentProduct.setQuantiteRestante(produit.getQuantiteRestante());
        currentProduct = produitRepo.save(produit);

        return  ResponseEntity.ok(currentProduct);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id) {
        produitRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }*/
}
