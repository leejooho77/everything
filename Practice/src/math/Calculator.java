package math;

public class Calculator {
	
	private int answer = 0;
	
	public void add(int number) {
		answer += number;
	}
	
	public void subtract(int number) {
		answer -= number;
	}
	
	public void multiply(int number) {
		answer *= number;
	}
	
	public void divide(int number) {
		answer /= number;
	}
	
	public void clear() {
		answer = 0;
	}
	
	public int getAnswer() {
		return this.answer;
	}

}
