package homework_7;

public class Animal {
    private byte age;
    private String nick;

    public Animal(byte age, String nick) {
        if (age >= 1 && age <= 15) {
            this.age = age;
            this.nick = nick;
        } else {
            System.out.println("Животные столько не живут... Будет создано дефолтное животное...");
            this.age = 1;
            this.nick = "Собачка";
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
