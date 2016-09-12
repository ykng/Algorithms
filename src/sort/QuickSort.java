package sort;

import common.Swap;

/*
 * 中間的な基準値を決めて、それより「小さい値」グループと「大きい」グループに振り分ける。
 * その後、それぞれのグループ内でまた基準値を決めて・・・を繰り返す。
 */

public class QuickSort {

	//昇順ソート
	public	static void ascendingSort(int[] data, int left, int right) {
		if(left >= right) {
			return;
		}

        int l = left, r = right;
		int p = data[(left+right)/2];

        while(l <= r) {
            // 入れ替えるデータのインデックスを探索
        	while(data[l] < p) { l++; }
            while(data[r] > p) { r--; }

            if(l <= r) {
                Swap.integerSwap(data, l, r);
                l++; r--;
            }
        }

        ascendingSort(data, left, r);
        ascendingSort(data, l, right);

	}

	// 降順ソート
	public static void descendingSort(int[] data, int left, int right) {
		if(left >= right) {
			return;
		}

        int l = left, r = right;
		int p = data[(left+right)/2];

        while(l <= r) {
            while(data[l] > p) { l++; }
            while(data[r] < p) { r--; }
            if(l <= r) {
                Swap.integerSwap(data, l, r);
                l++; r--;
            }
        }

        descendingSort(data, left, r);
        descendingSort(data, l, right);

	}
}
