package homework_6;

import java.util.ArrayList;
import java.util.List;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        long count = 0;

        text = text + " ";
        int idxOfNextWord = 0;
        List<String> list = new ArrayList<>();

        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i)== ' ')
            {
                list.add(text.substring(idxOfNextWord, i));
                idxOfNextWord = i + 1;
            }
        }

        while (list.indexOf(word) > -1) {
            list.set(list.indexOf(word), "");
            count++;
        }

        return count;
    }
}
