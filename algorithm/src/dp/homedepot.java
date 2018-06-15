package dp;

import java.util.StringTokenizer;

public class homedepot {
	
	private static final String GIVEN = "Given I  visit   HomeDepot!,.com";
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(GIVEN, " !,.", true);
		String result = "";
		while(st.hasMoreElements()) {
			StringBuilder sb = new StringBuilder(st.nextToken());
			result += sb.reverse().toString();
		}
		System.out.println(result);
	}
}
