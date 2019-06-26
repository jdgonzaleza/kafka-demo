package com.gorygon.kafkademo.consumer;

import com.gorygon.kafkademo.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Subscriber {

    private final Logger logger = LoggerFactory.getLogger(java.util.function.Consumer.class);
    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(Message message){
        logger.info(String.format("$$ -> Consumed Message -> %s",message.toString()));

    }
}
