/*
Leland Sumner
CIS 201
Assignment 07
*/
import java.util.* ;

public class Admit {
    public static void main (String[] args) {
        System.out.println();
        System.out.println("This program compares two applicants to");
        System.out.println("determine which one is the stronger candidate.");
        System.out.println("For each candidate please provide either SAT");
        System.out.println("or ACT scores, plus a weighted GPA.");
        System.out.println();
        System.out.println("Information for first applicant:");
        double a = score();
        System.out.println("Information for second applicant:");
        double b = score();
        System.out.println();
        System.out.println("First applicant overall score = " + a);
        System.out.println("Second applicant overall score = " + b);
        System.out.println();
        if (a > b) {
            System.out.println("The first applicant is better qualified.");
        } else if (b > a) {
            System.out.println("The second applicant is better qualified.");
        }
        else {  // a == b
            System.out.println("The applicants are equally qualified.");
        }

    }
    public static double score () { //calculates scores for applicants
        Scanner console = new Scanner(System.in); 
        System.out.print("do you have 1) SAT scores or 2) ACT scores?");
        int sa = console.nextInt();
        double score = 0 ;
        if (sa == 1) {      //SAT score
            System.out.print("SAT math? ");
            double math = console.nextDouble();
            satcheck(math);
            System.out.print("SAT verbal? ");
            double verbal = console.nextDouble();
            satcheck(verbal);
            score = (verbal + math - 400) / 12;
        } else if (sa == 2) {     //ACT score
            System.out.print("ACT English? ");
            double english = console.nextDouble();
            actcheck(english);
            System.out.print("ACT math? ");
            double math = console.nextDouble();
            actcheck(math);
            System.out.print("ACT reading? ");
            double reading = console.nextDouble();
            actcheck(reading);
            System.out.print("ACT science? ");
            double science = console.nextDouble();
            actcheck(science);
            score = (science + math + reading + english - 4) /1.4;
        } else {     //if they dont choose SAT or ACT
            System.out.println("YOU'RE A CHEATER.");
            System.exit (0);
        }
        System.out.print("Overall GPA? ");
        double actual = console.nextDouble();
        System.out.print("Maximum GPA? ");
        double max = console.nextDouble();
        double GPA = (actual/max)*100;
        if (GPA > 100 || GPA < 0) {      //checks GPA scores
            System.out.println ("YOU'RE A CHEATER.");
            System.exit (0);
        }

        return score + GPA;
        
    }
    public static void satcheck (double c) {      //checks SAT scores
        if (c < 200 || c > 800) {
            System.out.println ("YOU'RE A CHEATER.");
            System.exit (0);
        }
    }
     public static void actcheck (double c) {    //checks ACT scores
        if (c < 1 || c > 36) {
            System.out.println ("YOU'RE A CHEATER.");
            System.exit (0);
        }
    }
}