/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism2;

/**
 *
 * @author Stephen Janseen Balo
 */
class GraduateStudent extends Student {

    @Override
    public void computeCourseGrade() {
        int total = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            total += test[i];
        }
        if (total / NUM_OF_TESTS >= 80) {
            courseGrade = "Pass";
        } else {
            courseGrade = "No Pass";
        }
    }
}
