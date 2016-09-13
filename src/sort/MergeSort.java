package sort;

import common.Merger;

/*
 * 整列されていない配列を2つに分割し、分割したものをまた分割し、を繰り返し、
 * 細かく分割し終わったら、少しずつそれらをマージしていく。
 */

public class MergeSort {

	// 昇順ソート
	public static void ascendingSort(int[] data) {
		if(data.length > 1){
			int left_len = data.length / 2;
			int right_len = data.length - left_len;
			int[] left = new int[left_len];
			int[] right = new int[right_len];

			for(int i=0; i<left_len; i++)	left[i] = data[i];
			for(int i=0; i<right_len; i++)	right[i] = data[left_len + i];

			ascendingSort(left);
			ascendingSort(right);
			Merger.ascending(data, left, right);
		}
	}

	// 降順ソート
	public static void descendingSort(int[] data) {
		if(data.length > 1){
			int left_len = data.length / 2;
			int right_len = data.length - left_len;
			int[] left = new int[left_len];
			int[] right = new int[right_len];

			for(int i=0; i<left_len; i++)	left[i] = data[i];
			for(int i=0; i<right_len; i++)	right[i] = data[left_len + i];

			descendingSort(left);
			descendingSort(right);
			Merger.descending(data, left, right);
		}
	}
}
