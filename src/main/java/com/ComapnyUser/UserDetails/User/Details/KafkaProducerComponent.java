package com.ComapnyUser.UserDetails.User.Details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerComponent {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaProducerComponent(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(String message) {
        kafkaTemplate.send("This is Kafka Producer", message);
    }
}
