package A;

public class Fish {
    private String name;
    private int age;
    private String color;
    private String breed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 5) System.out.println( "Рыба не может быть такого возраста!");
        else if (age < 0) System.out.println( "Рыба не может быть такого возраста!");
        else this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
