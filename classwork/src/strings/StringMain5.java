package strings;

public class StringMain5 {
    public static void main(String[] args) {
        String name = "Алексей";
        String result = name.concat(", научи меня писать код");

        System.out.println(name);
        System.out.println(result);

        String number = String.valueOf(1);

        System.out.println(number);
        System.out.println(String.valueOf(true));

        String joinStr = String.join(" Привет:", new String[]{"Имя1", "Имя2", "Имя3"});

       // System.out.println(joinStr);

        System.out.println(join(", ", new String[]{"Имя1", "Имя2", "Имя3"}));
    }

    public static String join(String delimiter, String[] arr) {
        if(arr == null || arr.length == 0) {
            return "";
        }
        String result = arr[0] == null ? "" : arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != null) {
                if (result.length() > 0) {
                    result += delimiter;
                }
                result += arr[i];
            }
        }

        return result;
    }
}
