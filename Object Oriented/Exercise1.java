//Md Abu Joni
//Reg. No. - 1606072
//Object Oriented Programming - CE152
//Deadline - 25/04/2017
package task1;

import java.util.Scanner;

public class Exercise1 {
	static Scanner userInput = new Scanner(System.in);

	public static void pizzaServiceA() {
		while (true) {
			// String Array  and double Array that holds toppings
			//price for large and medium pizza
			String[] topping = { "ham", "mozzarella", "olive", "pinaapple", "spinach" };
			double[] mediumPrice = { 1.40, 1.00, 0.80, 1.00, 0.80 };
			double[] largePrice = { 2.10, 1.50, 1.20, 1.50, 1.20 };

			double mPrice = 4.00;
			double lPrice = 5.00;

			double totalBill = 0;
			String topName = "";

			System.out.println("please make an order or enter \'quit\' to cancel >>");

			String orderPizza = userInput.nextLine();
			char sizeOfPizza = orderPizza.charAt(0);

			// terminate the program
			if (orderPizza.equalsIgnoreCase("quit")){
				System.out.println("The program just terminated...");
				break;
			}
			// checking for medium pizza and its topping
			// calculating the total price and return it.
			if (orderPizza.length() <= 5) {
				if (!(sizeOfPizza=='m' || sizeOfPizza=='l'))
					System.out.println("Please enter m for medium or l for large with/without topping >> \n");

				if (sizeOfPizza == 'm') {

					if (orderPizza.length() == 1) {
						System.out.printf("Medium pizza with no topping £%.2f", mPrice);
						System.out.println();
					} else {
						for (int i = 1; i < orderPizza.length(); i++) {
							if (orderPizza.charAt(i) == 'h') {
								System.out.println(topping[0] + " " + mediumPrice[0]);
								totalBill += mediumPrice[0];
								topName += topping[0] + ",";
							} else if (orderPizza.charAt(i) == 'm') {
								System.out.println(topping[1] + " " + mediumPrice[1]);
								totalBill += mediumPrice[1];
								topName += topping[1] + ",";
							} else if (orderPizza.charAt(i) == 'o') {
								System.out.println(topping[2] + " " + mediumPrice[2]);
								topName += topping[2] + ",";
								totalBill += mediumPrice[2];
							} else if (orderPizza.charAt(i) == 'p') {
								System.out.println(topping[3] + " " + mediumPrice[3]);
								topName += topping[3] + ",";
								totalBill += mediumPrice[3];
							} else if (orderPizza.charAt(i) == 's') {
								System.out.println(topping[4] + " " + mediumPrice[4]);
								topName += topping[4] + ",";
								totalBill += mediumPrice[4];
							}
						}
						totalBill += mPrice;
						System.out.printf("Medium pizza with %s £%.02f \n", topName, totalBill);
						System.out.println();
					}

				}

				// checking for large pizza price and its topping
				// calculating the total and return the total
				else if (sizeOfPizza == 'l') {

					if (orderPizza.length() == 1) {
						System.out.printf("Large pizza with no topping £%.2f", lPrice);
						System.out.println();
					} else {
						for (int i = 1; i < orderPizza.length(); i++) {
							if (orderPizza.charAt(i) == 'h') {
								System.out.println(topping[0] + " " + largePrice[0]);
								totalBill += largePrice[0];
								topName += topping[0] + ",";
							} else if (orderPizza.charAt(i) == 'm') {
								System.out.println(topping[1] + " " + largePrice[1]);
								totalBill += largePrice[1];
								topName += topping[1] + ",";
							} else if (orderPizza.charAt(i) == 'o') {
								System.out.println(topping[2] + " " + largePrice[2]);
								topName += topping[2] + ",";
								totalBill += largePrice[2];
							} else if (orderPizza.charAt(i) == 'p') {
								System.out.println(topping[3] + " " + largePrice[3]);
								topName += topping[3] + ",";
								totalBill += largePrice[3];
							} else if (orderPizza.charAt(i) == 's') {
								System.out.println(topping[4] + " " + largePrice[4]);
								topName += topping[4] + ",";
								totalBill += largePrice[4];
							}
						}
						totalBill += lPrice;
						System.out.printf("Large pizza with %s £%.02f \n", topName, totalBill);

					}

				}
			} // end of first if
			else {
				System.out.println("Please select an appropiate size of pizza >> \n");
			}

		} // end of while loop

	} // end of method pizzaServiceA
	public static void main(String[] arg) {
		pizzaServiceA();
	}
}
