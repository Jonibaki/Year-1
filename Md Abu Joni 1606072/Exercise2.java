//Md Abu Joni
//Reg. No. - 1606072
//Object Oriented Programming - CE152
//Deadline - 25/04/2017
package task2;

import java.util.Arrays;

public class Exercise2 {
	public static int[] closestToMean(double[][] array) {
		int[] rtnArray = new int[2];

		double sum = 0;
		double means = 0;
		int elem = 0;

		// calculating total means
		for (int rows = 0; rows < array.length; rows++) {
			for (int colm = 0; colm < array[rows].length; colm++) {
				sum += array[rows][colm];
				elem += 1;
			}
			means = sum / elem;
		}

		double distance = Double.MAX_VALUE;
		int closeOne = 0;

		// calculating closest array element
		for (int rows = 0; rows < array.length; rows++) {
			for (int colm = 0; colm < array[rows].length; colm++) {
				double temp = Math.abs(array[rows][colm] - means);
				if (temp < distance) {
					rtnArray[0] = rows;
					rtnArray[1] = colm;
					distance = temp;
					closeOne = (int) (temp + means);
				}

			}

		}
		System.out.printf("Means = %.2f %n", means);
		System.out.println("Closest array element " + closeOne);
		return rtnArray;

	}

	public static void testClosestToMean() {
		double[][] testArray = { { 3, -1, -4, 0 }, { 5, -2, 9, 6 }, { 8, 2, 4, -9 } };
		System.out.println("Array Position[r, c]:" + Arrays.toString(closestToMean(testArray)));

	}

	public static void main(String[] args) {
		testClosestToMean();
	}
}