/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism1;

public class Circle extends Shape {

    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override   
    // overriding/replacing the getArea method of the Shape class
    public double getArea() {
        area = 3.14 * (radius * radius);
        return (area);
    }
}
