package shawiltech.com.porteurdev.service;

import shawiltech.com.porteurdev.entity.Porteur;
import shawiltech.com.porteurdev.dto.PorteurDto;

import shawiltech.com.porteurdev.repository.PorteurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public  class PorteurService {

    private  final  PorteurRepository repository;

    public  PorteurDto createPorteur(PorteurDto p){
        return  repository.save(p);
    }

}