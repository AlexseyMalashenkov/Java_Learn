package homework_5;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        long count = 0L;
        for (int i = text.indexOf(word); i >= 0; i = text.indexOf(word, i + 1)) {
            count++;
        }
        return count;
    }

    public long findWordUpgrade(String textString, String word) {
        int wordLength = 0;
        long count = 0L;
        int index = 0;

        while(index != -1){
            index = textString.indexOf(word, index + wordLength);
            if (index != -1) {
                count++;
            }
            wordLength = word.length();
        }
        return count;
    }
}
