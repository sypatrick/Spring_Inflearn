package com.example.inflearn_study;

import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        var ctx = new ClassPathXmlApplicationContext("app.xml");

        Resource resource = resourceLoader.getResource("classpath:test.txt");


        Path path = Paths.get(resource.getURI());


        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
        System.out.println(Files.readAllLines(path));  // java11 버전에선 readString메소드 사용

    }
}
