package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import pfaProject.gestionStation.entities.employe;

import java.util.Optional;

@Repository
public interface employeRepo  extends JpaRepository<employe,Long> {
    Optional<employe> findById(Long id);
}
