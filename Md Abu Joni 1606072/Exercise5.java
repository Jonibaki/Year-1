//Md Abu Joni
//Reg. No. - 1606072
//Object Oriented Programming - CE152
//Deadline - 25/04/2017
package task5;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

////////////Sorting by Alphabetical Order///////////////
class AlphabeticalOrderComparator implements Comparator<Hill> {

	@Override
	public int compare(Hill strName1, Hill strName2) {
		return strName1.name.compareTo(strName2.name);
	}

}

///////////// Sorting by Descending Order////////////////
class DescendingOrderComparator implements Comparator<Hill> {

	@Override
	public int compare(Hill num1, Hill num2) {
		if (num1.height > num2.height) {
			return -1; // object is less than
		} else if (num1.height < num2.height) {
			return 1; // object is greater than
		}
		return 0; // object is equal to

	}

}

public class Exercise5 {
	///////////// Exercise5a///////////////
	public static void exercise5a() {
		Hill benNevis = new Hill(255, "Ben Nevis", "Highland", 1344.5, 56.796849, -5.003525);
		System.out.println(benNevis);
	}

	///////////// Exercise5b//////////////
	public static void exercise5b() {
		try {
			List<Hill> hillObject = Hill.readHills();

			// iterate through each element of loop
			// until counter reaches 20 and print them all
			for (int i = 0; i < 20; i++) {
				System.out.println(hillObject.get(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!!");
		}

	}

	/////////////// Exercise5c//////////////////
	public static void exercise5c() {
		try{
			List<Hill> hillObject;
			hillObject = Hill.readHills();
			Iterator<Hill> iterator = hillObject.iterator();
			while (iterator.hasNext()){
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please enter a hill name or quit to exit: ");
				String findHill = userInput.nextLine();
				// terminate program entering "quit"
				if (findHill.equalsIgnoreCase("quit")) {
					System.out.println("Good- bye");
					break;
				}
				// loop through each index of the list
				// by checking against with userInput
				// get each index and print it
				else if (findHill.length()>0){
					for (int i = 0; i < hillObject.size(); i++) {
						if (hillObject.get(i).name.toLowerCase().startsWith(findHill.toLowerCase())) {
							System.out.println(hillObject.get(i));
						}
					}
				}else{
					System.out.println("No Search Found");
				}	
			} 
		}catch (FileNotFoundException e) {
			System.out.println("File doesn't exit");
		}
	}

	/////////////////// Exercise5d///////////////////
	public static void exercise5d() {

		try {
			// Calling the list from Hill Class and assign it to new List
			List<Hill> hillObject = Hill.readHills();

			// looping through list and printing the height in alphabetical
			// order
			Collections.sort(hillObject, new AlphabeticalOrderComparator());
			System.out.println("##############Sorting By Alphabetical Order##############");
			for (int i = 0; i < 20 && i < hillObject.size(); i++) {
				System.out.println(hillObject.get(i));
			}
			System.out.println("##############Sorting By Descending Order##############");

			// looping through list and printing the height in descending order
			Collections.sort(hillObject, new DescendingOrderComparator());

			for (int i = 0; i < 20; i++) {
				System.out.println(hillObject.get(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

	}

	////////////// Exercie5e//////////////////
	public static void exercise5e() throws FileNotFoundException {
		Map<String, Set<Hill>> newMap = Hill.hillsByCounty(Hill.readHills());
		int m=0;
		for (Map.Entry<String, Set<Hill>> entry : newMap.entrySet()) {
			if (m>=3){ //control the limit print of county
				break;}
			int i = 0;
			System.out.println("### County: " + entry.getKey());
			m++;
			for (Hill hill : entry.getValue()) {
				if (i >= 3) {//control the limit print of hill 
					break;
				}
				System.out.println(hill.name + " " + hill.height);
				i++;
			}
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		exercise5a();
		exercise5b();
		exercise5c();
		exercise5d();
		exercise5e();
	}
}
