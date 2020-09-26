// Import random library for coinflip decision
import java.util.Random;

//declare class CoinFlip
public class CoinFlip {

    //driver for coinflip testing
    public static void main(String[] args) throws InterruptedException {

        //welcome message
        System.out.println("Welcome to Coin Flipper!!!");

        //instance of a class FlipAnimator and execution of printflip method
        new FlipAnimator().printFlip();

        //execute main coinflip method
        coinFlip();
    }
    static void coinFlip() {
        // initialize random object to make a random selector of heads and tails
        Random rand1 = new Random();

        // set bounds for random number generator
        // the number 2 represents the array count (0 and 1), not the actual number which is output
        int upperBound = 2;

        // select random number using Random object and the defined upper bound
        int int_random = rand1.nextInt(upperBound);

        // switch case for logic and printing
        switch (int_random) {
            case 0:
                // print heads ascii art
                System.out.println("               `:/+ssssssssssss+/:`               \n" +
                        "           `:oyo/:-   .:: :.   --/oso/`           \n" +
                        "         :sy/.`-.-:.  `..`.`   :. -`./ss:         \n" +
                        "       +y+. ::...   `-.``````..` `-`..`.+y+`      \n" +
                        "     :y+.-. ``   `:-.      .-/---`  ..`-.`/h/     \n" +
                        "   `ss...--`    -/`    ``--   .-.`    `. ...ss`   \n" +
                        "  `h+   ``      s        -`     ..      `.   +h.  \n" +
                        " `h+            /   `.:   /    --.            +h` \n" +
                        " yo             /   +./. `/   -:+.             oy \n" +
                        ":h.             +`  .:-:  `/`   ` .            .h:\n" +
                        "y+              `:`  `:-   .`  `-:-`            +y\n" +
                        "h/               `o`   ..  .  `.:.              /h\n" +
                        "d/                .o`    `/.`.` ..              :d\n" +
                        "h/ -`.-.-.---.-- `s-      :-.----:              /h\n" +
                        "y+ --.-.-.-..````+`     `. ``-                  +y\n" +
                        ":h.            .-  `..  `+.:--`                .h:\n" +
                        " yo           :.    ` -- .s---/.   `........`  oy \n" +
                        " `h+        `+`     `---: h/ -:`..``-:-::-.-  +h` \n" +
                        "  `h+      `+`      --`:/ .y. -/` ..``       +h.  \n" +
                        "   `ss.    o          ::-- `h` .-  --`     .ss`   \n" +
                        "     /h/`  o           +.o- -/  -`  -..  `/h/     \n" +
                        "       +y+..+/`         .o.: .   .`` ::.+y+`      \n" +
                        "         :ss/.---.       /. :`  `...:/ss:         \n" +
                        "           `/oyo/:/:::--.-:----://oyo/`           \n" +
                        "               `:/osssssssssssso/:`    ");

                // print outcome in text
                System.out.println("You flipped heads");
                break;
            case 1:
                // print tails ascii art
                System.out.println("                 .---------:---..                  \n" +
                        "            .-:/-/://-/.+../:/-:/--`              \n" +
                        "          --:-.`:-:-.....  .. `::/-/-.            \n" +
                        "        -//::-. `..  -.``..-``...-///:-.          \n" +
                        "      `/:o-:-`    /.`--::::+..-   ..+-:::         \n" +
                        "     .-/:..`          ------        `::+:/`       \n" +
                        "    .-///.   :.....--.....--........- -`:-/       \n" +
                        "    /::.:    +...--...-....-........+    /`:      \n" +
                        "   :.o     :.::--:--:///:::-::/::-::+:   `:/      \n" +
                        "   +/s     :+`:/.`+/..//.:/.`:: ..: :/    /--     \n" +
                        "   ++h     /+ `:- /:  :: -:. :- `:/ :+    / /     \n" +
                        "   :/y.    :/``:: /-  :: .-- :: `-: :-    / :     \n" +
                        "   :.y+    /:-.:/-+::-//--::-/:.-::.:/    +-`     \n" +
                        "   `-os`  /`                         `:  .:+      \n" +
                        "    --ss ..--......`..---..........-:--. o:.      \n" +
                        "     :-so   ```                   `.    +--       \n" +
                        "      --ss -  -.`               `.-.  .::-        \n" +
                        "       `-+o/..-/`-`-.` `.` -.`-../ ..::-`         \n" +
                        "         -:+:..`: :.`  -   -.  . `/:/:`           \n" +
                        "            -://.-/:    ... ::/-:/:-              \n" +
                        "               `-..:+///////:..-.   ");

                // print outcome in text
                System.out.println("You flipped tails");
                break;
        }
    }
}
class FlipAnimator {
    // creates a 2D array to hold the frames of the coin flipping animation
    String [][] coins;

