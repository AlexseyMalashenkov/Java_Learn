package topic_3;

public class Task_10 {
    public static void main(String[] args) {
        housesOnLand(20,20, 3, 3, 10, 10);
    }

    public static void housesOnLand(int a, int b, int c, int d, int e, int f) {
        int firstHouseArea = a * b;
        int secondHouseArea = c * d;
        int landArea = e * f;
        
        if(firstHouseArea + secondHouseArea <= landArea) {
            System.out.println("Дома поместятся");
        } else {
            System.out.println("Дома не поместятся");
        }
    }
}
