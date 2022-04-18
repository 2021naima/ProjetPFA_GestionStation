package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.toDo;

public interface toDoRepository extends JpaRepository<toDo,Long> {

}
