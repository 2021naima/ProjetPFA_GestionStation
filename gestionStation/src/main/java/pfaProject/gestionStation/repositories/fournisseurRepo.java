package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pfaProject.gestionStation.entities.fournisseur;

public interface fournisseurRepo extends JpaRepository<fournisseur,Long> {
}
