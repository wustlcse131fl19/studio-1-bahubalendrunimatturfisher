package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("What's your name?");
		String s1 = ap.nextString("What's your friend's name?");
		String s2 = ap.nextString("What's your other friend's name?");
		String s3 = ap.nextString("What's your other other friend's name?");
		System.out.println("Greetings " + s0 + ", " + s1+ ", " + s2 + ", and " + s3 + ".");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
