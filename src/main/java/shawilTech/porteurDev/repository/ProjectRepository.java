package shawilTech.porteurDev.repository;
import shawilTech.porteurDev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import shawilTech.porteurDev.entity.Projet;

import java.util.List;

public  interface ProjectRepository  extends  JpaRepository<Project, Long>{
    List<Projet> findByPorteurId(Long porteurId);
}