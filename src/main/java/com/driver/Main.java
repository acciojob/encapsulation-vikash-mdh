package com.driver;

public class Main {
    public static void main(String[] args) {

        // Task 3: Create an object of class RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: Try setting a value to name by directly accessing it using obj and also try printing it
        // Uncommenting the following lines will result in an error
        // obj.name = "John";  // Error: name has private access in RWOnly
        // System.out.println(obj.name);  // Error: name has private access in RWOnly

        // Task 6: Set value using the setter and get value using the getter
        obj.setName("John");
        System.out.println(obj.getName());  // Output: John
    }
}