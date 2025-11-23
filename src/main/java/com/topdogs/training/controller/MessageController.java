package com.topdogs.training.controller;

import com.topdogs.training.model.Message;
import com.topdogs.training.repository.MessageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MessageController {
   // private final MessageRepository messageRepository;

//    @GetMapping("/messages/{id}")
//    public String getMessage(@PathVariable Long id) throws Exception {
//        Optional<Message> message = messageRepository.findById(id);
//        if(!message.isPresent()){
//            throw new Exception("Alles gaat fout");
//        }
//
//        return message.get().getContent();
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorResponse> handleNotFound(Exception ex){
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body(new ErrorResponse("NOT_FOUND", ex.getMessage()));
//    }
}
