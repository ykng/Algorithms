package test;

import common.Printer;
import sort.QuickSort;

public class QuickSortTest {

	public static void main(String[] args) {
		int[] testdata1 = {4,2,5,1,3,6,7};
		int[] testdata2 = {5,2,7,4,9,3,1,6,10,8};
		int[] testdata3 = {5,5,3,3,7,9,3,9,3,7};

		test(testdata1, true);
		test(testdata2, false);
		test(testdata3, true);
	}

	public static void test(int[] testdata, boolean isAscending) {
		if( isAscending == true ){
			QuickSort.ascendingSort(testdata, 0, testdata.length-1);
		}else{
			QuickSort.descendingSort(testdata, 0, testdata.length-1);
		}
		Printer.printResult(testdata);
	}
}
