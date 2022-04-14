package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.employe;
import pfaProject.gestionStation.employeRepo;
import pfaProject.gestionStation.entities.produit;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/employees")
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
    @PutMapping("/update/{id}")
    public ResponseEntity updateEmployee(@PathVariable Long id, @RequestBody employe employe) {
        employe currentEmploye = employeRepo.findById(id).orElseThrow(RuntimeException::new);
        currentEmploye.setNom(employe.getNom());
        currentEmploye.setPrenom(employe.getPrenom());
        currentEmploye.setTel(employe.getTel());

        currentEmploye = employeRepo.save(employe);

        return  ResponseEntity.ok(currentEmploye);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteEmploye(@PathVariable Long id) {
        employeRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
