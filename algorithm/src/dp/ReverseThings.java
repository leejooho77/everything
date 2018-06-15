package dp;

public class ReverseThings{
	public static void main(String [] args){
		//in the static method below, write logic that takes a number and reverses it
		//input : an int
		//output : an int
		System.out.println(reverseNum(123)); //returns 321
		System.out.println(reverseNum(1923)); //returns 3291
	}
	
	public static int reverseNum(int num){
		//post code here
		return Integer.parseInt(new StringBuilder().append(num).reverse().toString());
	}
}