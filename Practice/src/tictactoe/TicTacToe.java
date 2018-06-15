package tictactoe;

public class TicTacToe {
	
	public static char single(char[] single) {
		char result = ' ';
		int counter = 0;
		for(int i = 0; i < single.length; i++) {
			if(single[i] == 'X') counter--;
			else if(single[i] == 'O') counter++;
		}
		if(counter == (0 - single.length)) result = 'X';
		else if(counter == single.length) result = 'O';
		return result;
	}

}
