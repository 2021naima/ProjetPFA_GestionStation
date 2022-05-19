package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.carburant;


public interface carburantRepo extends JpaRepository<carburant,Long> {
    carburant findByNomProduit(String nomProduit);
}
