package homework_7;

import java.util.TreeSet;

public class CCPMain {
    public static void main(String[] args) {
        Animal animal2 = new Animal(10, "Игнат");
        Animal animal4 = new Animal(10, "Ярик");
        Animal animal1 = new Animal(10, "Анатолий");
        Animal animal3 = new Animal(1, "Люцифер");

        AnimalComparatorAnimals comparatorAnimals = new AnimalComparatorAnimals();

        TreeSet<Animal> animals = new TreeSet(comparatorAnimals);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        for (Animal a : animals) {
            System.out.println(a.getAge() + " " + a.getNick());
        }

    }
}
