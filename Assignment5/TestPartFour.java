import java.util.Iterator;
import java.util.Scanner;
/**
 * Write a description of class AutoTestOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPartFour {

    private TestPartFour() {}
    
    public static void printAthlete(final Athlete athlete) {
        System.out.printf("Athlete number: %s\n", athlete.getRaceNumber());

		/*
		* Your code here.
		*/
	}
        
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of athlete data in the form '<race number> [<split time>, ..., <split time>] ':");
        Athlete athlete = new Athlete(input.nextLine());
        TestPartFour.printAthlete(athlete);
    }
}
