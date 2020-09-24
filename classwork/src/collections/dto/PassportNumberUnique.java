package collections.dto;

public class PassportIdUnique {
    private String name;
    private String id;
    private String number;

    public PassportIdUnique() {
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

    public PassportIdUnique(String name, String id, String number) {
        this.name = name;
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PassportIdUnique{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
