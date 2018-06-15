package string;

public class StringMultiplication {
	
	public static String strMultiply(String str, int times) {
		String result = "";
		for(int i = 0; i < times; i++) {
			result += str;
		}
		return result;
	}

}
