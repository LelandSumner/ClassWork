/*
 Write a static method named longestName that reads names typed by the user
 and prints the longest name (the name that contains the most characters) in
 the format shown below. 

Your method should accept a console Scanner and an integer n as parameters 
and should then prompt for n names.

The longest name should be printed with its first letter capitalized and 
all subsequent letters in lowercase, regardless of the capitalization the 
user used when typing in the name. 

If there is a tie for longest between two or more names, use the tied name 
that was typed earliest. Also print a message saying that there was a tie, 
as in the right log below. It's possible that some shorter names will tie 
in length, such as DANE and Erik in the left log below; but don't print a 
message unless the tie is between the longest names. 

You may assume that n is at least 1, that each name is at least 1 character 
long, and that the user will type single-word names consisting of only letters. 

After you have the method working, un-comment the third and fourth calls
to the method (in the main method) and conform that your code works for the given examples.

The following table shows two sample calls and their output: 

Call: longestName(console, 5);

Output:
name #1? roy
name #2? DANE
name #3? Erik
name #4? sTeFaNiE
name #5? LaurA
Stefanie's name is longest

Call: longestName(console, 7);
name #1? TrEnt
name #2? rita
name #3? JORDAN
name #4? craig
name #5? leslie
name #6? YUKI
name #7? TaNnEr
Jordan's name is longest
(There was a tie!)

*/

public class LongestName{
    public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	System.out.println( "Use two names of your choice for testing and debugging." );
	longestName( console, 2 );
	//System.out.println( "Use the names from the first example.");
	//longestName(console, 5);
	//System.out.println( "Use the names from the second example."
	//longestName(console, 7);
    }


    // write longestName here

}