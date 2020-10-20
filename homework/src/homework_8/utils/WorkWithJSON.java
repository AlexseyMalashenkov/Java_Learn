package homework_8.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithJSON {
    public HashMap<String, String> parse(String json) {
        HashMap<String, String> jsonMap = new HashMap<>();
        Pattern re = Pattern.compile("(?:,|\\{)?([^:]*):(\"[^\"]*\"|\\{[^}]*\\}|[^},]*)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
        Matcher m = re.matcher(json);

        while (m.find()) {
            jsonMap.put(trim2(m.group(1)), trim2(m.group(2)));
        }

        return jsonMap;
    }

    private String trim2(String value) {
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

    public String findInJSONString(HashMap<String, String> json, String findStr) {
        return json.get(findStr);
    }
}
