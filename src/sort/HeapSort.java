package sort;

import common.Heap;
import common.Swap;

/*
 * Heapを利用したソート
 * 対象データでヒープを構築し、「根を取り出し、残りでHeap再構築」を繰り返す。
 */
public class HeapSort {

	// 昇順ソート
	public static void ascendingSort(int[] data) {
		int len = data.length;

		// 1番深い親ノードから徐々にHeap構築
        for (int i = (len - 1) / 2; i >= 0; i--) {
            Heap.ascendingDownHeap(data, i, len - 1);
        }


        // 根を取り出し、残りでHeap再構築を繰り返す
        for (int i = len - 1; i > 0; i--) {
            Swap.integerSwap(data, 0, i);
            Heap.ascendingDownHeap(data, 0, i - 1);
        }
	}

	// 降順ソート
	public static void descendingSort(int[] data) {
		int len = data.length;

        for (int i = (len - 1) / 2; i >= 0; i--) {
            Heap.descendingDownHeap(data, i, len - 1);
        }

        for (int i = len - 1; i > 0; i--) {
            Swap.integerSwap(data, 0, i);
            Heap.descendingDownHeap(data, 0, i - 1);
        }
	}
}
