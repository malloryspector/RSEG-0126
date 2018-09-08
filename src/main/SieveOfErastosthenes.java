package main;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class SieveOfErastosthenes {

	public static void main(String[] args) {
		// prompt the user for the maximum integer to check
		System.out.println("Please enter the maximum integer to check: ");
		int maxInt = 2;
		if (args.length > 0) {
			maxInt = Integer.parseInt(args[0]);
		} else {
			Scanner s = new Scanner(System.in);
			maxInt = s.nextInt();
			s.close();
		}


		// run the algorithm
		Map<Integer, Boolean> numbers = RunAlgorithm(maxInt);
		
		// display all prime numbers less than or equal to maximum integer
		System.out.print("Prime Numbers: ");
		for (int j = 2; j < maxInt + 1; j++) {
			if (numbers.get(j) == true) {
				System.out.printf("%d ", j);
			}
		}
		System.out.print("\n");
	}
	
	public static Map<Integer, Boolean> RunAlgorithm(int maxInt) {
		
		// Step 1: Generate a list of numbers ranging from 2 to maximum integer
		Map<Integer, Boolean> numbers = new HashMap<>();
		
		// handle cases where the number passed in is less than 2
		if (maxInt < 2) {
			numbers.put(maxInt, false);
			return numbers;
		}
		
		
		for (int i = 2; i < maxInt + 1; i++) {
			numbers.put(i, true);
		}
		
		// Step 2: Determine the square root of the maximum integer as max prime to check
		int maxLoopInt = (int)Math.round(Math.sqrt(maxInt));
		
		// Step 3: Loop over the list and mark non prime numbers as false
		for (int i = 2; i < maxLoopInt; i++) {
			if (numbers.get(i) == true) {
				int nonPrimeNum = i + i;
				while (nonPrimeNum <= maxInt) {
					numbers.put(nonPrimeNum, false);
					nonPrimeNum += i;
				}
			}
		}
		
		return numbers;
	}

}
