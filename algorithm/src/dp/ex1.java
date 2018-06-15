package dp;

import java.util.StringTokenizer;

public class ex1 {
	
	private static String numbersString1 = "12378923254";
	private static String numbersString2 = "53625484376";
	private static String numbersString3 = "71941648682";
	private static String[] array_number = {numbersString1, numbersString2, numbersString3};
	
	public static int sum(String[] array_number) {
		int sum = 0;
		for(int i = 0; i < array_number.length; i++) {
			StringTokenizer st = new StringTokenizer(array_number[i], "1234567890", true);
			while(st.hasMoreElements()) {
				sum += Integer.parseInt(st.nextToken());
			}
		}
		return sum;
	}
	
	public static String capital(String str) {
		StringTokenizer st = new StringTokenizer(str, " ", true);
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			token = token.substring(0, token.length() - 1) + token.substring(token.length() - 1).toUpperCase();
			sb.append(token);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(sum(array_number));
//		System.out.println(capital("today is friday"));
	}
	
}
