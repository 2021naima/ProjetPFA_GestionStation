package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pfaProject.gestionStation.entities.Vente;

import java.util.List;
import java.util.Optional;

public interface VenteRepo  extends JpaRepository<Vente,Long> {
    List<Vente> findByDate(String date);
    Optional<Vente> findById(Long id);
    public void deleteById(Long id);
}
