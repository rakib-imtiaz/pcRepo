package sakib_project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class Giraffe extends Animal implements Feed {

    public Giraffe(int size, String color, String species) throws UnresolvedInputException {
        super(size, color, species);
    }

   /* Giraffe(int size, String color, String species) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void food() {
        System.out.println("A Giraffe eats branches");
    }

    @Override
    public void HowToFeed() {
        System.out.println("Giraffe uses long neck to feed");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Animal)) return false;
        Animal animal = (Animal) obj;
        return this.species.equals(animal.species);
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "color=" + color +
                ", size=" + size +
                ", species=" + species +
                '}';
    }
}
