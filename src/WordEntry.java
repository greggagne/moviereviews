/**
 * An entry for a movie review
 */

public class WordEntry {
    private String word;        // the word in the move

    private int totalScore;     // the total score for the word

    private int occurrences;    // the number of occurrences the word appeared

    public WordEntry(String word, int score) {
        this.word = word;
        this.totalScore = score;
        occurrences = 1;
    }

    public void addNewOccurrence(int score) {
        totalScore += score;

        ++occurrences;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getOccurrences() {
        return occurrences;
    }
}
