package common;

public class Printer {

	// 配列の中身を表示
	public static void printResult(int[] data) {
		System.out.print("Result of Sorting : [ ");

		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}

		System.out.println("]");
	}
}
