public class SentenceTest {
    public static void main(String[] args) {
        System.out.println("Matthew Vine – Assignment #4\n");

        // Create the builder
        Sentence sentenceBuilder = new Sentence();

        // 20 times
        for (int i = 0; i < 20; i++) {
            // Print a new random sentence
            System.out.println(sentenceBuilder.getSentence());
        }
    }
}
