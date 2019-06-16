package ru.example.springbootkafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.example.springbootkafka.model.User;

@Component
public class KafkaConsumerListener {

    @KafkaListener(topics = "kafkaexample", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
    public void consume(String message){
        System.out.println("consumed message " + message);
    }

    @KafkaListener(topics = "kafka-example", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user){
        System.out.println("consumed user " + user);
    }
}
