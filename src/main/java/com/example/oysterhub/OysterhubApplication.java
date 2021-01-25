package com.example.oysterhub;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController

public class OysterhubApplication implements CommandLineRunner {
    //allows us to type input into the console.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication.run(OysterhubApplication.class, args);
        int[] myIntArray = new int[10];
        int[] myIntegers = getIntegers(5);

        for(int i = 0; i<myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);

        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + " typed values is: " + myIntegers[i]);
        }

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for(int i=0; i<10; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
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
