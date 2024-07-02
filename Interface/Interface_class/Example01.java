/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_class;


class Animal {

    String name, color, breed;
    int age;

    Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("Animal Name is: " + getName() + "\n" + "This Animal Breed name: " + getBreed() + "\n" + "Color : " + getColor() + "\n" + "Age: " + getAge());
    }

}

public class Example01 {

    public static void main(String args[]) {
        Animal OB1 = new Animal("Dog", "Pupolin", "Brown", 5);
        System.out.println(OB1.toString());
    }
}
