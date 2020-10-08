package homework_6;

public class Animal {
    private int age;
    private String nick;

    public Animal(int age, String nick) {
        if (age >= 1 && age <= 15) {
            this.age = age;
        } else {
            System.out.println("Животные столько не живут... Будет создано дефолтный возраст...");
            this.age = 1;
        }
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
