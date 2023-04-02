
public class PowerLogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(power(3, 8));
		
	}

	public static int power(int a, int n) {
		if (n == 0) {
			return 1;
		}

		int ans = power(a, n / 2);

		ans = ans * ans;
		if (n % 2 != 0) {
			ans = ans * a;
		}
		return ans;

	}

}
