package midterm;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Midterm {
	
	public static ArrayList<Integer> oddNumbers(int[] array) {
		ArrayList<Integer> odd_number = new ArrayList<>();
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) odd_number.add(array[i]);
		}
		return odd_number;
	}
	
	public static ArrayList<Integer> cubeNumbers(int[] array) {
		ArrayList<Integer> cubeNumbers = new ArrayList<>();
		for(int i = 0; i < array.length; i++) {
			cubeNumbers.add(array[i] * array[i] * array[i]);
		}
		return cubeNumbers;
	}
	
	public static void fizzBuzz() {
		boolean isPrinted = false;
		int count = 1;
		while(count <= 60) {
			if(count % 3 == 0) {
				isPrinted = true;
				System.out.print("Fizz");
			}
			if(count % 5 == 0) {
				isPrinted = true;
				System.out.print("Buzz");
			}
			else if(!isPrinted)
				System.out.print(count);
			System.out.println();
			isPrinted = false;
			count++;
		}
		
	}
	
	public static String reverse(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	public static void letter_histogram() {
		Scanner scanner = new Scanner(System.in);
		Map<Character, Integer> letter_histogram = new TreeMap<>();
		String input = scanner.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			if(letter_histogram.containsKey(input.charAt(i)))
				letter_histogram.put(input.charAt(i), letter_histogram.get(input.charAt(i)) + 1);
			else
				letter_histogram.put(input.charAt(i), 1);
		}
		System.out.println(letter_histogram.toString());
		scanner.close();
	}
	
	public static String decipher(String str) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String decipher = "";
		int offset = 13;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				decipher += ' ';
			else {
				for(int j = 0; j < alphabet.length(); j++) {
					if(str.charAt(i) == alphabet.charAt(j)) {
						if(j <= 25) {
							if(j + offset >= 26)
								decipher += alphabet.charAt((j + offset) % 26);
							else
								decipher += alphabet.charAt(j + offset);
						} else {
							if((j + offset) - 26 >= 26)
								decipher += alphabet.charAt(((j + offset - 26) % 26) + 26);
							else
								decipher += alphabet.charAt(j + offset);
						}
					} 
				}
			}
		}
		return decipher;
	}

	public static void main(String[] args) {
		// #1
		int [] scenario1 = {1, -8, 4, -3, 6, 9};
		int [] scenario2 = {1, 2, 3, 4, 5, 6 ,7, 8};
		int [] scenario3 = {-1, -3, 5, 7, 9, -11};
		System.out.println(oddNumbers(scenario1));
		System.out.println(oddNumbers(scenario2));
		System.out.println(oddNumbers(scenario3));
		
		// #2
		int [] scenario4 = {2, 4, 8};
		int [] scenario5 = {3, 9, 6};
		System.out.println(cubeNumbers(scenario4));
		System.out.println(cubeNumbers(scenario5));
		
		// #3
		fizzBuzz();
		
		// #4
		System.out.println(reverse("Thursday"));
		
		// #5
		letter_histogram();
		
		// #6
		System.out.println(decipher("Travhf Jvgubhg Rqhpngvba Vf Yvxr Fvyire Va Gur Zvar"));
	}
	
}
