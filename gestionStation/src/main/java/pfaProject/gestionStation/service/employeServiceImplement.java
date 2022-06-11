package pfaProject.gestionStation.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pfaProject.gestionStation.entities.employe;
import pfaProject.gestionStation.repositories.employeRepo;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class employeServiceImplement implements employeService {
      private final employeRepo employeRepo;



  @Override
  public employe findById(Long id) {
    employeRepo.findById(id);
    return null;
  }

  @Override
  public Long count() {
    return employeRepo.count();
  }

}
