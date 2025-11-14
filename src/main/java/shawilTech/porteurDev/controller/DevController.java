package shawilTech.porteurDev.controller;

import org.springframework.web.bind.annotation.*;
import shawilTech.porteurDev.dto.CandidatureDto;
import shawilTech.porteurDev.dto.DevDto;
import shawilTech.porteurDev.entity.Dev;
import shawilTech.porteurDev.service.DevService;

@RestController
@RequestMapping("/api/devs")
public class DevController {

    private final DevService devService;

    public DevController(DevService devService) {
        this.devService = devService;
    }

    @PostMapping
    public DevDto create(@RequestBody Dev dev){
        return devService.create(dev);
    }

    @PostMapping("/{devId}/apply/{projectId}")
    public CandidatureDto apply(@PathVariable Long devId, @PathVariable Long projectId){
        return devService.applyToProject(devId, projectId);
    }
}
