package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pfaProject.gestionStation.entities.utilisateur;
import pfaProject.gestionStation.repositories.userRepo;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
public class userContreoler   {
    @Autowired
    private userRepo UserRepo ;
    @GetMapping("/users")
    public List<utilisateur> getUser(){
        return UserRepo.findAll();
    }
    @PostMapping("/addUser")
    public List<utilisateur> createUser(@RequestBody utilisateur User){
        UserRepo.save(User);
        return UserRepo.findAll();
    }
}
