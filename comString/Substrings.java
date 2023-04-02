package comString;

public class Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello("abcd");

	}

	public static void hello(String str) {

		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
