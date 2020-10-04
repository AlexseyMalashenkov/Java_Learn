package homework_7;

import java.util.Comparator;

public class AnimalComparatorAnimals implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        AnimalComparatorAge comparatorAge = new AnimalComparatorAge();

        int ageCompare =  comparatorAge.compare(o1.getAge(), o2.getAge());
        if (ageCompare != 0) {
            return ageCompare;
        } else {
            return o1.getNick().compareTo(o2.getNick());
        }
    }
}