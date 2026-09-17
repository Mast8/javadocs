/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
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
        System.out.println("🏅 Grade   : " + getLetterGrade());
        System.out.println("📌 Status  : " + (hasPassed() ? "PASSED" : "FAILED"));
        System.out.println("-----------------");
    }

    public String getLetterGrade() {
        if (score >= 90) return "A 🌟";
        if (score >= 80) return "B 👍";
        if (score >= 70) return "C ⚖️";
        if (score >= 60) return "D ⚠️";
        return "F 🔴";
    }
}

public class GradeP {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Student student1 = new Student("Alex", 85.5);
        Student student2 = new Student("Jordan",52.0);
        
        student1.displaySummary();
        student2.displaySummary();
    }
}
