package old_code;

public class MainClass_Animal {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Animal("Green");
        animals[1] = new Fish("Blue");
        animals[2] = new Bird("Yellow", 3.5);

        for (Animal a : animals) { // ENhanced loop
            a.g();
        }
    }
}
