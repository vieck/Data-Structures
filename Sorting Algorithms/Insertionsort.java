import java.util.Arrays;
public class Insertionsort {

    public static void main(String[] args) {
        Insertionsort object = new Insertionsort();
        double[] array = {2, 4, -1, 2, 5, 20, 3, 9, -8, 12, -14, 23};
        System.out.println("Unsorted " + Arrays.toString(array));
        array = insertionSort(array);
        System.out.println("Sorted " + Arrays.toString(array));
    }

    public static double[] insertionSort(double[] input) {
        for (int i = 1; i < input.length - 1; i++) {
            double temp = input[i];
            int j = i - 1;
            while (j >= 0 && (input[j] > temp)) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = temp;
        }
        return input;
    }
}
