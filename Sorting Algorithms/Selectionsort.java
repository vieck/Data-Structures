import java.util.Arrays;
public class SelectionSort {

    public static void Main(String[] args) {
        SelectionSort object = new SelectionSort();
        double[] array = {2, 4, -1, 2, 5, 20, 3, 9, -8, 12, -14, 23};
        System.out.println("Unsorted " + Arrays.toString(array));
        array = selectionsort(array);
        System.out.println("Sorted " + Arrays.toString(array));
    }

    public static double[] selectionsort(double[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int small = Integer.MAX_VALUE;
            int currentSmallest = i + 1;
            for (int j = i; j < input.length; j++) {
                if (input[j] < small) {
                    current = i;
                    small = input[i];
                }
            }
            int temp = input[i];
            input[i] = input[currentSmallest];
            input[currentSmallest] = temp;
        }
        return input;
    }
}
