package collections.service;

import collections.dto.Client;
import collections.dto.Passport;

import java.util.*;

public class MapBankStorage implements IBankStorage{
    private Map<String, Client> clients = new HashMap<>();
    private Map<String, List<Passport>> passports = new HashMap<>();

    @Override
    public void saveNewClient(Passport passport) {
        this.clients.put(passport.getId(), new Client(passport));
        this.passports.put(passport.getId(), Arrays.asList(passport));
    }

    @Override
    public Client getClient(String id) {
        return this.clients.get(id);
    }

    @Override
    public List<Passport> getPassportByClientId(String id) {
        return this.passports.get(id);
    }

    @Override
    public List<Passport> getPassports() {
        List<Passport> passports = new LinkedList<>();

        for (List<Passport> value : this.passports.values()) {
            passports.addAll(value);
        }

        return passports;
    }
}
