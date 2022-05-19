package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.Achat;
import pfaProject.gestionStation.entities.Recap;


public interface RecapRepo extends JpaRepository<Recap,Long> {
}
