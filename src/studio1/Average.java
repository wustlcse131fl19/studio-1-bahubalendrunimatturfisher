package studio1;
import support.cse131.ArgsProcessor;
public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1 = ap.nextDouble("The first of two integers to be averaged?");
        double n2 = ap.nextDouble("The second of two integers to be averaged?");

        double average = (n1 + n2) / 2;
        System.out.println("Average of " + n1 + " and " + n2 + " is " + average);
    }
}
