import java.util.Random;

public class Word {
    // String arrays for the different words
    private final String[] articles = {"the", "a", "one", "some", "any"};
    private final String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private final String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private final String[] prepositions = {"to", "from", "over", "under", "on"};
    // Random variable
    private final Random random = new Random();

    /**
     * Gets a random article
     * @return String random article
     */
    public String getArticle() {
        return articles[random.nextInt(articles.length)];
    }

    /**
     * Gets a random noun
     * @return String random noun
     */
    public String getNoun() {
        return nouns[random.nextInt(nouns.length)];
    }

    /**
     * Gets a random verb
     * @return String random verb
     */
    public String getVerb() {
        return verbs[random.nextInt(verbs.length)];
    }

    /**
     * Gets a random preposition
     * @return String random preposition
     */
    public String getPreposition() {
        return prepositions[random.nextInt(prepositions.length)];
    }
}
