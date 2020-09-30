// Import random library for coinflip decision
import java.util.Random;

//declare class CoinFlip
public class CoinFlip {

    static void coinFlip() throws InterruptedException{
        System.out.println("Welcome to Coin Flipper!!!");
        //run animation frame method
        animationFrames();
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
                System.out.println("You flipped heads!!! \n");
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
                System.out.println("You flipped tails!!! \n");
                break;
        }
    }

    public static void animationFrames() throws InterruptedException{
        String [][] coins;


        coins = new String[][]{
                {
                        "          ████████████ \n"+
                                "      ████░░░░░░░░░░░░████ \n"+
                                "    ██░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░██ \n"+
                                "  ██░░░░▒▒░░░░░░░░░░░░▒▒░░░░██ \n"+
                                "  ██░░▒▒░░░░      ░░░░░░  ░░██ \n"+
                                "██░░▒▒░░░░░░  ░░░░▒▒░░░░░░  ░░██ \n"+
                                "██░░▒▒░░      ░░░░░░  ░░░░  ░░██ \n"+
                                "██░░▒▒░░  ░░░░░░░░░░░░▒▒░░  ░░██ \n"+
                                "██░░▒▒░░  ░░░░░░░░░░░░▒▒░░  ░░██ \n"+
                                "██░░▒▒░░░░▒▒░░░░░░▒▒▒▒▒▒░░  ░░██ \n"+
                                "██░░▒▒░░░░░░  ░░░░▒▒░░░░░░  ░░██ \n"+
                                "  ██░░▒▒░░░░░░▒▒▒▒▒▒░░░░  ░░██ \n"+
                                "  ██░░░░  ░░░░░░░░░░░░  ░░░░██ \n"+
                                "    ██░░░░            ░░░░██ \n"+
                                "      ████░░░░░░░░░░░░████ \n"+
                                "          ████████████ \n"
                },
                {
                        // coin frame 2
                        "          ████████████\n"+
                                "        ██░░░░░░░░░░░░██\n"+
                                "      ██░░▒▒▒▒▒▒▒▒▒▒░░░░██\n"+
                                "    ██░░▒▒░░░░░░░░░░  ░░░░██\n"+
                                "    ██░░▒▒░░    ░░░░  ░░░░██\n"+
                                "  ██░░▒▒░░░░  ░░▒▒░░░░  ░░░░██\n"+
                                "  ██░░▒▒      ░░░░  ░░  ░░░░██\n"+
                                "  ██░░▒▒  ░░░░░░░░░░▒▒  ░░▒▒██\n"+
                                "  ██░░▒▒  ░░░░░░░░░░▒▒  ░░▒▒██\n"+
                                "  ██░░▒▒░░▒▒░░░░▒▒▒▒▒▒  ░░▒▒██\n"+
                                "  ██░░▒▒░░░░  ░░▒▒░░░░  ░░▒▒██\n"+
                                "    ██░░▒▒░░░░▒▒▒▒░░  ░░▒▒██\n"+
                                "    ██░░▒▒░░░░░░░░░░  ░░▒▒██\n"+
                                "      ██░░          ░░▒▒██\n"+
                                "        ██░░░░░░░░░░▒▒██\n"+
                                "          ████████████\n"
                },
                {
                        // coin frame 3
                        "            ████████\n"+
                                "          ██░░░░░░░░██\n"+
                                "          ██░░▒▒░░░░██\n"+
                                "        ██░░▒▒░░  ░░░░██\n"+
                                "        ██░░▒▒    ░░░░██\n"+
                                "        ██░░▒▒░░  ░░░░██\n"+
                                "        ██░░▒▒    ░░░░██\n"+
                                "        ██░░▒▒░░  ▒▒▒▒██\n"+
                                "        ██░░▒▒░░  ▒▒▒▒██\n"+
                                "        ██░░▒▒▒▒  ▒▒▒▒██\n"+
                                "        ██░░▒▒▒▒  ▒▒▒▒██\n"+
                                "        ██░░▒▒▒▒  ▒▒▒▒██\n"+
                                "        ██░░░░░░  ▒▒▒▒██\n"+
                                "          ██░░  ▒▒▒▒██\n"+
                                "          ██░░░░▒▒▒▒██\n"+
                                "            ████████\n\n"
                },
                {
                        // coin frame 4
                        "            ████████\n"+
                                "            ██░░░░██\n"+
                                "            ██░░░░██\n"+
                                "            ██░░░░██\n"+
                                "            ██░░░░██\n"+
                                "            ██░░░░██\n"+
                                "            ██░░░░██\n"+
                                "            ██▒▒▒▒██\n"+
                                "            ██▒▒▒▒██\n"+
                                "            ██▒▒▒▒██\n"+
                                "            ██▒▒▒▒██\n"+
                                "            ██▒▒▒▒██\n"+
                                "            ██▒▒▒▒██\n"+
                                "            ██▒▒▒▒██\n" +
                                "            ██▒▒▒▒██\n" +
                                "            ████████\n"
                },
        };

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.println(coins[j][0]);
                Thread.sleep(100);
                System.out.print("\033[H\033[2J");
            }
            for (int r = 2; r < 0; r--) {
                System.out.println(coins[r][0]);
                Thread.sleep(100);
                System.out.print("\033[H\033[2J");
            }
        }
        System.out.println("And.......");
        Thread.sleep(1000);

    }

}
