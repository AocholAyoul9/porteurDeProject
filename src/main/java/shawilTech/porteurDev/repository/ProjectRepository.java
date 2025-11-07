package shawiltech.com.porteurdev.repository;
import com.example.projecttodev.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public  interface ProjectRepository  extends  JpaRepository<Project, Long{
    List<Projet> findByPorteurId(Long porteurId);
}