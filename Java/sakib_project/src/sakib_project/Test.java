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
import java.io.*;
import java.util.Scanner;

public class Test {
  

    public static void main(String[] args) throws UnresolvedInputException {
        int x = 5;
        Animal[] animals = new Animal[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < animals.length; i++) {
            int size;
            String color;
            String species;
            System.out.println("Size,Color,Species");
            String line = scanner.nextLine();
            size = Integer.parseInt(line.split(",")[0]);
            color = line.split(",")[1];
            species = line.split(",")[2];
            if (species.equalsIgnoreCase("elephant")) {
                try {
                    Elephant elephant = new Elephant(size, color, species);
                    animals[i] = elephant;
                } catch (UnresolvedInputException e) {
                    e.printStackTrace();
                    System.out.println("Failed to create objects");
                    i--;
                }
            } else if (species.equalsIgnoreCase("giraffe")) {
                Giraffe giraffe = new Giraffe(size, color, species);
                animals[i] = giraffe;
            }
        }

        try {
            File outputFile = new File("task_2_output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            bufferedWriter.write("Objects Descriptions\n");
            for (int i = 0; i < x; i++) bufferedWriter.write("[" + i + "] " + animals[i] + "\n");
            bufferedWriter.write("Objects Equality\n");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    bufferedWriter.write("[" + i + "]" + "[" + j + "] " + (animals[i] == animals[j]) + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

    
