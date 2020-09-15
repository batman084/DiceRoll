import java.util.Random;

public class CoinFlip {
    static void coinFlip() {
        Random rand1 = new Random();
        int[] coinFace = {1,2};
        int upperBound = 1;
        int int_random = rand1.nextInt(upperBound);
        flipAnimation();
        switch (int_random) {
            case 0:
                System.out.println("     _.-'~~`~~'-._\n" +
                        "     .'`  B   E   R  `'.\n" +
                        "    / I               T \\\n" +
                        "  /`       .-'~\"-.       `\\\n" +
                        " ; L      / `-    \\      Y ;\n" +
                        ";        />  `.  -.|        ;\n" +
                        "|       /_     '-.__)       |\n" +
                        "|        |-  _.' \\ |        |\n" +
                        ";        `~~;     \\\\        ;\n" +
                        " ;  INGODWE /      \\\\)P    ;\n" +
                        "  \\  TRUST '.___.-'`\"     /\n" +
                        "   `\\                   /`\n" +
                        "     '._   1 9 9 7   _.'\n" +
                        "        `'-..,,,..-'");
                System.out.println("You flipped heads");
                break;
            case 1:
                System.out.println();
                System.out.println("You flipped tails");
                break;
        }
    }
    static void flipAnimation() {
        System.out.println();
    }
}
