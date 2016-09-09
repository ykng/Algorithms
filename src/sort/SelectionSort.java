package sort;

import common.Finder;
import common.Swap;

/*
 * 対象データの中から最大値（もしくは最小値）のデータを取り出して、先頭のデータと交換する
 */

public class SelectionSort {

	//昇順ソート
	public	static void ascendingSort(int[] data) {
		for(int i=0; i<data.length-1; i++) {
			int index = Finder.findMin(data, i, data.length-1);
			Swap.integerSwap(data, i, index);
		}
	}

	// 降順ソート
	public static void descendingSort(int[] data) {
		for(int i=0; i<data.length-1; i++) {
			int index = Finder.findMax(data, i, data.length-1);
			Swap.integerSwap(data, i, index);
		}
	}
}
