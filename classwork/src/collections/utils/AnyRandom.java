package collections.utils;

public class RandomString {

    public String nextString(int length) {
        String result = "";

        for (int i = 0; i < length; i++) {
            final int rndBigLatin = rnd(65, 90);
            final int rndSmallLatin = rnd(97, 122);
            final int rndBigKiril = rnd(1040, 1071);
            final int rndSmallKiril = rnd(1072, 1103);

            char bigLat = (char) rndBigLatin;
            char smallLat = (char) rndSmallLatin;
            char bigKiril = (char) rndBigKiril;
            char smallKiril = (char) rndSmallKiril;

            result = bigLat + smallLat + bigKiril + smallKiril + "";
        }

        return result;
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
// A-65 Z-90
// a-97 z-122
// А-1040 Я - 1071
// а-1072 я-1103