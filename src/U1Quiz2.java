import java.util.Arrays;
import java.util.Scanner;

public class U1Quiz2 {

	public static void main(String[] args) {
		
		System.out.println("How many values will you put into the array?");
		Scanner numberofValues = new Scanner(System.in);
		int inputLength = numberofValues.nextInt();
		int [] values = new int [inputLength];
		
		for (int i = 0; i < values.length; i++) {
			System.out.println("Enter a value.");
			Scanner value = new Scanner(System.in);
			values [i] = value.nextInt();
		}
		
		//this calculates the average
		double total = 0;
		for (int i = 0; i < values.length; i++) {
			total += values[i];
		   }
		   int average = (int)(total/values.length);
		   System.out.println("The average value is " + average + ".");
		   //take this out before pushing: gradeLetter (average);
		   
		 //this calculates the range
		 double min = values[0];
		   for (int i = 0; i < values.length; i++) {
			   if (values[i] < min) min = values[i];
		   }
		 double max = values[0];
		 for (int i = 0; i < values.length; i++) {
			 if (values[i] > max) max = values[i];
		 }
		 System.out.println("The range of the values is " + (max - min));
	}

}
