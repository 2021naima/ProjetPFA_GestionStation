package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.facture;


public interface factureRepos extends JpaRepository<facture,Long> {
}
