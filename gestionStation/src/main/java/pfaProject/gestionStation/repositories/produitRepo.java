package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.produit;

import java.util.Optional;


public interface produitRepo  extends JpaRepository<produit,Long> {
public Optional<produit> findById(Long id);
}
