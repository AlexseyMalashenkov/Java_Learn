package homework_9.utils.generator;

import collections.utils.AnyRandom;
import homework_9.chief_class.Student;


import static collections.utils.AnyRandom.getRandomNumberInRange;

public class Generator {
    public static Student generateStudent() {
        return new Student(AnyRandom.nextString(getRandomNumberInRange(2, 10)), AnyRandom.nextString(getRandomNumberInRange(2, 10)), AnyRandom.nextString(getRandomNumberInRange(5, 10)), getRandomNumberInRange(0, 10));
    }
}
