package homework_4;

public class NumsToString {
    private int num;

    NumsToString(int num) {
        this.num = num;
    }

    public void numToStr() {
        String[] bellowTwenty = { "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
        String[] tens = { "сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
        String result = this.num < 0 ? "минус " : "";

        System.out.println(result);
    }
}
