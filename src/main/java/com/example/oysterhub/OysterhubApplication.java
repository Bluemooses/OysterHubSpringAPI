package com.example.oysterhub;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class OysterhubApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OysterhubApplication.class, args);
        int[] myIntArray = new int[10];

        for(int i = 0; i<myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }

        for(int i=0; i<10; i++){
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }
    @GetMapping("/")
    public String sayGoodbye(@RequestParam(value="myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
