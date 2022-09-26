package com.example.springmvc;


import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor //lombok 어노테이션을 사용하면 컴파일 시점에
public class Event {

    private String name;

    private int listOfEnrollment;

    private LocalDateTime startDataTime;

    private LocalDateTime endDataTime;
}
