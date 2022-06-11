package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.Vente;
import pfaProject.gestionStation.service.venteServiceImplement;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
public class VenteController {
    @Autowired
    private venteServiceImplement venteService;


    @GetMapping("/Ventes")
    public List<Vente> getVentes(){
        return venteService.getAll();
    }

    @PostMapping("/addVente")
    public Vente saveVente(@RequestBody Vente vente){
        return venteService.saveVente(vente);
    }

    @PutMapping("/vente/update/{id}")
    public Vente updateVente(@PathVariable Long id,@RequestBody Vente vente){
        return venteService.updateVente(id,vente);
    }

    @GetMapping("/vente/{id}")
    public Vente findById(@PathVariable Long id){
        System.out.println("vente consulte avec succés");
        return venteService.findById(id);
    }

    @DeleteMapping("/vente/delete/{id}")
    public List<Vente> deleteById(@PathVariable Long id){
        venteService.deleteById(id);
        return venteService.getAll();
    }

}
