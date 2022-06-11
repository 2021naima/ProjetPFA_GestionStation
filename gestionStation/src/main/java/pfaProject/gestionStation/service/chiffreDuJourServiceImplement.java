package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.ChiffreDuJour;
import pfaProject.gestionStation.entities.ChiffreDuMois;
import pfaProject.gestionStation.repositories.chiffreDuJourRepo;

import java.util.List;
@Service
public class chiffreDuJourServiceImplement implements chiffreDuJourService{
    @Autowired
    private chiffreDuJourRepo chiffreDuJourRepo;

    @Override
    public ChiffreDuJour saveChiffreDuJour(ChiffreDuJour chiffre) {
        return chiffreDuJourRepo.save(chiffre);
    }

    @Override
    public void deleteChiffreDuJour(Long id) {
        chiffreDuJourRepo.deleteById(id);
    }

    @Override
    public List<ChiffreDuJour> getAll() {
        return chiffreDuJourRepo.findAll();
    }

    @Override
    public ChiffreDuJour getById(Long id) {
        return chiffreDuJourRepo.getById(id);
    }

    @Override
    public ChiffreDuJour updateChiffre(Long id, ChiffreDuJour chiffre) {
        ChiffreDuJour currentChiffre=chiffreDuJourRepo.getById(id);
        currentChiffre.setAnnee(chiffre.getAnnee());
        currentChiffre.setMois(chiffre.getMois());
        currentChiffre.setJour(chiffre.getJour());
        currentChiffre.setTotalAchats(chiffre.getTotalAchats());
        currentChiffre.setTotalVentes(chiffre.getTotalVentes());
        currentChiffre.setChiffreDuJour(chiffre.getChiffreDuJour());

        return chiffreDuJourRepo.save(currentChiffre) ;
    }
}
