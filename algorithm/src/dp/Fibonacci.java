package dp;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		if(n == 1) return 1;
		else {
			int[] fib = new int[n + 1];
			fib[0] = 0;
			fib[1] = 1;
			for(int i = 2; i < n + 1; i++) {
				fib[i] = fib[i-1] + fib[i-2];
			}
			return fib[n];
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(fibonacci(i));
		}
	}
	
}