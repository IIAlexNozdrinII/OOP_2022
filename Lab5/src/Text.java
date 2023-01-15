public class Text {
    private Sentence[] sentences;

    public Text(String text) {
        String[] sentenceStrings = text.split("(?<=[.!?]) ");
        sentences = new Sentence[sentenceStrings.length];
        for (int i = 0; i < sentenceStrings.length; i++) {
            sentences[i] = new Sentence(sentenceStrings[i]);
        }
    }


    @Override
    public String toString() {
        StringBuilder textStringBuilder = new StringBuilder();
        for (int i = 0; i < sentences.length - 1; i++) {
            textStringBuilder.append(sentences[i]).append(" ");
        }
        textStringBuilder.append(sentences[sentences.length - 1]);
        return textStringBuilder.toString();
    }

    public void checkAppearanceOfKeywords(String[] keywords) {
        Sentence.checkAppearanceOfKeywords(sentences, keywords);
    }
}
