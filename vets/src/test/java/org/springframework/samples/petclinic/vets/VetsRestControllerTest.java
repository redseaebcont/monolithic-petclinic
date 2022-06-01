package org.springframework.samples.petclinic.vets;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class VetsRestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    VetsService vetsService;
    @Disabled
    @Test
    void receive_hello_world() throws Exception {
        mockMvc.perform(get("/vetsnew"))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
            .andExpect(jsonPath("$.version").value("0.1"))
            .andDo(MockMvcResultHandlers.print());
//            .andExpect(jsonPath("$.message").value(vetsService.allVets()));
    }
}
