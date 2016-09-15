package sort;

/*
 * ------鳩の巣ソート--------
 *
 * 空の配列（鳩の巣）を用意し、個々の鳩の巣にはソートキーの1つの値を対応させる。
 * それぞれの鳩の巣には、そのソートキーを持つ要素の数を格納する。
 * 最後に、鳩の巣の配列を順に見て並べていく。
 *
 * メモリはかなり消費するが、相性よければかなり早い。
 * 要素数nと、要素の値の取る範囲Nがほぼ同じ場合に適している。
 *
 * 最悪時間計算量 O(N+n)
 */

public class PigeonholeSort {

	// 昇順ソート
	public static void ascendingSort(int[] data) {
		int min = data[0], max = data[0];

		// 配列の中の最大値と最小値を見つけ、その差を鳩の巣のサイズにする。
		for (int x : data) {
			min = Math.min(x, min);
			max = Math.max(x, max);
		}
		final int size = max - min + 1;

		// 鳩の巣にデータを格納
		int[] holes = new int[size];
		for (int x : data) {
			holes[x - min]++;
		}

		// 鳩の巣を参照して、元の配列をソート
		int i = 0;
		for (int count = 0; count < size; count++) {
			while (holes[count]-- > 0) {
				data[i++] = count + min;
			}
		}
	}

	// 降順ソート
	public static void descendingSort(int[] data) {
		int min = data[0], max = data[0];

		for (int x : data) {
			min = Math.min(x, min);
			max = Math.max(x, max);
		}
		final int size = max - min + 1;

		int[] holes = new int[size];
		for (int x : data) {
			holes[x - min]++;
		}

		int i = 0;
		for (int count = size - 1; count >= 0; count--) {
			while (holes[count]-- > 0) {
				data[i++] = count + min;
			}
		}
	}
}
