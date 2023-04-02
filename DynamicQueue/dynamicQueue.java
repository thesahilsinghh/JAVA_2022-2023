package DynamicQueue;

import com.Queue.Queue;

public class dynamicQueue extends Queue {
	@Override
	public void enqueue(int x) throws Exception {

		if (super.isfull()) {

			int[] arr1 = new int[super.arr.length * 2];
			for (int i = 0; i < super.arr.length; i++) {
				int idx = (super.top+i) % super.arr.length;

				arr1[i] = super.arr[idx];

			}
			super.top=0;
			super.arr = arr1;
		}
		super.enqueue(x);
	}
}
