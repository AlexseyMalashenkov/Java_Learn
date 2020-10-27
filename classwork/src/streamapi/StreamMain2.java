package streamapi;

import generic.Generator;
import java.util.Random;
import java.util.stream.Stream;


public class StreamMain2 {
    public static void main(String[] args) {
        Random random = new Random();

        long count = Stream
                .generate(() -> random.nextInt(255))
                .limit(100)
                .filter(intValue -> intValue != 0)
                .map(intValue -> (char) intValue.intValue())
                .peek(System.out::print)
                .peek(Generator::kadc)
                .count();
        System.out.println(count);
    }
}
