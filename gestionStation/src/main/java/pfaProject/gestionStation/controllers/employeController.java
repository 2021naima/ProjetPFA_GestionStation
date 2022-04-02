package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.employe;
import pfaProject.gestionStation.employeRepo;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/station")
public class employeController {
    @Autowired
    private employeRepo employeRepo ;
    @GetMapping("/employees")
    public List<employe> getEmploye(){
     return employeRepo.findAll();
    }
    @PostMapping("/AddEmp")
    public List<employe> addEmploye (@RequestBody employe emp){
         employeRepo.save(emp);
        return employeRepo.findAll();
    }

}
