package homework_7;


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
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
