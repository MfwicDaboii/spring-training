package com.topdogs.training.controller;

import com.topdogs.training.model.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MessageController.class)
class MessageControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockitoBean
//    private MessageRepository messageRepository;
//
//    @Test
//    public void testgetMessage_GetMessageSuccesfully() throws Exception {
//        when(messageRepository.findById(1L)).thenReturn(Optional.of(new Message("succes!")));
//
//        mockMvc.perform(get("/messages/1"))
//                .andExpect(status().is2xxSuccessful());
//    }
//
//    @Test
//    public void testgetMessage_GetNonExistingMessage() throws Exception {
//        when(messageRepository.findById(1L)).thenReturn(Optional.empty());
//
//        mockMvc.perform(get("/message/1"))
//                .andExpect(status().is4xxClientError());
//
//        ;
//    }
}