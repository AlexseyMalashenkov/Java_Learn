package homework_5;

public class HWMain {
    public static void main(String[] args) {
        DataContainer<Integer> dataContainer = new DataContainer<>(Integer.class, 1);

        System.out.println(dataContainer.add(50));
        System.out.println(dataContainer.add(51));
        System.out.println(dataContainer.add(52));
        System.out.println(dataContainer.add(53));
        System.out.println(dataContainer.add(54));
        System.out.println(dataContainer.add(55));
        System.out.println(dataContainer.add(56));
        System.out.println(dataContainer.add(57));
        System.out.println(dataContainer.add(58));
        System.out.println(dataContainer.add(59));
        System.out.println(dataContainer.add(60));
        System.out.println(dataContainer.add(61));

        System.out.println("----------");

        Integer[] mass1 = dataContainer.getItems();
        for (Integer integer : mass1) {
            System.out.println(integer);
        }

        System.out.println("----------");

        System.out.println(dataContainer.get(2));

        System.out.println("----------");

        dataContainer.delete(2);

        Integer[] mass2 = dataContainer.getItems();
        for (Integer integer : mass2) {
            System.out.println(integer);
        }
    }
}