    // Flip constructor, adds coin to 2d array
    public FlipAnimator() {

        coins = new String[][]{
                {
                        //coin frame 1
                        "          ████████████",   //[0][0]
                        "      ████░░░░░░░░░░░░████", //[0][1]
                        "    ██░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░██", //[0][2]
                        "  ██░░░░▒▒░░░░░░░░░░░░▒▒░░░░██", //[0][3]
                        "  ██░░▒▒░░░░      ░░░░░░  ░░██", //[0][4]
                        "██░░▒▒░░░░░░  ░░░░▒▒░░░░░░  ░░██", //[0][5]
                        "██░░▒▒░░      ░░░░░░  ░░░░  ░░██", //[0][6]
                        "██░░▒▒░░  ░░░░░░░░░░░░▒▒░░  ░░██", //[0][7]
                        "██░░▒▒░░  ░░░░░░░░░░░░▒▒░░  ░░██", //[0][8]
                        "██░░▒▒░░░░▒▒░░░░░░▒▒▒▒▒▒░░  ░░██", //[0][9]
                        "██░░▒▒░░░░░░  ░░░░▒▒░░░░░░  ░░██", //[0][10]
                        "  ██░░▒▒░░░░░░▒▒▒▒▒▒░░░░  ░░██", //[0][11]
                        "  ██░░░░  ░░░░░░░░░░░░  ░░░░██", //[0][12]
                        "    ██░░░░            ░░░░██", //[0][13]
                        "      ████░░░░░░░░░░░░████", //[0][14]
                        "          ████████████" //[0][15]
                },
                {
                        // coin frame 2
                        "          ████████████",
                        "        ██░░░░░░░░░░░░██",
                        "      ██░░▒▒▒▒▒▒▒▒▒▒░░░░██",
                        "    ██░░▒▒░░░░░░░░░░  ░░░░██",
                        "    ██░░▒▒░░    ░░░░  ░░░░██",
                        "  ██░░▒▒░░░░  ░░▒▒░░░░  ░░░░██",
                        "  ██░░▒▒      ░░░░  ░░  ░░░░██",
                        "  ██░░▒▒  ░░░░░░░░░░▒▒  ░░▒▒██",
                        "  ██░░▒▒  ░░░░░░░░░░▒▒  ░░▒▒██",
                        "  ██░░▒▒░░▒▒░░░░▒▒▒▒▒▒  ░░▒▒██",
                        "  ██░░▒▒░░░░  ░░▒▒░░░░  ░░▒▒██",
                        "    ██░░▒▒░░░░▒▒▒▒░░  ░░▒▒██",
                        "    ██░░▒▒░░░░░░░░░░  ░░▒▒██",
                        "      ██░░          ░░▒▒██",
                        "        ██░░░░░░░░░░▒▒██",
                        "          ████████████"
                },
                {
                        // coin frame 3
                        "            ████████",
                        "          ██░░░░░░░░██",
                        "          ██░░▒▒░░░░██",
                        "        ██░░▒▒░░  ░░░░██",
                        "        ██░░▒▒    ░░░░██",
                        "        ██░░▒▒░░  ░░░░██",
                        "        ██░░▒▒    ░░░░██",
                        "        ██░░▒▒░░  ▒▒▒▒██",
                        "        ██░░▒▒░░  ▒▒▒▒██",
                        "        ██░░▒▒▒▒  ▒▒▒▒██",
                        "        ██░░▒▒▒▒  ▒▒▒▒██",
                        "        ██░░▒▒▒▒  ▒▒▒▒██",
                        "        ██░░░░░░  ▒▒▒▒██",
                        "          ██░░  ▒▒▒▒██",
                        "          ██░░░░▒▒▒▒██",
                        "            ████████"
                },
                {
                        // coin frame 4
                        "            ████████",
                        "            ██░░░░██",
                        "            ██░░░░██",
                        "            ██░░░░██",
                        "            ██░░░░██",
                        "            ██░░░░██",
                        "            ██░░░░██",
                        "            ██▒▒▒▒██",
                        "            ██▒▒▒▒██",
                        "            ██▒▒▒▒██",
                        "            ██▒▒▒▒██",
                        "            ██▒▒▒▒██",
                        "            ██▒▒▒▒██",
                        "            ██▒▒▒▒██",
                        "            ██▒▒▒▒██",
                        "            ████████"
                },
        };

    }
    // method to print the frames and clear terminal after each frame so that the animation looks smooth
    public void printFlip() throws InterruptedException {
        //begin the poe
        System.out.println();
        System.out.println("Flipping Coin");
        int i = 0;
        while (i < 5){
            System.out.println(coins[0][0]);
//            Thread.sleep(100);
//            System.out.print("\033[H\033[2J");
            System.out.println(coins[1]);
//            Thread.sleep(100);
//            System.out.print("\033[H\033[2J");
            System.out.println(coins[2]);
//            Thread.sleep(100);
//            System.out.print("\033[H\033[2J");
            System.out.println(coins[3]);
//            Thread.sleep(100);
//            System.out.print("\033[H\033[2J");
            i++;
        }
    }
}