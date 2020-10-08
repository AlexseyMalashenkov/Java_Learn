package homework_6;


public class Person {
    private String nick;
    private String password;

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() > 10 || password.length() < 5) {
            this.password = "qwerty";
        } else {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
