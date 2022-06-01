package org.springframework.samples.petclinic.vets;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class VetsService {

    private final VetRepository vets;

    public VetsService(VetRepository vets) {
        this.vets = vets;
    }

    public Collection<VetsDTO> allVets() {
        return this.vets.findAll().stream()
            .map(this::mapDto)
            .collect(Collectors.toList());
    }

    private <R> VetsDTO mapDto(Vet vet) {
        String[] specialties = vet.getSpecialties().stream()
            .map(specialty -> specialty.getName())
            .toArray(value -> new String[value]);
        return new VetsDTO(vet.getFirstName(), vet.getLastName(), specialties);
    }
}
