package org.springframework.samples.petclinic.vets;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VetsService {

    private final VetRepository vets;

    public VetsService(VetRepository vets) {
        this.vets = vets;
    }

    public Collection<Vet> allVets() {
        return this.vets.findAll();
    }
}
