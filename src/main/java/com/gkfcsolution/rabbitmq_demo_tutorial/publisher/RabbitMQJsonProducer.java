package com.gkfcsolution.rabbitmq_demo_tutorial.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.gkfcsolution.rabbitmq_demo_tutorial.dto.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class RabbitMQJsonProducer {
    @Value("${spring.rabbitmq.exchange-name}")
    private String exchangeName;

    @Value("${spring.rabbitmq.routing-key-json}")
    private String jsonRoutingKey;

    private final RabbitTemplate rabbitTemplate;

    public void sendJsonMessage(User user) {
        rabbitTemplate.convertAndSend(exchangeName, jsonRoutingKey, user);
        log.info("JSON Message sent: {}", user);
    }
}
