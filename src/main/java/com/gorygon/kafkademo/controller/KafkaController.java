package com.gorygon.kafkademo.controller;

import com.gorygon.kafkademo.model.Message;
import com.gorygon.kafkademo.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private Producer producer;

    @PostMapping("/publish")
    public void publish(@RequestBody Message message) {
        producer.sendMessage(message);
    }

}
