package com.example.gym_web_project1.adapters.in.web;

import com.example.gym_web_project1.application.usecase.GymUseCase;
import com.example.gym_web_project1.domain.Gym;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest(GymController.class)
class GymControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    GymUseCase gymUseCase;

    @Test
    void testSaveGym_Success() throws Exception {
        Gym gym = new Gym();
        gym.setGymType("alexa");

        when(gymUseCase.saveGymType(any())).thenReturn("GymType is saved successfully");

        mockMvc.perform(
                        post("/save")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"gymType\":\"alexa\"}")
                )
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("GymType is saved successfully"));

        verify(gymUseCase, times(1)).saveGymType(any());
    }



}
