package test;

import common.Printer;
import sort.InsertionSort;

public class InsertionSortTest {

	public static void main(String[] args) {
		int[] testdata1 = {2,3,4,5,1};
		int[] testdata2 = {5,2,7,4,9,3,1,6,10,8};
		int[] testdata3 = {5,5,3,3,7,9,3,9,3,7};

		test(testdata1, true);
		test(testdata2, false);
		test(testdata3, true);
	}

	public static void test(int[] testdata, boolean isAscending) {
		if( isAscending == true ){
			InsertionSort.ascendingSort(testdata);
		}else{
			InsertionSort.descendingSort(testdata);
		}
		Printer.printResult(testdata);
	}
}
