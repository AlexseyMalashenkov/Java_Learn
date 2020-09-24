package collections;

import collections.dto.Passport;
import collections.utils.AnyRandom;

import java.util.HashSet;
import java.util.Set;

public class SetMain2 {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();

        Passport passport = new Passport(AnyRandom.nextString(15),
                                   "1234567890",
                                   AnyRandom.nextString(9)
                                        );
        passports.add(passport);
        passports.add(passport);
        passports.add(passport);
        passports.add(passport);


        for (Passport passpor : passports) {
            System.out.println(passport);
        }
    }
}