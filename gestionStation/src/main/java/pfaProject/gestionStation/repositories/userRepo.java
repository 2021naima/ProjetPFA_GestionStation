package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pfaProject.gestionStation.entities.utilisateur;


public interface userRepo extends JpaRepository<utilisateur,Long> {
}
