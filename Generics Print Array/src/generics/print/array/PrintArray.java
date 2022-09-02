package generics.print.array;

public class PrintArray {
	public static void main(String[] args) {
		Integer[] intArray = {7, 14, 21, 28, 35, 42, 49};
		Double[] doubleArray = {1.2, 2.3, 3.5, 5.8, 8.13, 13.21, 21.34, 34.55};
		Character[] charArray = {'C', 'H', 'A', 'R', 'A', 'C', 'T', 'E', 'R', 'S'};
	
		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);
	}
	
	public static <E> void toPrint(E[] inputArray) {
		for (E element : inputArray) {
			System.out.print(element+"\s");
		}
		System.out.println("\n");
	}
}
