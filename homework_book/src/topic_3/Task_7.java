package topic_3;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println(checkHole(20, 20, 2));
    }

    public static boolean checkHole(int a, int b, int r) {
        boolean isCheck = false;

        double rectangleArea = a * b;
        double circleArea = Math.PI * r * r;

        if(rectangleArea > circleArea) {
            isCheck = false;
        } else {
            isCheck = true;
        }

        return isCheck;
    }
}
