package com.example.testingTutorilApril;



import lombok.AllArgsConstructor;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

public class CalculatorTests {

    Calculator calculator = new Calculator();

    @BeforeAll
    public static void setup() {
        System.out.println("This runs before all the tests of this class");
    }

    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("This runs before every test");
    }

    @Test
    public void testAddSWhenNumbersArePositive() {
        System.out.println("test add function");
        int result = calculator.add(5,6);
        int expected = 11;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testAddSWhenNumbersAreNegative() {
        int result = calculator.add(-5,-6);
        int expected = -11;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10,5);
        int expected = 5;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testMultiply() {
        System.out.println("test multiply");
        int result = calculator.multiply(10,5);
        int expected = 50;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testAddManyNumbers() {
        int result = calculator.addManyNumbers(1,2,3,4);
        int expected = 10;
        Assertions.assertEquals(result,expected);
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("This runs after all the test");
    }

}

//In JUnit 5, @BeforeAll is an annotation used to signal that a method in a test class should be executed
// before all test methods in that class. This annotation is part of the JUnit Jupiter API, which is the
// testing framework used in JUnit 5 for writing tests in Java.
//In JUnit 5, @BeforeEach is an annotation used to signal that a method in a test class should be executed
// before each test method in that class. This annotation is part of the JUnit Jupiter API, which is the
// testing framework used in JUnit 5 for writing tests in Java.
//In JUnit 5, @AfterAll is an annotation used to signal that a method in a test class should be executed
// after all test methods in that class have completed their execution. This annotation is part of the JUnit
// Jupiter API, which is the testing framework used in JUnit 5 for writing tests in Java.
//The @Test annotation in JUnit 5 is used to mark a method as a test method. This annotation is part of the
// JUnit Jupiter API, which is the testing framework used in JUnit 5 for writing tests in Java.
//beforeAll() and beforeEach() must be static because they are executed before any instances of ExampleTest
// are created. If they were non-static, they would require an instance of ExampleTest, which would not be
// available until after these methods are executed, causing a circular dependency.
//The assertEquals method is used in JUnit and other testing frameworks to compare two values for equality.
// It's often used to verify that the actual value returned by a method matches the expected value.
// Here's how you typically use assertEquals: