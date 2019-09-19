public class Sparrow extends Bird implements Flyable {
    public Sparrow(char Gender, int Age, int WeightInPounds)
    {
        super(Gender, Age, WeightInPounds);
    }

    public void fly()
    {
        System.out.println("I am flying");
    }
}
