package collections;


import collections.dto.Client;
import collections.dto.Gender;
import collections.dto.Passport;
import collections.service.Bank;
import collections.service.MapBankStorage;

import java.util.Date;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(new MapBankStorage());

        Passport passport = new Passport();
        passport.setId("1234567890");
        passport.setName("ЛЕша");
        passport.setNumber("кпаукр32");
        passport.setGender(Gender.МУЖЧИНА);
        passport.setStartDay(new Date());
        passport.setRegData(new Date());

        bank.saveNewClient(passport);

        Client client = bank.getClient("1234567890");

        System.out.println(client);

        List<Passport> passportsByClientId = bank.getPassportByClientId("1234567890");

        System.out.println(passportsByClientId);

        List<Passport> passports= bank.getPassports();

        System.out.println(passports);
    }
}