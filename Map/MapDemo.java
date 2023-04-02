package com.Map;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> mt = new HashMap<>();

		// add to map
		mt.put("kamlesh", 14);
		mt.put("suresh", 24);
		mt.put("ramesh", 69);
		mt.put("jugnesh", 38);
		mt.put("akhilesh", 51);
		mt.put("", 344);
		// print
//		System.out.println(mt);

//		System.out.println(mt.get(""));
		// contains key
		// System.out.println(mt.containsKey("kamlesh"));

		// remove
		// mt.remove("jugnesh");
		System.out.println(mt);

		// treemap
		TreeMap<String, Integer> mt1 = new TreeMap<>();
		mt1.put("kamlesh", 14);
		mt1.put("suresh", 24);
		mt1.put("ramesh", 69);
		mt1.put("jugnesh", 38);
		mt1.put("akhilesh", 51);
		mt1.put("", 344);

		System.out.println(mt1);

		// Linked hashmap

		LinkedHashMap<String, Integer> mt2 = new LinkedHashMap<>();
		mt2.put("kamlesh", 14);
		mt2.put("suresh", 24);
		mt2.put("ramesh", 69);
		mt2.put("jugnesh", 38);
		mt2.put("akhilesh", 51);
		mt2.put("", 344);
		System.out.println(mt2);

		// printing ways
		// 1st way
		Set<String> k = mt.keySet();

		for (String val : k) {
			System.out.println(val + " " + mt.get(val));

		}
		System.out.println();
		System.out.println();

		// 2nd way

		for (String k1 : mt1.keySet()) {
			System.out.println(k1 + " " + mt1.get(k1));
		}
		System.out.println();
		System.out.println();

		// 3rd way

		ArrayList<String> ll = new ArrayList<>(mt2.keySet());
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i) + " " + mt2.get(ll.get(i)));

		}

	}

}
