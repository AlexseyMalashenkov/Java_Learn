package topic_8.task_34;

public class Foreman extends DirectorFactory implements ISalaryCalc {
    private final String universityName;

    public Foreman(String name, String sex, int age, String position, String jacketColor, String universityName) {
        super(name, sex, age, position, jacketColor);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    @Override
    public double salaryCalc() {
        return 5;
    }
}
