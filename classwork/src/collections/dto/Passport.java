package collections.dto;

import java.util.Date;

public class Passport {
    private String name;
    private String id;
    private String number;
    private Date startDay;
    private Gender gender;
    private Date regData;

    public Passport() {
    }

    public Passport(String name, String id, String number) {
        this.name = name;
        this.id = id;
        this.number = number;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getRegData() {
        return regData;
    }

    public void setRegData(Date regData) {
        this.regData = regData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}