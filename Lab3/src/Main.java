import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Lab3
        C3 = (0) StringBuilder
        C17 = (9) Задано текст та масив слів. Підрахувати у скількох реченнях зустрічається кожне слово масиву.
        */

        StringBuilder strBuildText = new StringBuilder("Donec lobortis justo id facilisis imperdiet. Mauris suscipit sem " +
                "ac ullamcorper efficitur. Pellentesque sit amet felis eu tellus accumsan vulputate at lobortis nulla. " +
                "Praesent vestibulum odio sit amet bibendum dictum. Pellentesque habitant morbi tristique senectus et " +
                "netus et malesuada fames id turpis egestas. Maecenas maximus purus non lorem aliquet efficitur. Ut mattis " +
                "quam et dui aliquet, et tempor mauris dignissim. Sed pellentesque fermentum velit. Cras maximus velit " +
                "neque, in vestibulum erat tincidunt ac. Vivamus varius tortor eu et urna tristique, id mollis lorem gravida.");

        String[] strWords = {"et", "id"};

        List<StringBuilder> sentences = new ArrayList<>();

        BreakIterator splitToSentences = BreakIterator.getSentenceInstance();
        splitToSentences.setText(strBuildText.toString());
        int start = splitToSentences.first();
        for (int end = splitToSentences.next();
             end != BreakIterator.DONE;
             start = end, end = splitToSentences.next()) {
            sentences.add(new StringBuilder(strBuildText.substring(start, end)));
        }

        System.out.println("Keywords: " + Arrays.toString(strWords));

        int counter = 0;
        for (StringBuilder sentence : sentences) {
            Matching:
            {
                for (String word : strWords) {
                    if (!sentence.toString().toLowerCase().matches(".*\\b" + word + "\\b.*")) break Matching;
                }
                counter++;
                System.out.println(sentence);
            }
        }
        System.out.println("\nNumber of complete matches: " + counter);
    }
}