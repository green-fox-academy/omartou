package animal;

public class Main {

    public static void main(String[] args) {

        Animal firstAnimal = new Animal();
        Animal secondAnimal = new Animal();
        Animal thirdAnimal = new Animal();

        firstAnimal.eat();
        secondAnimal.drink();
        thirdAnimal.play();

        System.out.println(firstAnimal.hunger);
        System.out.println(secondAnimal.thirst);
        System.out.println(thirdAnimal.hunger + " " + thirdAnimal.thirst);
    }
}
