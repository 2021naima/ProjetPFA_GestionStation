package pfaProject.gestionStation.service;

import pfaProject.gestionStation.entities.Vente;

import java.util.List;

public interface VenteService {
    public List<Vente> getAll();
    public Vente saveVente(Vente vente);
    public  Vente findById(Long id);
    public  void deleteById(Long id);
    public Vente updateVente(Long id,Vente vente);
}
