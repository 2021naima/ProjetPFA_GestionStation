package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pfaProject.gestionStation.entities.citerne;

import pfaProject.gestionStation.repositories.citerneRepo;
import pfaProject.gestionStation.service.citerneServImpl;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/citerne")
public class citerneController {
    @Autowired
    private citerneRepo citernRepo ;
    @Autowired
    private citerneServImpl citerneService;
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
       System.out.println("from"+currentCiterne);

       currentCiterne.setCode(citerne.getCode());
       currentCiterne.setCapacite(citerne.getCapacite());
       currentCiterne.setProduit(citerne.getProduit());
       currentCiterne.setStockRestant(citerne.getStockRestant());
       currentCiterne = citernRepo.save(citerne);
       System.out.println("to"+currentCiterne);
        return  ResponseEntity.ok(currentCiterne);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCiterne(@PathVariable Long id) {
        citernRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/{id}")
    public citerne getCiteneById(@PathVariable Long id){
        System.out.println("voici la citerne"+citerneService.getById(id));
        return citerneService.getById(id);
    }
}
