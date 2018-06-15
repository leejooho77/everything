package math;

public class Math {
	
	public static int sum(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static int product(int[] numbers) {
		int product = 1;
		for(int i = 0; i < numbers.length; i++) {
			product *= numbers[i];
		}
		return product;
	}
	
	public static int factorial(int number) {
		if(number == 1) return 1;
		else {
			return number * factorial(number - 1);
		}
	}
	
	public static int[] positive(int[] numbers) {
		int size = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 0) size++;
		}
		
		int[] positives = new int[size];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				positives[positives.length - size] = numbers[i];
				size--;
			}
		}
		return positives;
	}
	
	public static int[] even(int[] numbers) {
		int size = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) size++;
		}
		
		int[] even = new int[size];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				even[even.length - size] = numbers[i];
				size--;
			}
		}
		return even;
	}
	
	public static int[] squares(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * numbers[i];
		}
		return numbers;
	}
}

