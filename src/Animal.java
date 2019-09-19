public class Animal {
    private char gender;
    private int age;
    private int weightInPounds;

    public Animal(char Gender, int Age, int WeightInPounds)
    {
        gender = Gender;
        age = Age;
        weightInPounds = WeightInPounds;
    }

    public void eat()
    {
        System.out.println("I am eating...");
    }

    public void sleep()
    {
        System.out.println("I am sleeping...");
    }
}
