public class Bird extends Animal implements Flyable {
    public Bird(char Gender, int Age, int Weight)
    {
        super(Gender, Age, Weight);
    }

    public void fly()
    {
        System.out.println("Flying...");
    }
}
