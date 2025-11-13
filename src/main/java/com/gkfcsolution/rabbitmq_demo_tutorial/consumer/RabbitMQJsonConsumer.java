package com.gkfcsolution.rabbitmq_demo_tutorial.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.gkfcsolution.rabbitmq_demo_tutorial.dto.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RabbitMQJsonConsumer {

    @RabbitListener(queues = "${spring.rabbitmq.queue-name-json}")
    public void consumeJsonMessage(User user) {
        log.info("Received JSON message from RabbitMQ: {}", user);
    }
}
