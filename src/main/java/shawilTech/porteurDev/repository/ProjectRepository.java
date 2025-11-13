package shawilTech.porteurDev.repository;
import org.springframework.stereotype.Repository;
import shawilTech.porteurDev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import shawilTech.porteurDev.entity.Projet;

import java.util.List;

@Repository
public  interface ProjectRepository  extends  JpaRepository<Projet, Long>{
    List<Projet> findByPorteurId(Long porteurId);
}