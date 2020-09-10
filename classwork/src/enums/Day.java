package enums;

public enum Day {
    MONDAY ("Понедельник", true),
    TUESDAY("Вторник", true),
    WEDNESDAY("Среда", true),
    THURSDAY("Четверг", true),
    FRIDAY("Пятница", true),
    SATURDAY("Суббота", false),
    SUNDAY("Воскресенье", false);


    private String rusName;
    private boolean isWorkDay;

    Day(String rus, boolean isWorkDay) {
        this.isWorkDay = isWorkDay;
        this.rusName = rus;
    }

    public String getRusName() {
        return this.rusName;
    }

    public boolean isWorkDay (){
        return this.isWorkDay;
    }

    //public static Day valueOfIgnoreCase(String dayName) {
    //    String dayNameUpper = dayName.toUpperCase();
    //    for (Day value : values()) {
    //        if (value.name().toUpperCase().equals(dayNameUpper)) {
    //            return value;
    //        }
    //    }
    //    return values().;
    //}
}
