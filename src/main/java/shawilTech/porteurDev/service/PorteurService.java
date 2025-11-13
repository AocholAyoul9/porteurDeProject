package shawilTech.porteurDev.service;


import shawilTech.porteurDev.entity.Porteur;
import shawilTech.porteurDev.repository.PorteurRepository;
import org.springframework.stereotype.Service;


@Service
public  class PorteurService {

    private  final PorteurRepository repository;

    public PorteurService(PorteurRepository repository) {
        this.repository = repository;
    }

    public Porteur createPorteur(Porteur p){
        return  repository.save(p);
    }

}