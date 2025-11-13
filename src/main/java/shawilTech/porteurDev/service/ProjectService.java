package shawilTech.porteurDev.service;

import  shawilTech.porteurDev.dto.*;

import  shawilTech.porteurDev.dto.PorteurDto;

import org.springframework.stereotype.Service;
import shawilTech.porteurDev.repository.CandidatureRepository;
import shawilTech.porteurDev.repository.DevRepository;
import shawilTech.porteurDev.repository.PorteurRepository;
import shawilTech.porteurDev.repository.ProjectRepository;

import  java.util.List;


@Service
public  class ProjectService {

    private  final ProjectRepository projectRepository;
    private  final PorteurRepository porteurRepository;
    private  final CandidatureRepository candidatureRepository;
    private  final DevRepository devRepository;

    public ProjectService(ProjectRepository projectRepository, PorteurRepository porteurRepository, CandidatureRepository candidatureRepository, DevRepository devRepository) {
        this.projectRepository = projectRepository;
        this.porteurRepository = porteurRepository;
        this.candidatureRepository = candidatureRepository;
        this.devRepository = devRepository;
    }

    public  ProjectDto createProject(Long porteurId, ProjectDto projectDto){

        PorteurDto  porteur = porteurRepository.findById(porteurId)
                .orElseThrow(()-> new RuntimeException("Porteur not foud"));
        projectDto.setPorteur(porteur);

        return  projectRepository.save(projectDto);
    }

    public  List<CandidatureDto> listCandidatures(Long projectId){
        return  candidatureRepository.findByProjectId(projectId);
    }

    public  CandidatureDto acceptCandidature(Long candidatureId){
        CandidatureDto candidature = candidatureRepository.findBy(candidatureId)
                .orElseThrow(()-> new RuntimeException("Candidature not found"));
        candidature.setStatut("ACCEPTEE");

        return  candidatureRepository.save(candidature);
    }

    public  CandidatureDto refusCandidature(Long candidatureId){
        CandidatureDto candidature = candidatureRepository.findBy(candidatureId)
                .orElseThrow(()-> new RuntimeException("Candidature not found"));
        candidature.setStatut("REFUSEE");

        return  candidatureRepository.save(candidature);
    }
}