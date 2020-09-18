package topic_8.task_34;

public class DirectorFactory extends Man implements ISalaryCalc{
    private String jacketColor;

    public DirectorFactory(String name, String sex, int age, String position, String jacketColor) {
        super(name, sex, age, position);
        this.jacketColor = jacketColor;
    }

    public String getJacketColor() {
        return jacketColor;
    }

    public void setJacketColor(String jacketColor) {
        this.jacketColor = jacketColor;
    }

    @Override
    public double salaryCalc() {
        return 10;
    }
}
