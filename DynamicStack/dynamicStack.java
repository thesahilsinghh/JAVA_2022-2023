package DynamicStack;

import com.Stacks.DemoArrays;

public class dynamicStack extends DemoArrays {
	@Override
	public void push(int x) throws Exception {

		if (this.isfull()) {

			int[] arr1 = new int[2*this.arr.length];

			for (int i = 0; i < arr.length; i++) {
				arr1[i] = this.arr[i];
			}

			
			this.arr = arr1;

		}
		super.push(x);
	}

}
