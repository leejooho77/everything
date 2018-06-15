package dp;

public class Stick {
	
	private static final int[] PRICE = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
	
	public static int[] findMaxPrice() {
		int price;
		int length = PRICE.length;
		int[] max_price = new int[length];
		max_price[0] = PRICE[0];
		for(int i = 1; i < length; i++) {
			price = -1;
			for(int j = 1; j <= i; j++) {
				price = max(price, (PRICE[j] + max_price[i - j]));
			}
			max_price[i] = price;
		}
		return max_price;
	}
	
	public static int max(int n1, int n2) {
		if(n1 >= n2) return n1;
		else return n2;
	}
	
	public static String toString(int[] array) {
		String string = "[ ";
		for(int i: array) string += i + " ";
		string += "]";
		return string;
	}
	
	public static void main(String[] args) {
		System.out.println(toString(findMaxPrice()));
	}

}
