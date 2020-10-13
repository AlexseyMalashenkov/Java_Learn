package homework_6;

import homework_6.utils.ParseJSON;

import java.util.TreeSet;

public class CCPMain1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
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

        ParseJSON parseJSON = new ParseJSON();
        parseJSON.parse();
    }
}
