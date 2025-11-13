package shawilTech.porteurDev.repository;
import shawilTech.porteurDev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import shawilTech.porteurDev.entity.Candidature;

import java.util.List;


public  interface CandidatureRepository extends  JpaRepository<Candidature, Long>{

    List<Candidature> findByProjectId(Long projectId);
}