package acronym;

public class Acronym {
	
	public static String acronym(String[] strings) {
		String acronym = "";
		for(int i = 0; i < strings.length; i++) {
			acronym += strings[i].toUpperCase().charAt(0);
		}
		return acronym;
	}

}
