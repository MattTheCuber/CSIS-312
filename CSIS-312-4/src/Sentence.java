public class Sentence {
    /**
     * Gets a randomized sentence
     * @return String sentence
     */
    public String getSentence() {
        // Create the word generator variable
        Word wordGenerator = new Word();
        // Create the builder and append each word followed by a space
        StringBuilder builder = new StringBuilder()
                .append(wordGenerator.getArticle())
                .append(" ")
                .append(wordGenerator.getNoun())
                .append(" ")
                .append(wordGenerator.getVerb())
                .append(" ")
                .append(wordGenerator.getPreposition())
                .append(" ")
                .append(wordGenerator.getArticle())
                .append(" ")
                .append(wordGenerator.getNoun())
                .append(".");

        // Set the first char to the uppercase version of the first char
        builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));

        // Return the builder in string form
        return builder.toString();
    }
}
