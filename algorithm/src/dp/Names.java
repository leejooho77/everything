package dp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Names {
	
	public static final File file = new File("C:\\Users\\syntel.PHX440G3-28160F\\Documents\\workspace-sts-3.9.3.RELEASE\\algorithm\\resources\\names.txt");
	
	public static int getTotalValue(Map<String, Integer> map) {
		int total = 0;
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			total += entry.getValue();
		}
		return total;
	}
	
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			@Override
			public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		
		Map<K, V> result = new LinkedHashMap<>();
		for(Map.Entry<K, V> entry: list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		TreeMap<String, Integer> name_map = new TreeMap<>();
		Scanner scanner = new Scanner(file);
		String names = scanner.next();
		String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringTokenizer st = new StringTokenizer(names, "\",");
		while(st.hasMoreElements()) {
			int value = 0;
			String each_name = st.nextToken();
			for(int i = 0; i < each_name.length(); i++) {
				for(int j = 0; j < key.length(); j++) {
					if(each_name.charAt(i) == key.charAt(j)) value += j + 1;
				}
			}
			name_map.put(each_name, value);
		}
		
		System.out.println(name_map);
		System.out.println(sortByValue(name_map));
		System.out.println(getTotalValue(name_map));
		scanner.close();
	}

}
