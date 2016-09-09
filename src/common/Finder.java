package common;

public class Finder {

	// int[]型のdataのs番目からe番目の中で最も大きい数値を見つけ、そのインデックス番号を返す
	public static int findMax(int[] data, int s, int e) {
		int index = 0;
		int max = 0;

		for(int i=s; i<=e; i++) {
			if( data[i] > max ){
				max = data[i];
				index = i;
			}
		}

		return index;
	}

	// int[]型のdataのs番目からe番目の中で最も小さい数値を見つけ、そのインデックス番号を返す
	public static int findMin(int[] data, int s, int e) {
		int index = 0;
		int min = Integer.MAX_VALUE;

		for(int i=s; i<=e; i++) {
			if( data[i] < min ) {
				min = data[i];
				index = i;
			}
		}

		return index;
	}
}
