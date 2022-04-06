package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.fournisseur;
import pfaProject.gestionStation.entities.user;
import pfaProject.gestionStation.repositories.fournisseurRepo;
import pfaProject.gestionStation.repositories.userRepo;

import java.util.List;

@RestController
@RequestMapping("/api/station")
public class userContreoler   {
    @Autowired
    private userRepo UserRepo ;
    @GetMapping("/users")
    public List<user> getUser(){
        return UserRepo.findAll();
    }
    @PostMapping("/addUser")
    public List<user> createUser(@RequestBody user User){
        UserRepo.save(User);
        return UserRepo.findAll();
    }
}
