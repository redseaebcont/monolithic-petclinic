package org.springframework.samples.petclinic.vets;

import java.util.List;

public interface VetService {
    List<VetDto> allVets();
}
