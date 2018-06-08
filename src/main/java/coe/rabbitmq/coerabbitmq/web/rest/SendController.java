package coe.rabbitmq.coerabbitmq.web.rest;

import coe.rabbitmq.coerabbitmq.api.Receiver;
import coe.rabbitmq.coerabbitmq.api.Sender;
import coe.rabbitmq.coerabbitmq.dto.SendDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/send", produces = MediaType.APPLICATION_JSON_VALUE)
public class SendController {

    @Autowired
    private Sender sender;

    @Autowired
    private Receiver receiver;

    @PostMapping
    public void setMessages (@RequestBody SendDTO sendDTO) {
        sender.send(sendDTO.getMessage());
    }

    @GetMapping
    public List<String> getMessages () {
        receiver.receive();
        return null;
    }
}
