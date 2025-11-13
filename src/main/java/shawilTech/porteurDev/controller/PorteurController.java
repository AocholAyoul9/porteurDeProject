package shawilTech.porteurDev.controller;
import shawilTech.porteurDev.dto.PorteurDto;
import shawilTech.porteurDev.service.PorteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/porteurs")
public class PorteurController {

    private  final PorteurService porteurService;

    public PorteurController(PorteurService porteurService) {
        this.porteurService = porteurService;
    }

    @PostMapping
    public PorteurDto create(@RequestBody PorteurDto porteurDto){
        return  porteurService.createPorteur(porteurDto);
    }
}