package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.produit;


public interface produitRepo  extends JpaRepository<produit,Long> {

}
