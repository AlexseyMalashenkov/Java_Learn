package topic_6;

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds) {
        this.seconds = seconds;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "TimeInterval{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }

    public int totalNumberSeconds() {
        return seconds + (minutes * 60) + (hours * 3600);
    }

    public int compare(TimeInterval timeInterval) {
        int firstSecond = seconds + (minutes * 60) + (hours * 3600);
        int secondSecond = timeInterval.seconds + (timeInterval.minutes * 60) + (timeInterval.hours * 3600);

        if (firstSecond < secondSecond) {
            return -1;
        }
        else if (firstSecond > secondSecond) {
            return 1;
        } else {
            return 0;
        }
    }
}
