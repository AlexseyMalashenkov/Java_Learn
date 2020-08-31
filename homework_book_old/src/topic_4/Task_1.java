package topic_4;

public class Task_1 {
    public static void main(String[] args) {
        int a = -3; // Начальное значение диапазона - "от"
        int b = 3; // Конечное значение диапазона - "до"

        double random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);
    }
}
