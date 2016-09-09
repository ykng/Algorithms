package test;

import common.Printer;
import sort.SelectionSort;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] testdata1 = {2,3,4,5,1};
		int[] testdata2 = {5,2,7,4,9,3,1,6,10,8};
		int[] testdata3 = {5,5,3,3,7,9,3,9,3,7};

		SelectionSort ss = new SelectionSort();

		ss.ascendingSort(testdata1);
		Printer.printResult(testdata1);

		ss.descendingSort(testdata2);
		Printer.printResult(testdata2);

		ss.ascendingSort(testdata3);
		Printer.printResult(testdata3);
	}

}
