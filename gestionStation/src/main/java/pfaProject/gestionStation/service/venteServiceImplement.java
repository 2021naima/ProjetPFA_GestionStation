package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.Vente;
import pfaProject.gestionStation.repositories.VenteRepo;

import java.util.List;
@Service
public class venteServiceImplement implements VenteService{
    @Autowired
    private VenteRepo venteRepo;
    @Autowired
    private citerneServImpl citernService;
    @Override
    public List<Vente> getAll() {
        return venteRepo.findAll();
    }

    @Override
    public Vente saveVente(Vente vente) {
        return venteRepo.save(vente);
    }

    @Override
    public Vente findById(Long id) {
        return venteRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public void deleteById(Long id) {
         venteRepo.deleteById(id);
    }

    @Override
    public Vente updateVente(Long id, Vente vente) {
        Vente currentVente=venteRepo.findById(id).orElseThrow(RuntimeException::new);
        citernService.retrancherStock(currentVente.getCodeVolucompteur(),currentVente.getQuantiteVendu());
        currentVente.setDate(vente.getDate());
        currentVente.setHeur(vente.getHeur());
        currentVente.setCodeVolucompteur(vente.getCodeVolucompteur());
        currentVente.setNomProduit(vente.getNomProduit());
        currentVente.setClient(vente.getClient());
        currentVente.setQuantiteVendu(vente.getQuantiteVendu());
        currentVente.setPrixU(vente.getPrixU());
        currentVente.setMontant(vente.getMontant());
        currentVente=venteRepo.save(currentVente);

        citernService.AddStock(vente.getCodeVolucompteur(),vente.getQuantiteVendu());
        return currentVente;
    }
}
