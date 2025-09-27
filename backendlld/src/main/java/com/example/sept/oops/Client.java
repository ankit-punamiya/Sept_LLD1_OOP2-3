package com.example.sept.oops;

import com.example.sept.oops.scaler.Student;
import com.example.sept.oops.scaler.copyconstructor.Employee;

public class Client {
    public static void main(String[] args) {
        // Student student = new Student();
        // student.age = 10;
        // student.emailId = "sdsdsds@gmail.com";
        // // student.name = "Raj";
        // student.dob = "19/09/1995";

        // student.doAssignment();
        // student.raiseSupporRequest();
        
        // System.out.println("Hello world!");


        Employee e1 = new Employee("Yash", 30);
        //System.out.println("E1: "+ e1);

        Employee e2 = e1;
        //System.out.println("E2: "+ e2);

        Employee e3 = new Employee(e1);
        //System.out.println("E3: "+ e3.name  + " " + e3.age);
        


        

    }
}