package A;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Tom");
        cat1.setAge(4);
        cat1.setBreed("Normal");
        cat1.setColor("Blue");

        Cat cat2 = new Cat();
        cat2.setName("Mike");
        cat2.setAge(-2);
        cat2.setBreed("Normal");
        cat2.setColor("Black");

        System.out.println("CATS");
        System.out.println("Cat is number 1:\nName: " + cat1.getName() + "\nAge: " + cat1.getAge() + "\nBreed: " + cat1.getBreed() + "\nColor: " + cat1.getColor());
        System.out.println("\nCat is number 2:\nName: " + cat2.getName() + "\nAge: " + cat2.getAge() + "\nBreed: " + cat2.getBreed() + "\nColor: " + cat2.getColor());

        Dog dog = new Dog();
        dog.setName("Balu");
        dog.setAge(5);
        dog.setBreed("Haski");
        dog.setColor("White");
        System.out.println("\nDOG\nName: " + dog.getName() + "\nAge: " + dog.getAge() + "\nBreed: " + dog.getBreed() + "\nColor: " + dog.getColor());

        Parrot parrot = new Parrot();
        parrot.setName("Yago");
        parrot.setAge(3);
        parrot.setBreed("Ara");
        parrot.setColor("Red");
        System.out.println("\nPARROT\nName: " + parrot.getName() + "\nAge: " + parrot.getAge() + "\nBreed: " + parrot.getBreed() + "\nColor: " + parrot.getColor());

        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setAge(1);
        fish.setBreed("Amphiprion");
        fish.setColor("Orange-white");
        System.out.println("\nFISH\nName: " + fish.getName() + "\nAge: " + fish.getAge() + "\nBreed: " + fish.getBreed() + "\nColor: " + fish.getColor());

    }
}
