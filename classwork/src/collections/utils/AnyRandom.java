package collections.utils;

import java.util.Random;

public class AnyRandom {
    private static final char[] allLetters = ("qwertyuiopasdfghjklzxcvbnm" +
                                     "QWERTYUIOPASDFGHJKLZXCVBNM" +
                                     "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЁЯЧСМИТЬБЮ" +
                                     "йцукенгшщзхъфывапролджэёячсмитьбю").toCharArray();
    private static final Random random = new Random();

    public static String nextString(int length) {
        StringBuilder builder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            builder.append(allLetters[random.nextInt(allLetters.length)]);
        }
        return builder.toString();
    }

    public static String nextStr(int length) {
        final int rndBigLatin = rnd(65, 90);        // A-65   Z-90
        final int rndSmallLatin = rnd(97, 122);     // a-97   z-122
        final int rndBigKiril = rnd(1040, 1071);    // А-1040 Я-1071
        final int rndSmallKiril = rnd(1072, 1103);  // а-1072 я-1103
        StringBuilder builder = new StringBuilder(length);

        char bigLat = (char) rndBigLatin;
        char smallLat = (char) rndSmallLatin;
        char bigKiril = (char) rndBigKiril;
        char smallKiril = (char) rndSmallKiril;

        for (int i = 0; i < length; i++) {
            builder.append((char) rndBigLatin);
        }

        return builder.toString();
    }

    private static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}