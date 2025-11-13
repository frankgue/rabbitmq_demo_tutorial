package com.gkfcsolution.rabbitmq_demo_tutorial.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RabbitMQProducer {

    @Value("${spring.rabbitmq.exchange-name}")
    private String exchangeName;
    @Value("${spring.rabbitmq.routing-key}")
    private String routingKey;

    private RabbitTemplate rabbitTemplate;
    public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
        log.info("Message sent: {}", message);
    }
}
