package coe.rabbitmq.coerabbitmq.api;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    RabbitMessagingTemplate rabbitMessagingTemplate;

    public Sender(RabbitMessagingTemplate rabbitMessagingTemplate) {
        this.rabbitMessagingTemplate = rabbitMessagingTemplate;
    }

    public void send(String message) {
        rabbitMessagingTemplate.convertAndSend("cluster_test", message);
    }
}
