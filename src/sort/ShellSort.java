package sort;

/*
 * ある一定間隔おきに取り出した要素で部分列を作り、それぞれ整列してもとに戻す。
 * 次はさらに間隔を詰めて要素を取り出し、再度整列。
 * 取り出す間隔が1になるまでこれを繰り返す。
 */

public class ShellSort {

	//昇順ソート
	public	static void ascendingSort(int[] data) {
		int h = 1;		//取り出す間隔

		while(h < data.length) {
		    h = 2 * h + 1;
		}

		while(h > 1){
			h = h / 2;

			for(int i = h; i < data.length; i++) {
				int j = i - h;			// 比較対象のインデックス
				int tmp = data[i];		// 注目するデータ

				while(data[j] > tmp) {
					data[j + h] = data[j];
					j = j - h;
					if(j < 0)	break;
				}

				data[j + h] = tmp;
			}
		}
	}

	// 降順ソート
	public static void descendingSort(int[] data) {
		int h = 1;

		while(h < data.length) {
		    h = 2 * h + 1;
		}

		while(h > 1){
			h = h / 2;

			for(int i = h; i < data.length; i++) {
				int j = i - h;
				int tmp = data[i];

				while(data[j] < tmp) {
					data[j + h] = data[j];
					j = j - h;
					if(j < 0)	break;
				}

				data[j + h] = tmp;
			}
		}
	}
}
