package animal;

public class Main {

    public static void main(String[] args) {

        Animal fox = new Animal();
        Animal horse = new Animal();
        Animal dog = new Animal();

        fox.eat();
        System.out.println(fox.hunger);
        fox.drink();
        System.out.println(fox.thirst);
    }
}
