package homework_5;

public class HWMain {
    public static void main(String[] args) {
        DataContainer<Integer> dataContainer = new DataContainer<>(Integer.class, 100);
        ComparatorInteger comparatorInteger = new ComparatorInteger();

        System.out.println(dataContainer.add(58));
        System.out.println(dataContainer.add(59));
        System.out.println(dataContainer.add(60));
        System.out.println(dataContainer.add(61));
        System.out.println(dataContainer.add(52));
        System.out.println(dataContainer.add(53));
        System.out.println(dataContainer.add(54));
        System.out.println(dataContainer.add(55));
        System.out.println(dataContainer.add(56));
        System.out.println(dataContainer.add(57));
        System.out.println(dataContainer.add(50));
        System.out.println(dataContainer.add(51));

        System.out.println(dataContainer.get(324));

        System.out.println("----------");

        Integer[] mass1 = dataContainer.getItems();
        for (Integer integer : mass1) {
            System.out.println(integer);
        }

        System.out.println("----------");

        System.out.println(dataContainer.get(2));

        System.out.println("----------");

            dataContainer.delete(2); //тут всё ок

        Integer[] mass2 = dataContainer.getItems();
        for (Integer integer : mass2) {
            System.out.println(integer);
        }

        System.out.println("----------");
        dataContainer.delete(Integer.valueOf(56)); //а вот тут приходится явно преобразовывать тип

        Integer[] mass3 = dataContainer.getItems();
        for (Integer integer : mass3) {
            System.out.println(integer);
        }

        System.out.println("----------");

        System.out.println(dataContainer.toString());


        System.out.println("----------");

        dataContainer.sort(comparatorInteger);
        
        Integer[] mass4 = dataContainer.getItems();
        for (Integer integer : mass4) {
            System.out.println(integer);
        }

    }
}
