package shawiltech.com.porteurdev.repository;
import shawiltech.com.porteurdev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public  interface PorteurRepository extends  JpaRepository<Porteur, Long>{ }