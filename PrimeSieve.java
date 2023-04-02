
public class PrimeSieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		boolean[] arr = new boolean[n];
		int count = n-1;
		

		for (int i = 2; i * i < n; i++) {

			if (arr[i] == false) {
				

				for (int mod = 2; mod * i < n; mod++) {

					arr[i * mod] = true;
					count--;
				}
			}
		}
		System.out.println(count);
	}

}
