package org.springframework.samples.petclinic.vets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class VetsRestController {

    @Autowired
    private VetsService service;

    @GetMapping("/vetsnew")
    Collection<VetsDTO> getAllVets() {
        return service.allVets();
    }
}
