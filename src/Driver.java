import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		// Create ArrayList 
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
		
		double average = calcAverage(integers);
		
		System.out.println("\n" + "Average: " + average);
	}
	
	
	/**
	 * Calculate an average of arrayList of integers
	 * 
	 * @param integers (ArrayList<Integer>)
	 * @return average
	 */
	public static double calcAverage(ArrayList<Integer> integers) {
		
		int sum = 0;
		int numberElements = integers.size();
		
		for(int number : integers) {
			sum += number;
		}
		
		return numberElements > 0 ? sum / numberElements : 0;
	}
}
