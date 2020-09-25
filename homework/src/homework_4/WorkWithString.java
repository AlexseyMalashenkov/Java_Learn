package homework_4;

import java.util.Locale;

public class WorkWithString {
    private final String[] BELLOW_TWENTY = { "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
    private final String[] TENS = { "", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
    private final String[] HUNDREDS = { "", "сто", "двести" , "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот" };
    private final String[] THOUSANDS = { "тысяча", "тысячи", "тысяч" };
    private final String[] MILLIONS = { "миллион", "миллиона", "миллионов" };

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

        if (numDouble >= -999_999_999.999 && numDouble <= 999_999_999.999) {
            result = numDouble < 0 ? "минус " + numToStr((int)numDouble) + " целых " + numToStr(desCast(numDouble, numAfterComma)) + " сотых" : ""
                                              + numToStr((int)numDouble) + " целых " + numToStr(desCast(numDouble, numAfterComma)) + " сотых" ;
        } else {
            result = "введите другое число";
        }

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
            return this.BELLOW_TWENTY[tmp];
        }
        if (tmp < 100) {
            return this.TENS[tmp / 10] + ((tmp % 10 != 0) ? " " + this.BELLOW_TWENTY[tmp % 10]: "");
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
            return this.BELLOW_TWENTY[tmp / 1000] + " " + this.THOUSANDS[1] + ((tmp % 1000 != 0) ? " " + numToStr(tmp % 1000): "");
        }
        if (tmp < 1_000_000) {
            return specialValueHandlingThousands(findFirstNum(tmp)) + ((tmp % 1000 != 0) ? " " + numToStr(tmp % 1000): "");
        }
        if (tmp < 2_000_000) {
            return this.MILLIONS[0] + ((tmp % 1_000_000 != 0) ? " "  + numToStr(tmp % 1_000_000): "");
        }
        if (tmp < 5_000_000) {
            return this.BELLOW_TWENTY[tmp / 1_000_000] + " " + this.MILLIONS[1] + ((tmp % 1_000_000 != 0) ? " " + numToStr(tmp % 1_000_000): "");
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
            return numToStr(num - (num % 10)) + " " + this.BELLOW_TWENTY[num % 10] + " " + this.THOUSANDS[1];
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
            return numToStr(num - (num % 10)) + " " + this.BELLOW_TWENTY[num % 10] + " " + this.MILLIONS[0];
        }
        if (isTwo || isThree || isFour) {
            return numToStr(num - (num % 10)) + " " + this.BELLOW_TWENTY[num % 10] + " " + this.MILLIONS[1];
        }
        else {
            return numToStr(num) + " " + this.MILLIONS[2];
        }
    }

    private int desCast(double d, int n) {
        double doubleNumber = d - (int)d;
        String stringForFormatInput = "%." + n + "f";

        return Integer.parseInt(String.format(Locale.ENGLISH, stringForFormatInput, doubleNumber).substring(2));
    }

    private String rightWeek(int day) {
        if (day % 10 == 2 && day % 10 == 3 && day % 10 == 4) {
            return day / 7 + " недели";
        }
        if (day % 10 == 1) {
            return day / 7 + " неделя";
        } else {
            return day / 7 + " недель";
        }
    }
}
