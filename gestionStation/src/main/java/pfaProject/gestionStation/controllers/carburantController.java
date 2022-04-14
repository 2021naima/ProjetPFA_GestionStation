package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.carburant;
import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.repositories.carburantRepo;


import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/carburant")
public class carburantController {
    @Autowired
    private carburantRepo carburantRepo;
    @GetMapping("/carburants")
    public List<carburant> getCarburat(){
        return carburantRepo.findAll();
    }
    @PostMapping("/AddCarburant")
    public List<carburant> addCarburant (@RequestBody carburant Carburant){
        carburantRepo.save(Carburant);
        return carburantRepo.findAll();
    }
    @PutMapping("/update/{id}")
    public ResponseEntity updateCarburant(@PathVariable Long id, @RequestBody carburant carburant) {
        carburant currentCarburant = carburantRepo.findById(id).orElseThrow(RuntimeException::new);
        currentCarburant.setNomProduit(carburant.getNomProduit());
        currentCarburant.setQuantite(carburant.getQuantite());
        currentCarburant.setPrixU(carburant.getPrixU());
        currentCarburant = carburantRepo.save(carburant);

        return  ResponseEntity.ok(currentCarburant);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCarburant(@PathVariable Long id) {
        carburantRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
