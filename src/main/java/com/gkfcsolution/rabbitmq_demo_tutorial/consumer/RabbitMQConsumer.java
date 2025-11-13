package com.gkfcsolution.rabbitmq_demo_tutorial.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RabbitMQConsumer {

    @RabbitListener(queues = "${spring.rabbitmq.queue-name}")
    public void consumeMessage(String message) {
        log.info("Received message from RabbitMQ: {}", message);
    }

}
