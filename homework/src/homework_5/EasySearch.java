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
}
