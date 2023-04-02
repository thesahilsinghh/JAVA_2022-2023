package com.HashMap;

public class HashmapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashmap<String, Integer> hm = new Hashmap<>();
		hm.put("sahil", 21);
		hm.put("ayush", 11);
		hm.put("nirmal", 23);
		hm.put("sajji", 19);
		hm.put("adesh", 99);
		hm.put("aryan", 26);
		System.out.println(hm);
		hm.put("adesh", 22);
		System.out.println(hm);
		System.out.println(hm.get("raj"));
	}

}
