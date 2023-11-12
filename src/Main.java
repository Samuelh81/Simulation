import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        City city = new City(10000);


        for (int cycle=0;cycle<30;cycle++) { // n cycles
            for (int residentId = 0; residentId < city.size(); residentId++) { // cycle
                Glom glom = city.get(residentId);
                if (glom.birthCycle == cycle) continue;

                if (glom.canReproduce() && glom.tryReproduce()) {
                    city.add(new Glom(cycle, 0));
                    city.births++;
                }

                if (glom.isAlive && glom.tryDie()) {
                    glom.isAlive = false;
                    city.deaths++;
                }
                if (glom.isAlive) glom.age++;
            }
            city.updatePopulation();
        }
        city.printData();


        FileWriter ageWriter = new FileWriter("C:\\Users\\Samue\\IdeaProjects\\Simulation\\src\\ages.csv");
        ageWriter.write("age\n");
        for (Glom glom : city) {
            if (glom.isAlive) ageWriter.write(Integer.toString(glom.age) + "\n");
        }
        ageWriter.close();




    }
}