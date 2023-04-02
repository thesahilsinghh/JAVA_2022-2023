package Arrays;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37;
		System.out.println(sq(n));

	}

	public static int sq(int n) {

		int lo = 1;
		int hi = n;
		int na = 0;
		while (lo <= hi) {

			int mi = (lo + hi) / 2;

			if (mi * mi <= n) {

				na = mi;
				lo = mi + 1;

			}

			else {
				hi = mi - 1;
			}

		}

		return na;

	}

}
