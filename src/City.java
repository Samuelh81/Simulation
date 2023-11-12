import java.util.ArrayList;

public class City extends ArrayList<Glom> {
    public int births, deaths, population, initialPopulation;

    public City(int population) {
        this.population = population;
        this.initialPopulation = population;
        for (int i=0;i<population;i++) this.add(new Glom(0, 2));
    }

    public void printData() {
        System.out.printf("  Population: %d\n", population);
        System.out.printf("       ΔPopulation: %d\n", population-initialPopulation);
        System.out.printf("       Births: %d\n", this.births);
        System.out.printf("       Deaths: %d\n", this.deaths);
    }

    public void updatePopulation() {
        population = 0;
        for (Glom glom:this) {
            if (glom.isAlive) population++;
        }
    }
}
