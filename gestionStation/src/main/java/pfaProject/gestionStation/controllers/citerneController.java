package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pfaProject.gestionStation.entities.citerne;

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
   @PutMapping("/update/{id}")
    public ResponseEntity updateCiterne(@PathVariable Long id, @RequestBody citerne citerne) {
       citerne currentCiterne = citernRepo.findById(id).orElseThrow(RuntimeException::new);
       currentCiterne.setCode(citerne.getCode());
       currentCiterne.setCapacite(citerne.getCapacite());

       currentCiterne = citernRepo.save(citerne);

        return  ResponseEntity.ok(currentCiterne);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCiterne(@PathVariable Long id) {
        citernRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
