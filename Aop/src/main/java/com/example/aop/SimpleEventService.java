package com.example.aop;


import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{  // RealSubject

    @Override
    public void createEvent(){

     //   long begin = System.currentTimeMillis();   // Cross Concern , publishEvent와 중복되는 내용.

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Created an event");

      //  System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent(){

     //   long begin = System.currentTimeMillis();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Published an event");

     //   System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void delete(){
        System.out.println("Delete");
    }
}
