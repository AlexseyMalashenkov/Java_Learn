package topic_8.task_35;

public enum ESeasonsYear {
    WINTER ("Зима", 90),
    SPRING ("Весна", 92),
    SUMMER ("Лето", 92),
    AUTUMN ("Осень", 91);

    private String descriptoin;
    private int countOfDays;

    ESeasonsYear(String descriptoin, int countOfDays) {
        this.descriptoin = descriptoin;
        this.countOfDays = countOfDays;
    }

    public String getDescriptoin() {
        return descriptoin;
    }

    public void setDescriptoin(String descriptoin) {
        this.descriptoin = descriptoin;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    @Override
    public String toString() {
        return "Сезон: " + descriptoin + ", количество дней: " + countOfDays;
    }
}
