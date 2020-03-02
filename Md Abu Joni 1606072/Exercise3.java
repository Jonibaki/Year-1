//Md Abu Joni
//Reg. No. - 1606072
//Object Oriented Programming - CE152
//Deadline - 25/04/2017
package task3;

import java.util.Scanner;

public class Exercise3 {
	static Scanner input = new Scanner(System.in);

	public static long catalan(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("The n'th number can't be smaller than 0.");
		}
		if (n > 30) {
			throw new IllegalArgumentException("The n'th number can't be higher than 30.");
		}

		if (n > 0) {
			return (2 * (2 * n - 1) * catalan(n - 1) / (n + 1));
		} else if (n == 0) {
			return 1;
		}

		return catalan(n);
	}

	public static void exercise3a() {
		while (true) {
			System.out.println("Please enter an integer or quit to exit >> ");

			String number = input.nextLine();

			// end the loop
			if (number.equalsIgnoreCase("quit"))
				break;

			// convert the string value to integer
			int temp = Integer.parseInt(number);
			System.out.println(catalan(temp) + "\n");
		}

	}

	public static void exercise3b() {

		while (true) {
			try {
				System.out.println("Please enter an integer or type \'quit\' to exit >> ");
				String number = input.nextLine();

				if (number.equalsIgnoreCase("quit"))
					break;

				int temp = Integer.parseInt(number);
				if (0 <= temp || temp <= 30)
					System.out.println(catalan(temp));
			} catch (IllegalArgumentException e) {
				System.out.println("Please enter a valid integer between 0 to 30\n");
			}
		} // end of loop

	} // end of method exercise3b

	public static void main(String[] args) {
		exercise3a();
		exercise3b();

	}

}
