package demos;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
	
	public static void exe() {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "jose");
		cookies.put("email", "jose@hotmail.com");
		cookies.put("phone", "999999999");
		
		cookies.remove("email");
		cookies.put("phone", "7007700");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
