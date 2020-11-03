package homework_9.chief_class;

import java.io.Serializable;

public class Student implements Serializable {
    private String firstName;
    private String secondName;
    private String middleName;
    private int mark;

    public Student(String firstName, String secondName, String middleName, int mark) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getFullName() {
        return firstName + secondName + middleName;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", mark=" + mark;
    }
}
