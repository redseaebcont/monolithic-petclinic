package org.springframework.samples.petclinic.vets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class VetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VetsApplication.class, args);
    }


    //Identify the running service (vet) with url and port
    //port 8001

    //http://localhost:8001/vets ==
    // => [{"firstName":"James","lastName":"Carter","specialties":[],"nrOfSpecialties":0},{"firstName":"Helen","lastName":"Leary","specialties":["radiology"],"nrOfSpecialties":1},{"firstName":"Linda","lastName":"Douglas","specialties":["dentistry","surgery"],"nrOfSpecialties":2},{"firstName":"Rafael","lastName":"Ortega","specialties":["surgery"],"nrOfSpecialties":1},{"firstName":"Henry","lastName":"Stevens","specialties":["radiology"],"nrOfSpecialties":1},{"firstName":"Sharon","lastName":"Jenkins","specialties":[],"nrOfSpecialties":0}]
}
