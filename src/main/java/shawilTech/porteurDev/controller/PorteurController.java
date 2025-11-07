package shawiltech.com.porteurdev.controller;
import shawiltech.com.porteurdev.entity.Porteur;
import shawiltech.com.porteurdev.dto.PorteurDto;
import shawiltech.com.porteurdev.service.PorteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@ResquestMapping("/api/porteurs")
@RequiredArgsConstructor

public class PorteurController {

    private  final PorteurService porteurService;

    @PostMapping
    public  PorteurDto create(@RequestBody PorteurDto porteurDto){
        return  porteurService.createPorteur(porteurDto);
    }
}