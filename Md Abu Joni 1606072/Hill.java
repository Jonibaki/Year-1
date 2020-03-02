//Md Abu Joni
//Reg. No. - 1606072
//Object Oriented Programming - CE152
//Deadline - 25/04/2017
package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hill {
	public int number;
	public String name;
	public String county;
	public double height;
	public double latitude;
	public double longitude;

	// constructor class
	public Hill(int number, String name, String county, double height, double latitude, double longitude) {
		this.number = number;
		this.name = name;
		this.county = county;
		this.height = height;
		this.latitude = latitude;
		this.longitude = longitude;

	}

	// String representation
	public String toString() {
		return this.number + "," + this.name + "," + this.county + "," + this.height + "," + this.latitude + ","
				+ this.longitude;

	}

	public static List<Hill> readHills() throws FileNotFoundException {
		File fileName = new File("data/hills.csv");

		List<Hill> list = new ArrayList<Hill>();
		Scanner input = new Scanner(fileName);
		input.nextLine(); // ignore the first line

		while (input.hasNextLine()) {
			String nextLine = input.nextLine(); // get the next line
			String[] holdLine = nextLine.split(","); // split it on and hold it into

			// set each part of the line to each variables
			int number = Integer.parseInt(holdLine[0]);
			String name = holdLine[1];
			String county = holdLine[2];
			Double height = Double.parseDouble(holdLine[3]); 
			// convert data type to double data type
			Double latitude = Double.parseDouble(holdLine[4]);
			Double longitude = Double.parseDouble(holdLine[5]);

			Hill record = new Hill(number, name, county, height, latitude, longitude);
			list.add(record); // add to the list
		}

		input.close();
		return list;
	}

	public static Map<String, Set<Hill>> hillsByCounty(List<Hill> hills) throws FileNotFoundException {
		// Create Map interface 
		Map<String, Set<Hill>> results = new TreeMap<String, Set<Hill>>();
		
		//Iterate through hills 
		for(Hill hillMap: hills){
			//assign value to new Set  
			Set<Hill> hillSet = results.get(hillMap.county);
			if (hillSet==null){ //null key assigned to new TreeSet and Call Comparator Method
				hillSet= new TreeSet<Hill>(new AlphabeticalOrderComparator());
				results.put(hillMap.county, hillSet); //Map holds the all values for county and Set
			}
			hillSet.add(hillMap);

		
		}
		return results;
	}
}