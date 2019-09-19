public class Zoo {
    public static void main(String[] args) {
        System.out.println("Animal:");
        Animal animal1 = new Animal('m', 4, 90);

        animal1.sleep();
        animal1.eat();

        Bird bird1 = new Bird('m', 4, 10);

        System.out.println("\nBird:");
        bird1.fly();
        bird1.eat();
        bird1.sleep();

        Fish fish1 = new Fish('f', 2, 5);

        System.out.println("\nFish:");
        fish1.swim();
        fish1.eat();
        fish1.sleep();

        Sparrow sparrow = new Sparrow('m', 1, 3);

        System.out.println("\nSparrow:");
        sparrow.fly();

        Chicken chicken = new Chicken('m', 2, 50);

        System.out.println("\nChicken:");
    }
}
