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
public class Student {
    
    private static int students = 0;
    private String name;
    private String lastName;
    private int indexNumber;
   
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
     public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
     public int getIndexNumber() {
        return indexNumber;
    }
    
    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
    
     public static int getStudents() {
        return students;
    }
    
       public Student() {
        
    }
    public Student(String name, String lastName, int indexNumber) {
        this.name = name;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        students++;
    }
}
