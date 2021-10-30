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


public abstract class Animal {

    int size;
    String color;
    String species;
    


    public Animal(int size, String color, String species) throws UnresolvedInputException {
        if (size < 0) throw new UnresolvedInputException();
        this.size = size;
        this.color = color;
        this.species = species;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public abstract void food();
}
