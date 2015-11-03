import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch object = new BinarySearch();
		double[] array = {-2, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		System.out.println("Enter in the number to find");
		Scanner scanner = new Scanner(System.in);
		double value = scanner.nextDouble(); 
		int location = search(value, array, 0, array.length);
		if (location == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println(Arrays.toString(array));
			System.out.println("Found at " + location);
		}
	}

	public static int search(double value, double[] array, int low, int high) {
		if (low > high) {
			return -1;
		}
		int middle = (low + high) / 2;	
		if (array[middle] < value) {
			return search(value, array, middle+1, high);
		} else if (array[middle] > value) {
			return search(value, array, low, middle-1);
		} else {
			return middle;
		}
	}
}
