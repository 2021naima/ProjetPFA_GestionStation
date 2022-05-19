package pfaProject.gestionStation.service;
/*
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.AppUser;
import pfaProject.gestionStation.entities.role;
import pfaProject.gestionStation.repositories.appUserRepo;
import pfaProject.gestionStation.repositories.roleRepo;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class appUserServiceImplement implements appUserService , UserDetailsService {

    private final appUserRepo userRepo;
    private final roleRepo roleRepo;
    private final PasswordEncoder passwordEncoder;
    @Override
    public AppUser saveUser(AppUser user) {
        log.info("saving new user {}", user.getName());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    @Override
    public role saveRole(role role) {
        log.info("saving new role {}", role.getNom());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("adding role {} to user {} ", roleName,username);
      AppUser user= userRepo.findByUsername(username);
      role role=roleRepo.findByNom(roleName);
      user.getRoles().add(role);
    }

    @Override
    public AppUser getAppUser(String username) {
        log.info("fetching user {}",username);
        return userRepo.findByUsername(username);
    }

    @Override
    public role getRole(String roleName) {
        log.info("fetching role ", roleName);
        return roleRepo.findByNom(roleName);
    }

    @Override
    public List<AppUser> getUsers() {
        log.info("fetching all users");
        return userRepo.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user=userRepo.findByUsername(username);
        if(user==null){
            log.error("user not found in database: {}",username);
            throw new UsernameNotFoundException("use not found in database");
        }else{
            log.info("user found in th database:", username);
        }
        Collection<SimpleGrantedAuthority> authorities=new ArrayList<>();
        user.getRoles().forEach(role->{
            authorities.add(new SimpleGrantedAuthority(role.getNom()));
        });
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);

    }
}
*/