package shawilTech.porteurDev.service;
import  shawilTech.porteurDev.entity.*;


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

    public  Projet createProject(Long porteurId, Projet project){

        Porteur  porteur = porteurRepository.findById(porteurId)
                .orElseThrow(()-> new RuntimeException("Porteur not foud"));

        project.setPorteur(porteur);

        return  projectRepository.save(project);
    }

    public  List<Candidature> listCandidatures(Long projectId){
        return  candidatureRepository.findByProjet_Id(projectId);
    }

    

    public  Candidature acceptCandidature(Long candidatureId){
        Candidature candidature = candidatureRepository.findById(candidatureId)
                .orElseThrow(()-> new RuntimeException("Candidature not found"));
        candidature.setStatut("ACCEPTEE");

        return  candidatureRepository.save(candidature);
    }

    public  Candidature refusCandidature(Long candidatureId){
        Candidature candidature = candidatureRepository.findById(candidatureId)
                .orElseThrow(()-> new RuntimeException("Candidature not found"));
        candidature.setStatut("REFUSEE");

        return  candidatureRepository.save(candidature);
    }
}