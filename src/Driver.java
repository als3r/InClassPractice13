import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Integer> integers = new ArrayList<Integer>(25); 
		
		// Add 25 integers to ArrayList with value of -1
		for (int i = 1; i <= 25; i++) {
			integers.add(-1);
		}
		
		System.out.println("Initial Values: ");
		// Loop through ArrayList and display values
		for (int i = 1; i <= 25; i++) {
			System.out.println(i + " : " + integers.get(i-1));
		}
		
		// Set 1st, 2nd and 5th element of ArrayList to 133
		integers.set(0, 133);
		integers.set(1, 133);
		integers.set(4, 133);
		
		System.out.println("Values After Change: ");
		// Loop through ArrayList and display values
		for (int i = 1; i <= 25; i++) {
			System.out.println(i + " : " + integers.get(i-1));
		}
	}
}
