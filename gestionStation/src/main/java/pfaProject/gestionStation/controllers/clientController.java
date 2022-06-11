package pfaProject.gestionStation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pfaProject.gestionStation.service.clientServiceImplement;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/station")
public class clientController {

    @Autowired
    private clientServiceImplement clientService;

    @GetMapping("/clients/count")
    public Long countClients(){
        return clientService.count();
    }
}
