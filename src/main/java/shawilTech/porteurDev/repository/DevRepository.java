package shawilTech.porteurDev.repository;
import org.springframework.stereotype.Repository;
import shawilTech.porteurDev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public  interface DevRepository extends  JpaRepository<Dev, Long>{
}