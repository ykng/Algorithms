package sort;

import common.Swap;

/*
 * 隣接するデータの大小を比較し、必要に応じて入れ替える
 */

public class BubbleSort {

	// 昇順ソート
	public void ascendingSort(int[] data) {
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
	public void descendingSort(int[] data){
		int length = data.length;

		for(int i=0; i<length-1; i++) {
			for(int j=0; j<length-1-i; j++) {
				if(data[j] < data[j+1]) {
					Swap.integerSwap(data, j, j+1);
				}
			}
		}
	}

	// 結果表示
	public void printResult(int[] data){
		System.out.print("Result of Sorting : [ ");

		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}

		System.out.println("]");
	}
}
