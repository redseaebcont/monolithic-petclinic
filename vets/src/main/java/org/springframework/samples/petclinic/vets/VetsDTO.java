package org.springframework.samples.petclinic.vets;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class VetsDTO {

    private String firstName;
    private String lastName;
    private List<String> specialtyName;
    private Integer nrOfSpecialties;

    public VetsDTO(String firstName, String lastName, String[] specialties) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialtyName = asList(specialties);
        this.nrOfSpecialties = specialties.length;
    }

    @Override
    public String toString() {
        return "VetsDTO{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", specialtieName=" + specialtyName +
            ", nrOfSpecialties='" + nrOfSpecialties + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VetsDTO vetsDTO = (VetsDTO) o;
        return Objects.equals(firstName, vetsDTO.firstName) && Objects.equals(lastName, vetsDTO.lastName) && Objects.equals(specialtyName, vetsDTO.specialtyName) && Objects.equals(nrOfSpecialties, vetsDTO.nrOfSpecialties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, specialtyName, nrOfSpecialties);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getSpecialtyName() {
        return specialtyName;
    }

    public Integer getNrOfSpecialties() {
        return nrOfSpecialties;
    }
}
