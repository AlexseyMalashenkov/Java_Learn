package operators;

public class OperatorsMain4 {

    public static void main(String[] args) {
        boolean isHomeWorkDone = true;
        boolean isDish = true;

        if(isHomeWorkDone) {
            System.out.println("Играем в компьютер =)");
        } else if(isDish){
            System.out.println("+-");
        }

        int dayNumber = 3;

        switch (dayNumber) {
            default:
                System.out.println("Неизвествно");
            case 1:
                System.out.println("Понедельник");
                //break;
            case 2:
                System.out.println("Вторник");
                break;
        }
    }
}
