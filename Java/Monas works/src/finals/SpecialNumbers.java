package finals;

import java.util.Arrays;
import java.util.HashSet;

public class SpecialNumbers {

	private int set[];
	int size;
	static int numnberOfData = 0;

	public SpecialNumbers(int size) {

		set = new int[size];

	}

	public void subNumbers(int original[], int from, int to) {

		if (to < from) {
			throw new IllegalArgumentException();
		}
		SpecialNumbers a = new SpecialNumbers(Arrays.copyOfRange(original, from, to));

	}

	public SpecialNumbers(int array[]) {

		set = new int[array.length];

		set = array;

	}

	public void add(int number) {
		boolean a = true;
		for (int i = 0; i < numnberOfData; i++) {
			if (set[i] == number) {
				a = false;
				break;
			}

		}
		if (a == true && numnberOfData <= set.length) {
			set[numnberOfData++] = number;

		} else {
			throw new IllegalStateException();
		}

	}

	int getLength() {
		return numnberOfData;
	}

	int getCapacity() {
		return size;
	}

	int nth(int n) {

		Arrays.sort(set);

		return set[n];

	}

}
