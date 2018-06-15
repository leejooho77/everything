package lcm;

public class LCM {
	
	public static int findLCM() {
		boolean isDone = false;
		int lcm = 0;
		int counter = 1;
		while(!isDone) {
			if(counter % 2 == 0 && counter % 3 == 0 && counter % 4 == 0 && counter % 5 == 0 && counter % 6 == 0 &&
					counter % 7 == 0 && counter % 8 == 0 && counter % 9 == 0 && counter % 10 == 0) {
				isDone = true;
				lcm = counter;
			} else
				counter++;
		}
		return lcm;
	}

	public static void main(String[] args) {
		System.out.println(findLCM());
	}
}
