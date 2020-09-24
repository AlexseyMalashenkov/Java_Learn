package homework_4;

public class NumsToString {
    private int num;

    private final String[] BELLOW_TWENTY = { "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
    private final String[] TENS = { "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
    private final String[] HUNDREDS = { "сто", "двести" , "тристо", "четыресто", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот" };
    private final String[] THOUSANDS = { "тысяча", "тысячи", "тысячь" };
    private final String[] MILLIONS = { "миллион", "миллиона", "миллионов" };

    NumsToString(int num) {
        this.num = num;
    }

    public void intToStr() {
        String result = "";
        if (this.num > -999_999_999 && this.num < 999_999_999) {
            result = this.num < 0 ? "минус " + numToStr() : "" + numToStr();
        } else {
            result = "введите другое число";
        }


        System.out.println(result);
    }

    public String numToStr() {
        int tmp = Math.abs(this.num);
        String result = "";

        if (tmp < 20) {
            result = this.BELLOW_TWENTY[tmp];
        }

        return result;
    }
}