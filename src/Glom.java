import java.util.ArrayList;

public class Glom {
    public String name;
    public int age;
    public boolean isAlive = true;
    public Gender gender;
    public int birthCycle;


    public Glom(int birthCycle, int age) {
        this.age = age;
        this.gender = Util.randomChance(50) ? Gender.MALE : Gender.FEMALE;
        this.name = Util.randomString(6);
        this.birthCycle = birthCycle;
    }

    public boolean tryReproduce() {
        return Util.randomChance(70);
    }

    public boolean tryDie() {
        if (this.age <= 3) {
            return Util.randomChance(10.0); //10
        } else if (this.age <= 5) {
            return Util.randomChance(15.0); //20
        } else if (this.age <= 7) {
            return Util.randomChance(30.0); //50
        } else {
            return Util.randomChance(60.0); //90
        }
    }

    public boolean canReproduce() {
        return this.isAlive && this.gender == Gender.FEMALE && (this.age >= 2 && this.age <= 5);
    }

    public boolean diesAsInfant() {
        return  Util.randomChance(.5);
    }

    public void printPopulation(ArrayList<Glom> city) {
        System.out.printf("Population: %d", city.size());
    }

    @Override
    public String toString() {
        return "Glom{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", gender=" + gender +
                ", birthCycle=" + birthCycle +
                '}';
    }
}
