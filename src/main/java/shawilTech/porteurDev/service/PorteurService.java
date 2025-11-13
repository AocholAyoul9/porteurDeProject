package shawilTech.porteurDev.service;

import shawilTech.porteurDev.dto.PorteurDto;
import shawilTech.porteurDev.entity.Porteur;


import shawilTech.porteurDev.repository.PorteurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public  class PorteurService {

    private  final shawiltech.com.porteurdev.repository.PorteurRepository repository;

    public PorteurDto createPorteur(PorteurDto p){
        return  repository.save(p);
    }

}