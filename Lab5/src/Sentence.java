import java.util.ArrayList;
import java.util.Collection;

public class Sentence {
    private SentenceMember[] sentenceMembers;

    public Sentence(String sentenceString) {
        String[] sentenceMemberStrings = sentenceString.split("( |(?=[.?!,:;]))");
        sentenceMembers = new SentenceMember[sentenceMemberStrings.length];
        for (int i = 0; i < sentenceMemberStrings.length; i++) {
            String sentenceElement = sentenceMemberStrings[i];
            if (sentenceElement.matches("[.?!,:;]")) {
                sentenceMembers[i] = new Punctuation(sentenceElement);
            } else {
                sentenceMembers[i] = new Word(sentenceElement);
            }
        }
    }

    public static void checkAppearanceOfKeywords(Sentence[] sentences, String[] keywords) {
        int counter = 0;
        for (Sentence sentence : sentences) {
            Matching:
            {
                for (String word : keywords) {
                    if (!sentence.getWords().contains(word)) break Matching;
                }
                counter++;
                System.out.println(sentence);
            }
        }
        System.out.println("\nNumber of complete matches: " + counter);
    }

    private Collection<String> getWords() {
        ArrayList<String> words = new ArrayList<>();
        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember instanceof Word) {
                words.add(sentenceMember.toString());
            }
        }
        return words;
    }


    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();

        for (int i = 0; i < sentenceMembers.length - 1; i++) {
            sentenceString.append(sentenceMembers[i].toString());
            if (sentenceMembers[i + 1] instanceof Word) {
                sentenceString.append(" ");
            }
        }
        sentenceString.append(sentenceMembers[sentenceMembers.length - 1].toString());

        return sentenceString.toString();
    }
}
