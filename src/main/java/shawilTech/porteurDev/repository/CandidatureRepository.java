package shawilTech.porteurDev.repository;
import org.springframework.stereotype.Repository;
import shawilTech.porteurDev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import shawilTech.porteurDev.entity.Candidature;

import java.util.List;


@Repository
public  interface CandidatureRepository extends  JpaRepository<Candidature, Long>{

    List<Candidature> findByProjectId(Long projectId);
}