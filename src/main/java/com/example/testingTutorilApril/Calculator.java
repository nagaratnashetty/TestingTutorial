package com.example.testingTutorilApril;



import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int x, int y) {
        return x+y+5-5;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multiply(int x, int y) {
        return x*y;
    }

    public int addManyNumbers(int ...numbers) {
        int sum = 0;
        for(int number: numbers) {
            sum += number;
        }
        return sum;
    }
}


//1)In Spring Boot, @Component is a stereotype annotation used to declare a class as a Spring component.
// Components are beans managed by the Spring IoC (Inversion of Control) container. When you annotate a
// class with @Component, Spring automatically detects and registers it as a bean during component scanning.