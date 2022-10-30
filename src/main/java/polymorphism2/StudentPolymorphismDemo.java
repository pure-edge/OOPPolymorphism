/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism2;

public class StudentPolymorphismDemo {

    public static void main(String[] args) {
        Student[] roster = new Student[3]; // create an array of Student objects
        
        GraduateStudent student1 = new GraduateStudent();
        student1.setTestScore(1, 90);
        student1.setTestScore(2, 91);
        student1.setTestScore(3, 92);
        
        UndergraduateStudent student2 = new UndergraduateStudent();
        student2.setTestScore(1, 63);
        student2.setTestScore(2, 64);
        student2.setTestScore(3, 65);
        
        UndergraduateStudent student3 = new UndergraduateStudent();
        student3.setTestScore(1, 73);
        student3.setTestScore(2, 74);
        student3.setTestScore(3, 75);
        
        roster[0] = student1;
        roster[1] = student2;
        roster[2] = student3;

        // for each element of the roster array, compute grade course and print it
        for (int i = 0; i < roster.length; i++) { // i=2
            roster[i].computeCourseGrade();
            // roster[2] = student3, UnderGraduateStudent, grade: 73, 74, 75, total/3 = 74
            // student2.courseGrade = "Pass"
            System.out.println(roster[i].getCourseGrade()); // print "Pass"
        }

    }
}
