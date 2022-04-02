package pfaProject.gestionStation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfaProject.gestionStation.entities.employe;

@Repository
public interface employeRepo  extends JpaRepository<employe,Long> {
}
