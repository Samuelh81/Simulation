public class Person {
    // These are the instance variables for the Person Class. In this case, each person has
    // a variable called num1.
    private int num1;

    // This is a constructor for the Person class that allows is to make a new Person by
    // doing    Person name = new Person(someInteger);
    public Person(int num1) {
        // Since inside this constructor we have 2 variables called num1, we need a way
        // to distinguish them. Whenever we do this.num1, we are pointing back to the num1
        // from the instance variables. If we only put num1, then we point to the num1
        // that was used as a parameter to the constructor.
        this.num1 = num1;
    }
}
