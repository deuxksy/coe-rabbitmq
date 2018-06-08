package coe.rabbitmq.coerabbitmq.api;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = "cluster_test")
    public void receiver(String message) {
        System.out.println(message);
    }
}
