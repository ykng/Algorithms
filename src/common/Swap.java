package common;

public class Swap {

	// Int型の配列のnum1番目の要素とnum2番目の要素の入れ替え
	public static int[] integerSwap(int[] list, int num1, int num2){
		int tmp = list[num1];
		list[num1] = list[num2];
		list[num2] = tmp;

		return list;
	}
}
