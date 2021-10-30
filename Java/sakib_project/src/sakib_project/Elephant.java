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


public class Elephant extends Animal implements Feed {

    


    public Elephant(int size, String color, String species) throws UnresolvedInputException {
       super(size, color, species);
    }

    /*Elephant(int size, String color, String species) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

    @Override
    public void food() {
        System.out.println("A Elephant eats roots");
    }

    @Override
    public void HowToFeed() {
        System.out.println("Elephant uses trunks to feed");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Animal)) return false;
        Animal animal = (Animal) obj;
        return this.species.equals(animal.species);
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "color=" + color +
                ", size=" + size +
                ", species=" + species +
                '}';
    }
}