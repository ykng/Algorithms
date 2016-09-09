package test;

import common.Printer;
import sort.BubbleSort;

public class BubbleSortTest {

	public static void main(String[] args) {
		int[] testdata1 = {2,3,4,5,1};
		int[] testdata2 = {5,2,7,4,9,3,1,6,10,8};
		int[] testdata3 = {5,5,3,3,7,9,3,9,3,7};

		BubbleSort bs = new BubbleSort();

		bs.ascendingSort(testdata1);
		Printer.printResult(testdata1);

		bs.descendingSort(testdata2);
		Printer.printResult(testdata2);

		bs.ascendingSort(testdata3);
		Printer.printResult(testdata3);
	}

}