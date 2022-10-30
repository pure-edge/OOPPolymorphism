/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise2_example;

/**
 *
 * @author Stephen Janseen Balo
 */
public abstract class Pet { // #2 this is our superclass
    protected String name;  // attributes are protected
    protected double weight;

    // constructor
    public Pet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    // this method will be overriden by its subclasses
    public abstract String makeSound(); 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }    
}