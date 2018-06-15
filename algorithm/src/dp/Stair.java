package dp;

import java.util.Scanner;

public class Stair {
	
	private static int num_stairs = 0;
	private static int[] scores_of_stairs;
	private static Scanner input = new Scanner(System.in);
	
	public static void console() {
		System.out.print("Enter the number of stairs: ");
		num_stairs = input.nextInt();
		System.out.println();
		scores_of_stairs = new int[num_stairs + 1];
		scores_of_stairs[0] = 0;
		for(int i = 1; i <= num_stairs; i++) {
			System.out.print("Enter the score of " + i + " stair: ");
			scores_of_stairs[i] = input.nextInt();
			System.out.println();
		}
		input.close();
	}
	
	public static int max_score_stair(int num_stairs, int[] scores_of_stairs) {
		int[] scores = new int[num_stairs + 1];
		scores[0] = 0;
		scores[1] = scores_of_stairs[1];
		scores[2] = scores_of_stairs[1] + scores_of_stairs[2];
		for(int i = 3; i <= num_stairs; i++) {
			scores[i] = max(scores_of_stairs[i - 1]	+ scores_of_stairs[i] + scores[i - 3], scores_of_stairs[i] + scores[i - 2]);
		}
		return scores[num_stairs];
	}
	
	public static int max(int n1, int n2) {
		if(n1 >= n2) return n1;
		else return n2;
	}
	
	public static void main(String[] args) {
		console();
		System.out.println(max_score_stair(num_stairs, scores_of_stairs));
	}
	

}
