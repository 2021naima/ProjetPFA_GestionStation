package pfaProject.gestionStation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfaProject.gestionStation.entities.Achat;

import java.util.List;
import java.util.Optional;

@Repository
public interface achatRepo extends JpaRepository<Achat,Long> {
     List<Achat> findByDate(String date);
     Optional<Achat> findById(Long id);
     List<Achat> findByNomProduit(String nomProduit);
     List<Achat> findByFournisseur(String fournisseur);
     void deleteById(Long id);

}
