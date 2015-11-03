import java.util.Arrays;
public class Bubblesort {

    public static void main(String[] args) {
        Bubblesort object = new Bubblesort();
        double[] array = {2, 4, -1, 2, 5, 20, 3, 9, -8, 12, -14, 23};
        System.out.println("Unsorted " + Arrays.toString(array));
        array = bubblesort(array);
        System.out.println("Sorted " + Arrays.toString(array));
    }

    public static double[] bubblesort(double[] input) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    double temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return input;
    }
}
