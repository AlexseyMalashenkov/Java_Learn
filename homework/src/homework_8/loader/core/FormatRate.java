package homework_8.loader.core;

public class FormatRate {
    private final String rate;
    private final String scale;
    private final String abbreviation;
    private final String date;

    public FormatRate(String rate, String scale, String abbreviation, String date) {
        this.rate = rate;
        this.scale = scale;
        this.abbreviation = abbreviation;
        this.date = date;
    }

    public FormatRate(String rate, String abbreviation, String date) {
        this.rate = rate;
        this.scale = "1";
        this.abbreviation = abbreviation;
        this.date = date;
    }

    public String getRate() {
        return rate;
    }

    public String getScale() {
        return scale;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return this.scale + " " + this.abbreviation + " = " + this.rate + " BYN на " + this.date + ";";
    }
}
