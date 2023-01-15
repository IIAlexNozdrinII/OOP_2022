import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String textString = "Donec lobortis justo id facilisis imperdiet. Mauris suscipit sem " +
                "ac ullamcorper efficitur. Pellentesque sit amet felis eu tellus accumsan vulputate at lobortis nulla. " +
                "Praesent vestibulum odio sit amet bibendum dictum. Pellentesque habitant morbi tristique senectus et " +
                "netus et malesuada fames turpis egestas. Maecenas maximus purus non lorem aliquet efficitur. Ut mattis " +
                "quam et dui aliquet, et tempor mauris dignissim. Sed pellentesque fermentum velit. Cras maximus velit " +
                "neque, in vestibulum erat tincidunt ac. Vivamus varius tortor eu urna tristique, id mollis lorem gravida.";

        String[] strWords = {"et", "id"};

        Text text = new Text(textString);

        System.out.println("Keywords: " + Arrays.toString(strWords));
        text.checkAppearanceOfKeywords(strWords);
    }
}
