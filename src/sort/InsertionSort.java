package sort;

import java.util.LinkedList;
import java.util.List;

/*
 * 対象となるデータ列を「整列済みのもの」と「未整列のもの」とに分ける。
 * 未整列の側からデータを一つずつ整列済みの列の「適切な位置」に挿入して、全体を整列。
 * このクラスでは「整列済みのもの」を「LinkedList」として処理。
 */

public class InsertionSort {

	//昇順ソート
	public	static void ascendingSort(int[] data) {
		List<Integer> list = new LinkedList<>();

		list.add(data[0]);

		for(int i=1; i<data.length; i++) {
			int index=i;

			for(int j=0; j<list.size(); j++) {
				if( data[i] < list.get(j).intValue() ) {
					index = j;
					break;
				}
			}

			list.add(index, data[i]);
		}

		for(int i=0; i<data.length; i++) {
			data[i] = list.get(i).intValue();
		}
	}

	// 降順ソート
	public static void descendingSort(int[] data) {
			List<Integer> list = new LinkedList<>();

			list.add(data[0]);

			for(int i=1; i<data.length; i++) {
				int index=i;

				for(int j=0; j<list.size(); j++) {
					if( data[i] > list.get(j).intValue() ) {
						index = j;
						break;
					}
				}

				list.add(index, data[i]);
			}

			for(int i=0; i<data.length; i++) {
				data[i] = list.get(i).intValue();
			}
		}
}
