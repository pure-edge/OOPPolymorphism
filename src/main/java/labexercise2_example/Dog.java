/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise2_example;

public class Dog extends Pet{ // #3 subclass of Pet superclass
    private String breed;

    public Dog(String name, double weight, String breed) {
        // call the superclass constructor and pass the name and weight parameters
        super(name, weight);
        this.breed = breed;
    }

    @Override
    public String makeSound() { // overriding the superclass method 'makeSound'
        return "Arf! Arf!";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
