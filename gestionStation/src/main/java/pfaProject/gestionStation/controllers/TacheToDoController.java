package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.produit;
import pfaProject.gestionStation.entities.tache;
import pfaProject.gestionStation.repositories.TacheRepository;


import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/ToDo")
public class TacheToDoController {
    @Autowired
    private TacheRepository tachRepo ;
    @PostMapping("/createToDoItem")
    public tache createTodo(@RequestBody tache maTache){
        System.out.println("tache created");
      tachRepo.save(maTache);
      tache tache=maTache;
        return tache;
    }
    @GetMapping("/taches")
    public List<tache> getTache(){
        return tachRepo.findAll();
    }
}
