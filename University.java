/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentuni;

/**
 *
 * @author Admin
 */
public class University {
    public static void main (String[] args) {
        
         System.out.println("Liczba studentów przed zapisami: " + Student.getStudents());
        Student student1 = new Student("Roman", "Kowalski", 123);
        Student student2 = new Student("Zenon", "Nowak", 321);
        Student student3 = new Student("Wacek", "Nowak", 556);
       
        
        if (Student.getStudents() == 2) {
                       
            System.out.println("Liczba studentów po zapisie: " + Student.getStudents());
        }
        else {
            System.out.println("Liczba studentów nie wynosi 2 tylko " + Student.getStudents());
        }
    }
    
}
