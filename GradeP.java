/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.grade;

/**
 *
 * @author Mast
 */

class Student {
    private String name;
    private double score;
    
    public Student (String name, double score){
        this.name = name;
        this.score = score;
    }
    public boolean hasPassed() {
        return this.score >= 60.0;
    }
    public void displaySummary() {
        System.out.println("Student: "+ this.name);
        System.out.println("Score: "+ this.score);
        if(hasPassed()){
            System.out.println("Status : Passed");
        }else {
            System.out.println("Status : Failed");
        }
        System.out.println("-----------------");
    }
}

public class GradeP {

    public static void main(String[] args) {
        Student student1 = new Student("Alex", 85.5);
        Student student2 = new Student("Jordan",52.0);
        
        student1.displaySummary();
        student2.displaySummary();
    }
}
