package sort;

import common.Swap;

/*
 * 対象となるデータ列を「整列済みのもの」と「未整列のもの」とに分ける。
 * 未整列の側からデータを一つずつ整列済みの列の「適切な位置」に挿入して、全体を整列。
 */

public class InsertionSort{

	//昇順ソート
	public	static void ascendingSort(int[] data) {
		for(int i=1; i<data.length; i++) {
			for(int j=i; j>=1 && data[j] < data[j-1]; j--) {
				Swap.integerSwap(data, j, j-1);
			}
		}
	}

	// 降順ソート
	public static void descendingSort(int[] data) {
		for(int i=1; i<data.length; i++) {
			for(int j=i; j>=1 && data[j] > data[j-1]; j--) {
				Swap.integerSwap(data, j, j-1);
		    }
		}
	}
}
