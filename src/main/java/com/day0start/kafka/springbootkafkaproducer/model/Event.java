package com.day0start.kafka.springbootkafkaproducer.model;

public class Event {
    private String name;
    private String eventClass;
    private String eventSource;

    public Event(String name, String eventClass, String eventSource) {
        this.name = name;
        this.eventClass = eventClass;
        this.eventSource = eventSource;
    }

}
