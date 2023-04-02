
public class AxisOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "nitin";
		int count = 0;

		for (int orbit = 0; orbit < s.length(); orbit++) {

			for (int axis = 0; axis + orbit < s.length() && orbit - axis >= 0; axis++) {

				if (s.charAt(orbit - axis) == s.charAt(orbit + axis)) {
					count++;
				} else {
					break;
				}

			}

		}

		for (double orbit = 0.5; orbit < s.length(); orbit++) {
			for (double axis = 0.5; axis + orbit < s.length() && orbit-axis >= 0; axis++) {

				if (s.charAt((int) (orbit - axis)) == s.charAt((int) (orbit+axis))) {
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
