package shawiltech.com.porteurdev.controller;
import shawiltech.com.porteurdev.entity.*;
import shawiltech.com.porteurdev.dto.ProjectDto;
import shawiltech.com.porteurdev.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@ResquestMapping("/api/devs")
@RequiredArgsConstructor

public class DevController {

    private  final  DevService  devService;
    @PostMapping
    public  DevDto create(@RequestBody DevDto dev){
        return devService.create(dev);
    }

    @PostMapping("/{devId}/apply/{projectId}")
    public  CandidatureDto apply(@PathVariable Long devId, @PathVariable Long projectId){
        return  devService.applyToProject(devId, projectId);
    }
}