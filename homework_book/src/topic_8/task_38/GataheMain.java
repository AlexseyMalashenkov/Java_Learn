package topic_8.task_38;

public class GataheMain {
    public static void main(String[] args) {
        Car car = new Car("Машина");
        Motorcycle motorcycle = new Motorcycle("Мотоцикл");
        Garage garage1 = new Garage(car);
        Garage garage2 = new Garage(motorcycle);
        System.out.println(garage1.getVehicle().getName());
        System.out.println(garage2.getVehicle().getName());
    }
}
