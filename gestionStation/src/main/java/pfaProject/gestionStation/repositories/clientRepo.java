package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfaProject.gestionStation.entities.Client;

@Repository
public interface clientRepo extends JpaRepository<Client,Long> {
}
