package homework_4_2;

import java.time.Duration;
import java.util.Locale;

public class WorkWithString {
    private final String[] BELLOW_TWENTY = { "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
    private final String[] BELLOW_TWENTY_DOUBLE = { "ноль", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
    private final String[] TENS = { "", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
    private final String[] HUNDREDS = { "", "сто", "двести" , "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот" };
    private final String[] THOUSANDS = { "тысяча", "тысячи", "тысяч" };
    private final String[] MILLIONS = { "миллион", "миллиона", "миллионов" };
    private final String[] AFTER_POINT = { " сотая", " сотых" };
    private final String[] BEFORE_POINT = { " целая ", " целых " };
    private final String[] WEEK = { " неделя", " недели", " недель" };
    private final String[] HOURS = { " час ", " часа ", " часов " };
    private final String[] MINUTES = { " минута ", " минуты ", " минут " };
    private final String[] SECONDS = { " секунда ", " секунды ", " секунд " };
    private final String[] MILLISECONDS = { " миллисекунда ", " миллисекунды ", " миллисекунд " };
    private boolean isDouble = false;

    public String intToStr(int numInt) {
        String result;

        if (numInt >= -999_999_999 && numInt <= 999_999_999) {
            result = numInt < 0 ? "минус " + numToStr(numInt) : "" + numToStr(numInt);
        } else {
            result = "введите другое число";
        }


        return result;
    }

    public String doubleToStr(double numDouble) {
        String result;
        int numAfterComma = 2;

        this.isDouble = true;
        if (numDouble >= -999_999_999.999 && numDouble <= 999_999_999.999) {
            String tmp1 = specialValueIntegerPartDouble((int)numDouble);
            String tmp2 = specialValueAfterPoint(desCast(numDouble, numAfterComma));

            result = numDouble < 0 ? "минус " + numToStr((int)numDouble) + tmp1 + numToStr(desCast(numDouble, numAfterComma)) + tmp2 :
                                     "" + numToStr((int)numDouble) + tmp1 + numToStr(desCast(numDouble, numAfterComma)) + tmp2 ;
        } else {
            result = "введите другое число";
        }

        this.isDouble = false;

        return result;
    }

    public String toWeek(int day) {
        String result;

        if (day >= 0 && day <= 999_999_999) {
            result = rightWeek(day);
        } else {
            result = "введите другое число";
        }

        return result;
    }

    private String numToStr(int num) {
        int tmp = Math.abs(num);

        if (tmp < 20) {
            return this.isDouble ? this.BELLOW_TWENTY_DOUBLE[tmp] : this.BELLOW_TWENTY[tmp];
        }
        if (tmp < 100) {
            return this.TENS[tmp / 10] + ((tmp % 10 != 0) ? " " + (this.isDouble ? this.BELLOW_TWENTY_DOUBLE[tmp % 10] : this.BELLOW_TWENTY[tmp % 10]): "");
        }
        if (tmp < 1000) {
            return this.HUNDREDS[tmp / 100] + ((tmp % 100 != 0) ? " " + numToStr(tmp % 100): "");
        }
        if (tmp < 2000) {
            return this.THOUSANDS[0] + ((tmp % 1000 != 0) ? " " + numToStr(tmp % 1000) : "");
        }
        if (tmp < 3000) {
            return "две " + this.THOUSANDS[1] + ((tmp % 1000 != 0) ? " " + numToStr(tmp % 1000): "");
        }
        if (tmp < 5000) {
            return (this.isDouble ? this.BELLOW_TWENTY_DOUBLE[tmp / 1000] : this.BELLOW_TWENTY[tmp / 1000]) + " " + this.THOUSANDS[1] + ((tmp % 1000 != 0) ? " " + numToStr(tmp % 1000): "");
        }
        if (tmp < 1_000_000) {
            return specialValueHandlingThousands(findFirstNum(tmp)) + ((tmp % 1000 != 0) ? " " + numToStr(tmp % 1000): "");
        }
        if (tmp < 2_000_000) {
            return this.MILLIONS[0] + ((tmp % 1_000_000 != 0) ? " "  + numToStr(tmp % 1_000_000): "");
        }
        if (tmp < 5_000_000) {
            return (this.isDouble ? this.BELLOW_TWENTY_DOUBLE[tmp / 1_000_000] : this.BELLOW_TWENTY[tmp / 1_000_000]) + " " + this.MILLIONS[1] + ((tmp % 1_000_000 != 0) ? " " + numToStr(tmp % 1_000_000): "");
        }
        return specialValueHandlingMillions(findFirstNum(tmp)) + ((tmp % 1_000_000 != 0) ? " " + numToStr(tmp % 1_000_000): "");
    }

    private int findFirstNum(int num) {
        if (num < 1_000_000) {
            return num / 1000;
        }
        if (num < 1_000_000_000){
            return num / 1_000_000;
        }

        return num;
    }

    private String specialValueHandlingThousands(int num) {
        boolean isOne = num % 10 == 1 && num != 11 && num != 1 && num != 111;
        boolean isTwo = num % 10 == 2 && num != 12 && num != 2 && num != 112;
        boolean isThree = num % 10 == 3 && num != 13 && num !=3 && num != 113;
        boolean isFour = num % 10 == 4 && num != 14 && num !=4 && num != 114;

        if (isOne) {
            return numToStr(num - (num % 10)) + " одна " + this.THOUSANDS[0];
        }
        if (isTwo) {
            return numToStr(num - (num % 10)) + " две " + this.THOUSANDS[1];
        }
        if (isThree || isFour) {
            return numToStr(num - (num % 10)) + " " + (this.isDouble ? this.BELLOW_TWENTY_DOUBLE[num % 10] : this.BELLOW_TWENTY[num % 10]) + " " + this.THOUSANDS[1];
        }
        else {
            return numToStr(num) + " " + this.THOUSANDS[2];
        }
    }

    private String specialValueHandlingMillions(int num) {
        boolean isOne = num % 10 == 1 && num != 11 && num != 1 && num != 111;
        boolean isTwo = num % 10 == 2 && num != 12 && num != 2 && num != 112;
        boolean isThree = num % 10 == 3 && num != 13 && num !=3 && num != 113;
        boolean isFour = num % 10 == 4 && num != 14 && num !=4 && num != 114;

        if (isOne) {
            return numToStr(num - (num % 10)) + " " + (this.isDouble ? this.BELLOW_TWENTY_DOUBLE[num % 10] : this.BELLOW_TWENTY[num % 10]) + " " + this.MILLIONS[0];
        }
        if (isTwo || isThree || isFour) {
            return numToStr(num - (num % 10)) + " " + (this.isDouble ? this.BELLOW_TWENTY_DOUBLE[num % 10] : this.BELLOW_TWENTY[num % 10]) + " " + this.MILLIONS[1];
        }
        else {
            return numToStr(num) + " " + this.MILLIONS[2];
        }
    }

    private String specialValueIntegerPartDouble(int num) {
        boolean isOne = num % 10 == 1 && num != 11 && num != 1 && num != 111;

        if (isOne) {
            return this.BEFORE_POINT[0];
        }
        else {
            return this.BEFORE_POINT[1];
        }
    }

    private String specialValueAfterPoint(int num) {
        boolean isOne = num % 10 == 1 && num != 11 && num != 1 && num != 111;

        if (isOne) {
            return this.AFTER_POINT[0];
        }
        else {
            return this.AFTER_POINT[1];
        }
    }

    private int desCast(double d, int n) {
        double doubleNumber = d - (int)d;
        String stringForFormatInput = "%." + n + "f";

        return Integer.parseInt(String.format(Locale.ENGLISH, stringForFormatInput, doubleNumber).substring(2));
    }

    private String rightWeek(int day) {
        int tmp = day / 7;
        if (tmp % 10 == 2 || tmp % 10 == 3 || tmp % 10 == 4) {
            return tmp + this.WEEK[1];
        }
        if (tmp % 10 == 1 && tmp != 11 && tmp != 1 && tmp != 111) {
            return tmp + this.WEEK[0];
        } else {
            return tmp + this.WEEK[2];
        }
    }

    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        Duration timeLeft = Duration.ofMillis(millisecond);

        if (shortFormat) {
            return String.format("%02d:%02d:%02d:%03d",
                    timeLeft.toHours(), timeLeft.toMinutesPart(), timeLeft.toSecondsPart(), timeLeft.toMillisPart());
        } else {
            return String.format("%d " + timeToWriteString(timeLeft.toHoursPart(), this.HOURS) +
                                " %d " + timeToWriteString(timeLeft.toMinutesPart(), this.MINUTES) +
                                " %d " + timeToWriteString(timeLeft.toSecondsPart(), this.SECONDS) +
                                " %d " + timeToWriteString(timeLeft.toMillisPart(), this.MILLISECONDS),
                    timeLeft.toHours(), timeLeft.toMinutesPart(), timeLeft.toSecondsPart(), timeLeft.toMillisPart());
        }
    }

    private String timeToWriteString(int time, String[] array) {
        boolean isOne = time % 10 == 1 && time != 11 && time != 111;
        boolean isTwo = time % 10 == 2 && time != 12 && time != 2 && time != 112;
        boolean isThree = time % 10 == 3 && time != 13 && time !=3 && time != 113;
        boolean isFour = time % 10 == 4 && time != 14 && time !=4 && time != 114;

        if (isOne) {
            return array[0];
        }
        if (isTwo || isThree || isFour) {
            return array[1];
        }
        else {
            return array[2];
        }
    }
}