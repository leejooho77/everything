package filter;

import java.util.ArrayList;

public class Filter {
	
	public static ArrayList<Integer> arrays(int range) {
		ArrayList<Integer> integer_list = new ArrayList<>();
		for(int i = 1; i <= range; i++) {
			integer_list.add(i);
		}
		return integer_list;
	}
	
	public static ArrayList<Integer> filter(ArrayList<Integer> integer_list) {
		ArrayList<Integer> filtered_list = new ArrayList<>();
		for(int i = 0; i < integer_list.size(); i++) {
			if((integer_list.get(i) % 2) != 0 && (integer_list.get(i) % 3) != 0 && (integer_list.get(i) % 5) != 0)
				filtered_list.add(integer_list.get(i));
		}
		return filtered_list;
	}
	
	public static String alphaSort(String string) {
		boolean isSorted = true;
		char[] ordered_string = string.toCharArray();
		for(int i = 0; i < ordered_string.length; i++) {
			for(int j = 1; j < ordered_string.length; j++) {
				if(ordered_string[j-1] > ordered_string[j]) {
					char temp = ordered_string[j];
					ordered_string[j] = ordered_string[j-1];
					ordered_string[j-1] = temp;
					isSorted = false;
				}
			}
			if(isSorted == true) break;
		}
		return ordered_string.toString();
	}

}
