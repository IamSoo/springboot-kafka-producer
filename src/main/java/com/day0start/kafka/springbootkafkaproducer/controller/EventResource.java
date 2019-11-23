package com.day0start.kafka.springbootkafkaproducer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class EventResource {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC="kafka_topic";

    @GetMapping("/")
    public String getStatus(){
        return "I am running.!";
    }

    @GetMapping("/publish/{message}")
    public String postMessages(@PathVariable("message") final String message){
        System.out.println("Reached Server :" + message);
        kafkaTemplate.send(TOPIC,message);
        return "Published Successfully.";
    }
}
