package square;

public class Square {
	
	public static void printSquare(int number) {
		for(int i = 0; i < number; i++) {
			System.out.println(generateMarks(number));
		}
	}
	
	public static String generateMarks(int number) {
		String mark = "";
		for(int i = 0; i < number; i++) {
			mark += "*";
		}
		return mark;
	}

}
