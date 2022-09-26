package com.example.springmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {

        Event event1 = Event.builder()
                .name("Spring Web MVC Study")
                .listOfEnrollment(5)
                .startDataTime(LocalDateTime.of(2022,10,6,9,0))
                .endDataTime(LocalDateTime.of(2022,10,6,12,0))
                .build();

        Event event2 = Event.builder()
                .name("Spring Web MVC Study")
                .listOfEnrollment(5)
                .startDataTime(LocalDateTime.of(2022,10,13,9,0))
                .endDataTime(LocalDateTime.of(2022,10,13,12,0))
                .build();

        return List.of(event1, event2);
    }
}
