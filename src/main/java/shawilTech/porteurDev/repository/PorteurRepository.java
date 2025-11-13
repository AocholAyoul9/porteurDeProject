package shawilTech.porteurDev.repository;
import org.springframework.stereotype.Repository;
import shawilTech.porteurDev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import shawilTech.porteurDev.entity.Porteur;

@Repository
public  interface PorteurRepository extends  JpaRepository<Porteur, Long>{ }