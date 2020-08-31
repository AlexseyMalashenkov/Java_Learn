package topic_3;

public class Task_1 {
    public static void main(String[] args) {
        areaTr(5, 5);
        perimeterTr(5, 5);
    }

    public static void areaTr(double a, double b) {
        System.out.println("Площадь прямоугольного треугольна со сторанами: " + a + " и " + b + " = " + (a * b) / 2);
    }

    public static void perimeterTr(double a, double b) {
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Периметр прямоугольного треугольна со сторанами: " + a + " и " + b + " = " + (a + b + c));
    }
}
