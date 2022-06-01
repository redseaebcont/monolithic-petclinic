package org.springframework.samples.petclinic.vets;

import org.springframework.web.client.RestTemplate;

import javax.annotation.OverridingMethodsMustInvokeSuper;
import java.util.Arrays;
import java.util.List;

public class VetsClient implements VetService{
    private final String url;

    public VetsClient(String url) {
        this.url = url;
    }


    @Override
    public List<VetDto> allVets() {
        //Here is the outgoing request
        RestTemplate rest = new RestTemplate();
        VetDto[] vets = rest.getForObject("http://localhost:8001/vets", VetDto[].class);
        return Arrays.asList(vets);
    }
}
