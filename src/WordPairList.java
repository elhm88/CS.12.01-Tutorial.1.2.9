import java.util.ArrayList;
import java.util.List;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    // Constructor
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
                // Must call the constructor(^^)! To create new WordPair objects
            }
        } // No need to worry about duplicates, because the first element has to be smaller than the second, and my algorithm follows that increasing order
    }

    // Method - numMatches
    public int numMatches()
    {
        int count = 0;
        for (WordPair pair : allPairs) {
            if(pair.getFirst().equals(pair.getSecond())) { // Checking the Strings in each WordPair object! Not checking each WordPair objects against the others in allPairs.
                count++;
            }
        }
        return count;
    }

    // getAllPairs method (to pass test)
    public List<WordPair> getAllPairs() {
        return allPairs;
    }
}
