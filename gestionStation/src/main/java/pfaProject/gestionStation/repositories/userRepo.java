package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.user;


public interface userRepo extends JpaRepository<user,Long> {
}
