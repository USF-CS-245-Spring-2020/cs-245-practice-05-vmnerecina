/* CS245 Practice Assignment 5 test mega sort
victoria nerecina
this program: 

requirement 2:
Quick Sort with first element as pivot 
chosen because average runtime is same as best runtime
worst case, the digit integers are already in order
quick sort is great when dealing with a lot of data to sort

Quick Sort:
	divide array to two subarrays
	recursively sort the two subarrays
	combine the two sorted subaraays

Runtime:
	best: big-O(nlgn)
	worst: big-O(n^2)
	average: big-O(nlgn)

Requirement 3:
MegaSort:
	must take one parameter
	the name of the input file
	must output the sorted list to standard out (the terminal), one entry per line.

sort a large number of integers 
*/

//import java.util.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;




//my modified quicksort, part form geeks for geeks and previous practice assignment 4
public class MegaSort extends QuickSort5 {
	public static void main(String[] args) throws IOException {
		readFile("1m-ints.txt");
		//System.out.println(Arrays.toString(data)); //prints out array

	}


	public static int[] readLine(String line) {
		int[] returnList = new int[line.length()];
		for (int i = 0; i < line.length(); i++) {
			returnList[i] = Integer.parseInt(Character.toString((line.charAt(i))));
		}

		QuickSort5.quicksort(returnList);
		return returnList;
	}


	//reading the file
	public static void readFile(String file) throws IOException {


		for (String line : Files.readAllLines(Path.of(file))){
			System.out.println(line);
			System.out.println(Arrays.toString(readLine(line)));

		}


	}

}
