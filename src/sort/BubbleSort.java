package sort;

import common.Swap;

/*
 * 隣接するデータの大小を比較し、必要に応じて入れ替える
 */

public class BubbleSort {

	// 昇順ソート
	public static void ascendingSort(int[] data) {
		int length = data.length;

		for(int i=0; i<length-1; i++) {
			for(int j=0; j<length-1-i; j++) {
				if(data[j] > data[j+1]) {
					Swap.integerSwap(data, j, j+1);
				}
			}
		}
	}

	// 降順ソート
	public static void descendingSort(int[] data){
		int length = data.length;

		for(int i=0; i<length-1; i++) {
			for(int j=0; j<length-1-i; j++) {
				if(data[j] < data[j+1]) {
					Swap.integerSwap(data, j, j+1);
				}
			}
		}
	}
}
