package pfaProject.gestionStation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.ChiffreDuMois;
import pfaProject.gestionStation.repositories.chiffreDuMoisRepo;

import java.util.List;


@Service
public class chiffreDuMoisServiceImplement implements chiffreDuMoisServie{

    @Autowired
    private chiffreDuMoisRepo chiffreMoisRepo;

    @Override
    public ChiffreDuMois saveChiffreDuMois(ChiffreDuMois chiffre) {
        return chiffreMoisRepo.save(chiffre);
    }

    @Override
    public void deleteChiffreDuMois(Long id) {
        ChiffreDuMois chiffre=chiffreMoisRepo.getById(id);
         chiffreMoisRepo.delete(chiffre);
    }

    @Override
    public List<ChiffreDuMois> getAll() {
        return chiffreMoisRepo.findAll();
    }

    @Override
    public ChiffreDuMois getById(Long id) {
        return chiffreMoisRepo.getById(id);
    }

    @Override
    public ChiffreDuMois updateChiffre(Long id, ChiffreDuMois chiffre) {
       ChiffreDuMois currentChiffre=chiffreMoisRepo.getById(id);
       currentChiffre.setAnnee(chiffre.getAnnee());
       currentChiffre.setMois(chiffre.getMois());
       currentChiffre.setJour(chiffre.getJour());
       currentChiffre.setChiffreDuMois(chiffre.getChiffreDuMois());

        return  chiffreMoisRepo.save(currentChiffre);
    }

   /* @Override
   public List<float> getChiffres() {

        List<float> listChiffres= chiffreMoisRepo.();
        return null;
    }*/
}
