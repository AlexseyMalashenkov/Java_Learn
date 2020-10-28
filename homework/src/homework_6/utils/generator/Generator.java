package homework_6.utils.generator;

import collections.utils.AnyRandom;
import homework_6.chiefs_classes.Animal;
import homework_6.chiefs_classes.Person;

import java.util.Collection;
import java.util.function.Supplier;

import static collections.utils.AnyRandom.getRandomNumberInRange;

public class Generator {


    @Deprecated(since = "replaced by generator")
    public void addElements(Collection collection, boolean isPeople) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            if (isPeople == true) {
                collection.add(new Person(AnyRandom.nextString(getRandomNumberInRange(5, 10)),
                        AnyRandom.nextString(getRandomNumberInRange(5, 10))));
            } else {
                collection.add(new Animal(getRandomNumberInRange(5, 10),
                        AnyRandom.nextString(getRandomNumberInRange(5, 10))));
            }
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время добавления используя простой цикл до 1_000_000: " + (finish - start));
    }

    public <T> void generator(Collection<T> container, Supplier<T> supplier, int count) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            container.add(supplier.get());
        }

        long finish = System.currentTimeMillis();

        System.out.println(container.getClass() + " время добавления используя простой цикл до 1_000_000: " + (finish - start));
    }

    public Person generatePersons() {
        return new Person(AnyRandom.nextString(getRandomNumberInRange(5, 10)), AnyRandom.nextString(getRandomNumberInRange(5, 10)));
    }

    public Animal generateAnimals() {
        return new Animal(getRandomNumberInRange(5, 10), AnyRandom.nextString(getRandomNumberInRange(5, 10)));
    }
}
