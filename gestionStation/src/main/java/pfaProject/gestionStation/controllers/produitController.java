package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.repositories.produitRepo;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
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
}
