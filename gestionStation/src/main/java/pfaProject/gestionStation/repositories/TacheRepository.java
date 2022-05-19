package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.tache;

import java.util.List;

public interface TacheRepository extends  JpaRepository<tache,Long> {
     List<tache> getByDayAndMounthAndYear(String day,String mounth,String year);
     List<tache> getByDayAndMounthAndYearAndHour(String day,String mounth,String year,String hour);
}
