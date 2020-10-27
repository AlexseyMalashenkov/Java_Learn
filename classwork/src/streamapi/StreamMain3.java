package streamapi;

import collections.utils.AnyRandom;
import homework_6.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static collections.utils.AnyRandom.getRandomNumberInRange;

public class StreamMain3 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            personList.add(new Person(AnyRandom.nextString(getRandomNumberInRange(5, 10)), AnyRandom.nextString(getRandomNumberInRange(5, 10))));
        }

        long personCount = personList.stream()
                .filter(person -> person.getPassword().length() >= 10)
                .count();

        List<Person> collect = personList.stream()
                .filter(person -> person.getPassword().length() >= 10)
                .collect(Collectors.toList());

        System.out.println(personCount);
        System.out.println(collect.size());
        System.out.println(personList.size());
    }
}
