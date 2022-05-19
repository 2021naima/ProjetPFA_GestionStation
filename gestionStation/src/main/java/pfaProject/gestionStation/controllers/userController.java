package pfaProject.gestionStation.controllers;
/*
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfaProject.gestionStation.entities.AppUser;
import pfaProject.gestionStation.entities.role;
import pfaProject.gestionStation.service.appUserServiceImplement;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class userController {
    private final appUserServiceImplement userService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/saveuser")
    public ResponseEntity<AppUser> saveUser(@RequestBody AppUser user) {
        return ResponseEntity.ok().body(userService.saveUser(user));
    }

    @PostMapping("/saveRole")
    public ResponseEntity<role> saveRole(@RequestBody role role) {
        return ResponseEntity.ok().body(userService.saveRole(role));
    }

    @PostMapping("/addRole")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form) {
        userService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }


}

    @Data
    class RoleToUserForm{
        private String username;
        private String roleName;
    }

*/