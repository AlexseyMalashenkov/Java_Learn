package homework_5;

public class PrimitivEasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        int M = word.length();
        int N = text.length();
        long count = 0;

        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (text.charAt(i + j) != word.charAt(j)) {
                    break;
                }
            }
            if (j == M) {
                count++;
            }
        }
        return count;
    }
}
