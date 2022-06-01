package org.springframework.samples.petclinic.vets;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class VetsServiceTest {

    @Autowired
    VetsService service;

    @Test
    void shouldFindVets() {
        Collection<VetsDTO> vets = service.allVets();

        assertThat(vets)
            .filteredOn(vet -> Objects.equals(vet.getLastName(), "Douglas"))
            .hasSize(1)
            .first()
            .hasFieldOrPropertyWithValue("firstName", "Linda")
            .hasFieldOrPropertyWithValue("nrOfSpecialties", 2)
            .extracting(vetsDTO -> vetsDTO.getSpecialtyName()).asList()
            .containsExactly("dentistry", "surgery");
    }
}
