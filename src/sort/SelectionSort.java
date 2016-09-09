package sort;

import common.Finder;
import common.Swap;

public class SelectionSort {

	//昇順ソート
	public	void ascendingSort(int[] data) {
		int index;

		for(int i=0; i<data.length-1; i++) {
			index = Finder.findMin(data, i, data.length-1);
			Swap.integerSwap(data, i, index);
		}
	}

	// 降順ソート
	public void descendingSort(int[] data) {
		int index;

		for(int i=0; i<data.length-1; i++) {
			index = Finder.findMax(data, i, data.length-1);
			Swap.integerSwap(data, i, index);
		}
	}
}
