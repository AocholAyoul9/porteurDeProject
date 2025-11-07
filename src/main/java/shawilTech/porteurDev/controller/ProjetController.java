package shawiltech.com.porteurdev.controller;
import shawiltech.com.porteurdev.entity.*;
import shawiltech.com.porteurdev.dto.ProjectDto;
import shawiltech.com.porteurdev.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import  java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor

public  class ProjetController {

    private final  ProjectService projectService;

    @PostMapping("/{porteurId}")
    public  ProjectDto create(@PathVariable Long , @RequestBody ProjectDto project){
        return  projectService.createProject(porteurId, project)
    }

    @GetMapping("/{projectId}/canditures")
    public  List<CandidatureDto> listCandidatures(@PathVariable Long projectId){
        return  projectService.listCandidatures(projectId);
    }

    @PutMapping("/candidatures/{id}/accept")
    public  CandidatureDto accept(@PathVarible Long id){
        return  projectService.acceptCandidature(id);
    }

    @PutMapping("/candidatures/{id}/refuse")
    public Candidature refuse(@PathVariable Long id) {
        return projectService.refuseCandidature(id);
    }
}