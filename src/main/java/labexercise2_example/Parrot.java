/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise2_example;

/**
 *
 * @author Stephen Janseen Balo
 */

public class Parrot extends Pet {   // #3 another subclass of Pet superclass
    private String jungle;

    public Parrot(String name, double weight, String jungle) {
        // call the superclass constructor and pass the name and weight parameters
        super(name, weight);
        this.jungle = jungle;
    }

    @Override
    public String makeSound() { // overriding the superclass method 'makeSound'
        return "Hello!!!";
    }

    public String getJungle() {
        return jungle;
    }

    public void setJungle(String jungle) {
        this.jungle = jungle;
    }
}
