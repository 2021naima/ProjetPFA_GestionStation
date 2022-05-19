package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfaProject.gestionStation.entities.citerne;
@Repository
public interface citerneRepo extends JpaRepository<citerne,Long> {

    citerne findByCode(String code);
}
