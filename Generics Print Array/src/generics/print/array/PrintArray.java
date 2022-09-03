package generics.print.array;

/*Given an array of Integer, Double and Character, write a program to print the same
- Create PrintArray class and define toPrint method to print corresponding elements to stdout
 */

public class PrintArray {
	public static void main(String[] args) {
		Integer[] intArray = {7, 14, 21, 28, 35, 42, 49};
		Double[] doubleArray = {1.2, 2.3, 3.5, 5.8, 8.13, 13.21, 21.34, 34.55};
		Character[] charArray = {'C', 'H', 'A', 'R', 'A', 'C', 'T', 'E', 'R', 'S'};
	
		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);
	}
	
	
	public static void toPrint(Integer[] inputArray) {
		for (int element : inputArray) {
			System.out.print(element+"\s");
		}
		System.out.println("\n");
	}
	
	public static void toPrint(Double[] inputArray) {
		for (double element : inputArray) {
			System.out.print(element+"\s");
		}
		System.out.println("\n");
	}
	
	public static void toPrint(Character[] inputArray) {
		for (char element : inputArray) {
			System.out.print(element+"\s");
		}
		System.out.println("\n");
	}
}
