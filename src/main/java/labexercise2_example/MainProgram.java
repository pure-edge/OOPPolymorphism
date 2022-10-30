/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise2_example;

/**
 *
 * @author Stephen Janseen Balo
 */
public class MainProgram {  // #1 Main class
    public static void main(String[] args) {
        Pet pet;    // superclass object
        Dog dog = new Dog("Brownie", 10, "German Sheperd"); // subclass object
        Parrot parrot = new Parrot("Tweetie", 1, "Larazzabal"); // another subclass object
        
        pet = dog;
        // calling the accessors from the superclass object
        System.out.println(pet.makeSound() + " " + "My name is " + pet.getName());
        
        pet = parrot;
        System.out.println(pet.makeSound() + " " + "My name is " + pet.getName());
    }
}
