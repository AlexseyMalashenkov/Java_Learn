package homework_6.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ParseJSON {
    public void parse() throws IllegalAccessException, InstantiationException  {
        String json = "{"
                + "\"fA\" : \"hello 11\", "
                + "\"fB\" : \"hello 22\", "
                + "\"fJ\" : 22, "
                + "\"fC\" : \"hello 33\"}";
        System.out.println("json: " + json); // json: {"fA" : "hello 11", "fB" : "hello 22", "fJ" : 22, "fC" : "hello 33"}

        Map<String, String> jsonMap = new HashMap<>();
        Pattern re = Pattern.compile("(?:,|\\{)?([^:]*):(\"[^\"]*\"|\\{[^}]*\\}|[^},]*)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
        Matcher m = re.matcher(json);
        while (m.find()) {
            jsonMap.put(trim2(m.group(1)), trim2(m.group(2)));
        }
        System.out.println("jsonMap: " + jsonMap); // jsonMap: {fJ=22, fA=hello 11, fB=hello 22, fC=hello 33}

        Double d1 = 1d;
        Double d2 = 1d;
        System.out.println(d1 == d2);

        DTO dto = DTO.class.newInstance();
        Stream.of(dto.getClass().getDeclaredFields()).forEach(field -> {
            field.setAccessible(true);
            try {
                field.set(dto, jsonMap.get(field.getName()));
            } catch (IllegalAccessException e) {
            }
        });
        System.out.println("dto: " + dto); // dto: DTO{fA='hello 11', fB='hello 22', fC='hello 33'}
    }

    public static String trim2(String value) {
        int len = value.length();
        int st = 0;
        char[] val = value.toCharArray();

        while ((st < len) && (val[st] <= ' ' || val[st] <= '\"')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ' || val[len - 1] <= '\"')) {
            len--;
        }
        return ((st > 0) || (len < value.length())) ? new String(val, st, len - st) : value;
    }

    static class DTO {
        private String fA;
        private String fB;
        private String fC;
        private String fJ;

        @Override
        public String toString() {
            return "DTO{" + "fA='" + fA + '\'' + ", fB='" + fB + '\''  + ", fJ='" + fJ + '\'' + ", fC='" + fC + '\'' + '}';
        }
    }
}
