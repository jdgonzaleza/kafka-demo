package com.gorygon.kafkademo.producer;

import com.gorygon.kafkademo.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(Message message) {
        logger.info(String.format("$$ -> Producing message --> %s", message.toString()));
        kafkaTemplate.send(TOPIC, message);
    }



}
