package com.ComapnyUser.UserDetails.User.Details;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerComponent {

    @KafkaListener(topics = "This is Kafka Consumer")
    public void consume(ConsumerRecord<String, String> record) {
        String message = record.value();
        // Process the received message
        System.out.println("Received message: " + message);
    }

}
