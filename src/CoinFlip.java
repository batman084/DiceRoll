import java.util.Random;


public class CoinFlip {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Coin Flipper!!!");
        new FlipAnimator().printFlip();
        coinFlip();
        // main function to run the coin flipper method
    }
    static void coinFlip() {
        // initialize random object to make a random selector of heads and tails
        Random rand1 = new Random();
        int upperBound = 2;
        int int_random = rand1.nextInt(upperBound);
        switch (int_random) {
            case 0:
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
                System.out.println("You flipped heads");
                break;
            case 1:
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
                System.out.println("You flipped tails");
                break;
        }
    }
}
class FlipAnimator {
    // creates a 2D array to hold the frames of the coin flipping animation
    String [][] coins;

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

        // // monkeys (non-primitive) defined in constructor knows its length
        // int monkeyCount = coins.length;
        // for (int i = monkeyCount; i >= 0; i--)  //loops through 2D array length backwards
        // {

        //     //this print statement shows current count of Monkeys
        //     //  concatenation (+) of the loop variable and string to form a countdown message

        //     //how many separate parts are there in a monkey monkey?
        //     for (int row = 0; row < monkeyCount; row++) {  //cycles through "cells" of 2d array

        //     /*cycles through columns to print
        //     each monkey part by part, will eventually print entire column*/
        //         for (int col = 0; col < coins[row].length; col++) {

        //             // prints specific part of the monkey from the column
        //             System.out.print(coins[row][col] + " ");

        //             //this is new line between separate parts
        //             System.out.println();
        //         }

        //         //this new line gives separation between stanza of poem
        //         System.out.println();
        //     }

        //     //countdown for poem, decrementing monkeyCount variable by 1
        //     monkeyCount -= 1;
        // }
    }
}