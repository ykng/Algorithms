package common;

/*
 * left側の配列とright側の配列をマージ
 */

public class Merger {

	public static void ascending(int[] data, int[] left, int[] right){
		int i = 0;
		int j = 0;

		while(i<left.length || j<right.length) {
			if(j>=right.length || (i<left.length && left[i]<right[j])){
				data[i+j] = left[i];
				i++;
			}else{
				data[i+j] = right[j];
				j++;
			}
		}
	}

	public static void descending(int[] data, int[] left, int[] right){
		int i = 0;
		int j = 0;

		while(i<left.length || j<right.length) {
			if(j>=right.length || (i<left.length && left[i]>right[j])){
				data[i+j] = left[i];
				i++;
			}else{
				data[i+j] = right[j];
				j++;
			}
		}
	}
}
