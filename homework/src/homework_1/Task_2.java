package homework_1;

public class Task_2 {
    public static void main(String[] args) {
        int i = 2;
        int y = 8;

        System.out.println("1) 5 + 2 / 8 = " + (5 + 2 / 8));
        System.out.println("2) (5 + 2) / 8 = " + ((5 + 2) / 8));
        System.out.println("3) (5 + i++) / 8 = " + ((5 + i++) / 8)); //i=3
        System.out.println("4) (5 + i++) / --y = " + ((5 + i++) / --y)); //i=3 y=7  / после i=4
        System.out.println("5) (5 * 2 >> i++) / --y = " + ((5 * 2 >> i++) / --y)); //i=4 y=6  / после i=5
        System.out.println("6) (5 + 7 > 20 ? 68 : 22 * 2 >> i++) / --y = " + ((5 + 7 > 20 ? 68 : 22 * 2 >> i++) / --y)); //i=5 y=5  / после i=6
        //System.out.println("7) (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> i++) / --y = " + ((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> i++) / --y));
        System.out.println("8) 6 - 2 > 3 && 12 * 12 <= 119 =  " + (6 - 2 > 3 && 12 * 12 <= 119));
        System.out.println("9)true && false =  " + (true && false));

        // 1) 2/8 = 0 т.к. в int отбрасывается дробная часть
        // 2) 7/2 = 0 т.к. в int отбрасывается дробная часть
        // 3) 7/2 = 0 т.к. постфиксный инкремент увеличивает значение после вычисления
        // 4) 8/7 = 1 т.к. префиксный декремент выполниться до вычисления
        // 5) 10>>4 = 0/6 = 0
        // 6) 12>20 - false => 44>>5=1/5 = 0 т.к. в int отбрасывается дробная часть
        // 7) Не компилируется из-за разных типов возвращаемых тернарным оператором: boolean если true и int если false.
        // 8) 4>3 -> true, 144<=119 -> false => т.к. одно из выражений ложное - и весь ответ ложный
        // 9) т.к. одно из выражений ложное - и весь ответ ложный
    }
}
