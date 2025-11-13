package shawilTech.porteurDev.repository;
import shawilTech.porteurDev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import shawilTech.porteurDev.entity.Porteur;

public  interface PorteurRepository extends  JpaRepository<Porteur, Long>{ }