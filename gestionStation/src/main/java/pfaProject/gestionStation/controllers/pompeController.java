package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.pompe;
import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.repositories.pompeRepo;


import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/pompe")
public class pompeController {
    @Autowired
    private pompeRepo pompeRepo;
    @GetMapping("/pompes")
    public List<pompe> getPompe(){
        return pompeRepo.findAll();
    }
    @PostMapping("/AddPompe")
    public List<pompe> addPompe (@RequestBody pompe Pompe){
        pompeRepo.save(Pompe);
        return pompeRepo.findAll();
    }
    @PutMapping("/update/{id}")
    public ResponseEntity updatePompe(@PathVariable Long id, @RequestBody pompe pompe) {
        pompe currentPompe = pompeRepo.findById(id).orElseThrow(RuntimeException::new);
        currentPompe.setIdPompe(pompe.getIdPompe());
      //  currentPompe.setType(produit.getType());
       // currentPompe.setPrixU(produit.getPrixU());
       // currentPompe.setQuantiteRestante(produit.getQuantiteRestante());
        currentPompe = pompeRepo.save(pompe);

        return  ResponseEntity.ok(currentPompe);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePompe(@PathVariable Long id) {
        pompeRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
