import java.util.Arrays;

public class Mergesort {

    public static void Main(String[] args) {
        Mergesort object = new Mergesort();
        double[] array = {2, 4, -1, 2, 5, 20, 3, 9, -8, 12, -14, 23};
        System.out.println("Unsorted " + Arrays.toString(array));
        array = mergesort(array);
        System.out.println("Sorted " + Arrays.toString(array));
    }

    public static void mergesort(double[] input) {
        if (input.length() > 1) {
            int middle = input.length / 2;
            double[] left = Arrays.copyOfRange(input, 0, middle);
            double[] right = Arrays.copyOfRange(input, middle, input.length);
            right = mergesort(right);
            left = mergesort(left);
            return merge(left, right);
        }
        return input;
    }

    public void merge(double[] left, double[] right) {

    }

}
