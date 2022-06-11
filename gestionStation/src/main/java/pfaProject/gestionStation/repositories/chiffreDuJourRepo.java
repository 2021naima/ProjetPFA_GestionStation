package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfaProject.gestionStation.entities.ChiffreDuJour;
@Repository
public interface chiffreDuJourRepo extends JpaRepository<ChiffreDuJour,Long> {

}
