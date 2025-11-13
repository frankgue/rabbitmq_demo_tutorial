package com.gkfcsolution.rabbitmq_demo_tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gkfcsolution.rabbitmq_demo_tutorial.dto.User;
import com.gkfcsolution.rabbitmq_demo_tutorial.publisher.RabbitMQJsonProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessageJsonController {

    private final RabbitMQJsonProducer producer;

    @PostMapping("/publish-json")
    public ResponseEntity<String> publishJsonMessage(@RequestBody User user) {
        producer.sendJsonMessage(user);
        return ResponseEntity.ok("JSON message published successfully");
    }

}
