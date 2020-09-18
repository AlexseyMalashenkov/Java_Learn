package topic_8.task_34;

public class Working extends Foreman implements ISalaryCalc {
    private int workExperience;

    public Working(String name, String sex, int age, String position, String jacketColor, String universityName, int workExperience) {
        super(name, sex, age, position, jacketColor, universityName);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public double salaryCalc() {
        return 1;
    }
}
