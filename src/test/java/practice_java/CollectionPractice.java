package practice_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionPractice {

	public static void main(String[] args) {
		ArrayList name = new ArrayList<>();
		name.add("rohit");
		name.add("rahul");
		name.add("arun");
		
		
		Iterator str = name.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		System.out.println("===============================================");
		HashMap<String,Integer> data = new HashMap<>();
		data.put("rohit", 28);
		data.put("shivam",30);
		
		Iterator<Map.Entry<String,Integer>> str2 = data.entrySet().iterator();
		while(str2.hasNext()) {
			Map.Entry<String, Integer> entry = str2.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
