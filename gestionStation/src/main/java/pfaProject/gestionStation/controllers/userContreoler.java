package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.utilisateur;
import pfaProject.gestionStation.repositories.userRepo;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/user")
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
    @PutMapping("/update/{id}")
    public ResponseEntity updateUser(@PathVariable Long id, @RequestBody utilisateur user) {
        utilisateur currentuser = UserRepo.findById(id).orElseThrow(RuntimeException::new);
        currentuser.setEmail(user.getEmail());
        currentuser.setPassword(user.getPassword());
        currentuser.setNom(user.getNom());
        currentuser.setPrenom(user.getPrenom());
        currentuser = UserRepo.save(user);

        return  ResponseEntity.ok(currentuser);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        UserRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
