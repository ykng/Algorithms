package common;

public class Heap {

	public static void ascendingDownHeap(int[] data, int n, int k) {
		int parent, child;	// ノード番号
		int tmp = data[n];

		for (parent = n; parent < (k + 1) / 2; parent = child) {
			// 子ノードの番号
			int cl = parent * 2 + 1;
			int cr = cl + 1;

			// 子ノードのうち、値が大きい方の番号をchildに格納
			child = (cr <= k && data[cr] > data[cl]) ? cr : cl;

			if (tmp >= data[child]) {
				break;
			}

			data[parent] = data[child];
		}

		data[parent] = tmp;
    }

	public static void descendingDownHeap(int[] data, int n, int k) {
		int parent, child;
		int tmp = data[n];

		for (parent = n; parent < (k + 1) / 2; parent = child) {
			int cl = parent * 2 + 1;
			int cr = cl + 1;

			child = (cr <= k && data[cr] < data[cl]) ? cr : cl;
			if (tmp < data[child]) {
				break;
			}

			data[parent] = data[child];
		}

		data[parent] = tmp;
	}
}
