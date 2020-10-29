package homework_6;

import homework_6.chiefs_classes.Animal;
import homework_6.chiefs_classes.Person;
import homework_6.comparators.AnimalComparatorAnimals;
import homework_6.comparators.PersonComparatorPersons;
import homework_6.utils.generator.Generator;
import homework_6.utils.sorts.BubbleSort;
import homework_6.utils.sorts.UsualSort;
import homework_6.utils.threads.ExecutorServiceTask;

import java.util.*;

public class CCPMain2 {
    public static void main(String[] args) {

        PersonComparatorPersons comparatorPersons = new PersonComparatorPersons();
        AnimalComparatorAnimals comparatorAnimals = new AnimalComparatorAnimals();
        Generator generator = new Generator();
        UsualSort sort = new UsualSort();
        BubbleSort bubbleSort = new BubbleSort();

        List<Person> personLinkedList = new LinkedList<>();
        List<Person> personArrayList = new ArrayList<>();
        Set<Person> personHashSet = new HashSet<>();
        Set<Person> personTreeSet = new TreeSet(comparatorPersons);

        List<Animal> animalsLinkedList = new LinkedList<>();
        List<Animal> animalsArrayList = new ArrayList<>();
        Set<Animal> animalsHashSet = new HashSet<>();
        Set<Animal> animalsTreeSet = new TreeSet(comparatorAnimals);

        generator.generator(personLinkedList, generator::generatePersons, 1_000);

        new ExecutorServiceTask(personLinkedList, comparatorPersons);

        generator.generator(personArrayList, generator::generatePersons, 1_000_000);
        generator.generator(personHashSet, generator::generatePersons, 1_000_000);
        generator.generator(personTreeSet, generator::generatePersons, 1_000_000);


        generator.generator(animalsLinkedList, generator::generateAnimals, 1_000_000);
        generator.generator(animalsArrayList, generator::generateAnimals, 1_000_000);
        generator.generator(animalsHashSet, generator::generateAnimals, 1_000_000);
        generator.generator(animalsTreeSet, generator::generateAnimals, 1_000_000);

        System.out.println(personLinkedList.size());
        System.out.println(personArrayList.size());
        System.out.println(personHashSet.size());
        System.out.println(personTreeSet.size());

        System.out.println(animalsLinkedList.size());
        System.out.println(animalsArrayList.size());
        System.out.println(animalsHashSet.size());
        System.out.println(animalsTreeSet.size());

        sort.sortList(personLinkedList, comparatorPersons);
        sort.sortList(personArrayList, comparatorPersons);
        sort.sortSet(personHashSet, comparatorPersons);
        sort.sortSet(personTreeSet, comparatorPersons);

        sort.sortList(animalsLinkedList, comparatorAnimals);
        sort.sortList(animalsArrayList, comparatorAnimals);
        sort.sortSet(animalsHashSet, comparatorAnimals);
        sort.sortSet(animalsTreeSet, comparatorAnimals);
    }
}
