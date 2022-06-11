package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.fournisseur;
import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.repositories.fournisseurRepo;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/fournisseur")
public class fournisseurController {
    @Autowired
    private fournisseurRepo fournisserRepository ;
    @GetMapping("/fournisseurs")
    public List<fournisseur> getFournisseur(){
        return fournisserRepository.findAll();
    }
    @PostMapping("/addFournisseur")
    public List<fournisseur> createFournisseur(@RequestBody fournisseur fournisseur){
        fournisserRepository.save(fournisseur);
      return fournisserRepository.findAll();
    }
    @PutMapping("/update/{id}")
    public ResponseEntity updateFournisseur(@PathVariable Long id, @RequestBody fournisseur fournisseur) {
        fournisseur currentfournisseur = fournisserRepository.findById(id).orElseThrow(RuntimeException::new);
        currentfournisseur.setRaisonSocial(fournisseur.getRaisonSocial());
        currentfournisseur.setTel(fournisseur.getTel());
        currentfournisseur.setAdresse(fournisseur.getAdresse());
        currentfournisseur = fournisserRepository.save(fournisseur);

        return  ResponseEntity.ok(currentfournisseur);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletefournisseur(@PathVariable Long id) {
        fournisserRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/count")
    public Long nbrFournisseurs(){
        return fournisserRepository.count();
    }
}
