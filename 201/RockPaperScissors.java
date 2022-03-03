/*
Leland Sumner
CIS 201
Section 003
Assignment 9
*/
import java.util.*;
public class RockPaperScissors {
    public static void main (String[] args) {
        introduction();
        Scanner console = new Scanner(System.in);
        int duels = getDuels(console);
        System.out.println("Number of duels entered: " + duels);
        playManyGames(duels);
    }
    public static void introduction() {     //prints introduction paragraph
        System.out.println();
        System.out.println ("This program plays duels of Rock­Paper­Scissors \nagainst the computer.  You'll type in your guess \nof (R)ock, (P)aper, or (S)cissors and try to \nbeat the computer as many times as you can.\n");
    }
    public static int getDuels(Scanner input) {    //sets number of duels per round
        System.out.print("Best out of how many duels (must be odd)? ");
        int odd = input.nextInt();
        while(odd <= 0 || odd % 2 == 0) {
            System.out.println("Invalid number of duels.  Type a positive odd number!");
            System.out.print("Best out of how many duels (must be odd)? ");
            odd = input.nextInt();
        }
        return odd;
    }
    public static void playManyGames(int duels) {     //plays 1 round of duels
        Scanner console = new Scanner(System.in);
        int totalDuels =0;    //total duels
        int wins = 0;    // user wins
        int losses = 0;    //user losses (computer wins)
        do {
            for (int i=1 ; i<= duels; i++) {
                System.out.println("Duel " + i + ": ");
                totalDuels++;
                int winner = playDuel(console);
                if (winner == 1) {
                    wins++;
                }else if (winner == 2) {
                    losses++;
                }
            }
        } while (playAgain(console));   //repeats until they dont want to play
        reportStats(totalDuels, wins, losses);
    }
    public static boolean playAgain (Scanner input) { 
        System.out.print("Do you want to play again? ");
        String yes = input.next();
        return yes.equals("y") || yes.equals("Y");
    }
    public static int playDuel(Scanner weapon) {   //plays each individual duel
        String user = getUserWeapon(weapon);
        String comp = getRandomWeapon();
        if ((user.equals("R") && comp.equals("S")) || (user.equals("P") && comp.equals("R")) || (user.equals("S") && comp.equals("P"))) {    //user wins
            System.out.println("You win!");
            return 1;
        } else if (user.equals(comp)) { //tie
            System.out.println ("Tie!");
            return 3;
        } else {    //user looses
            System.out.println("You loose!");
            return 2;
        }
    }
    public static String getUserWeapon(Scanner weapon) {    //asks user for weapon
        System.out.print("Choose your weapon? ");
        String w = weapon.next().toUpperCase();
        while (!(w.equals("R") || w.equals("P") || w.equals("S"))) {
            System.out.println("Incorrect input!");
            System.out.print("Choose your weapon? ");
            w = weapon.next().toUpperCase();
        }
        return w;
    }
    public static String getRandomWeapon() {    //chooses random weapon for computer
        Random r = new Random();
        int w = r.nextInt(3);
        String choose;
        if (w == 0) {
            choose = "R";
        } else if (w == 1) {
            choose = "P";
        } else {
            choose = "S";
        }
        System.out.println("I choose the weapon: " + choose);
        return choose;
    }
    public static void reportStats(int total, int wins,int losses) {     //reports statistics of duels
        System.out.println("Overall results:");
        System.out.println("total duels = " + total);
        System.out.println("wins = " + wins);
        System.out.println("losses = " + losses);
        System.out.println("ties = " + (total - (wins + losses)));
        double rate = Math.round(((double) wins/(double) total)*10000)/100.0;
        System.out.println("win % = " + rate);
    }

}
