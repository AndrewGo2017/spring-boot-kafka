package ru.example.springbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import ru.example.springbootkafka.model.User;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootKafkaApplication {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public static final String TOPIC = "kafka-example";

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaApplication.class, args);
    }



    @PostConstruct
    public void init(){
        kafkaTemplate.send(TOPIC, new User("name 3", "password 3"));
    }

}
