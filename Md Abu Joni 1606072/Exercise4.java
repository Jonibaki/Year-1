//Md Abu Joni
//Reg. No. - 1606072
//Object Oriented Programming - CE152
//Deadline - 25/04/2017
package task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class Exercise4 {
	public static boolean[][] readMaze() {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("data/maze21.txt")))) {
			int rows = 21;
			int colms = 21;

			boolean array[][] = new boolean[rows][colms];
			String line = null;

			int count = 0;
			while ((line = bufferedReader.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (c == ' ') {
						array[count][i] = true;
					} else {
						array[count][i] = false;
					}
				}
				count += 1;
			}
			return array;

		} catch (FileNotFoundException i) {
			System.out.println("The file doesn't exit");
			return null;
		} catch (InputMismatchException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
	}

	private static void printMaze(boolean[][] maze) {
		// iterate though rows and columns
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				if (maze[i][j] == false) {
					System.out.print("#");
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		boolean[][] maze = readMaze(); // invoking method to 2D array
		printMaze(maze); // invoke array to print method

	}

}
