package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.repositories.produitRepo;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/produit")
public class produitController {
    @Autowired
    private produitRepo produitRepo;
    @GetMapping("/produits")
    public List<produit> getProduit(){
        return produitRepo.findAll();
    }
    @PostMapping("/AddProduit")
    public List<produit> addEmploye (@RequestBody produit prod){
        produitRepo.save(prod);
        return produitRepo.findAll();
    }
    @PutMapping("/update/{id}")
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
    }

}
