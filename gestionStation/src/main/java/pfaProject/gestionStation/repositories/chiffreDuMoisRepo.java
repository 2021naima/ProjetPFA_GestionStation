package pfaProject.gestionStation.repositories;

import antlr.collections.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pfaProject.gestionStation.entities.ChiffreDuMois;

@Repository
public interface chiffreDuMoisRepo extends JpaRepository<ChiffreDuMois,Long> {
    //@Query("SELECT chiffreDuMois FROM ChiffreDuMois")
   // List<float> chiffresDuMois();

}
