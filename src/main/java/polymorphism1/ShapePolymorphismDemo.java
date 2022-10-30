/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism1;

public class ShapePolymorphismDemo {
    public static void main(String[] args) {
        Shape sh; // create an object of Shape superclass
        Circle circ = new Circle(5);
        Rectangle rec = new Rectangle(4,5);
        
        /* assigning the 'sh' object to an object of 
        a subclass of the Shape class */
        sh = circ;
        System.out.println("Area = " + sh.getArea());
        
        /* assigning the 'sh' object to an object of 
        another subclass of the Shape class */
        sh = rec;
        System.out.println("Area = " + sh.getArea()); 
    }
}
