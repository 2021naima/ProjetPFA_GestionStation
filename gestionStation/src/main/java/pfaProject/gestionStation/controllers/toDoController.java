package pfaProject.gestionStation.controllers;

import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.tache;
import pfaProject.gestionStation.entities.toDo;
import pfaProject.gestionStation.service.serviceToDo;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station/toDo")
public class toDoController {
    public serviceToDo serviceToDo;



   /* @PostMapping("/createTodo")
    public toDo createTodo(@RequestBody List<tache> listTaches){
        return serviceToDo.createToDo(listTaches);
    }
*/

}
