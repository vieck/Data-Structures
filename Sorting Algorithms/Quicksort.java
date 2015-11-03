import java.lang.Double;
import java.util.ArrayList;
import java.util.Arrays;
// Best Case: n * log(n)
// Average Case: n * log(n)
// Worst Case: n^2

public class Quicksort {

    public static void main(String[] args) {
        Quicksort object = new Quicksort();
        List<Double> array = {2, 4, -1, 2, 5, 20, 3, 9, -8, 12, -14, 23};
        System.out.println("Unsorted " + Arrays.toString(array));
        array = sort(array);
        System.out.println("Sorted " + Arrays.toString(array));
    }

    public static ArrayList<Double> sort(ArrayList input) {
        if (input.size() > 0) {
            double pivot = input.get(0);

            Arraylist before = new ArrayList();
            Arraylist current = new ArrayList();
            ArrayList after = new ArrayList();

            for (double item : input) {
                if (item < pivot) {
                    before.add(item);
                } else if (item > pivot) {
                    after.add(item);
                } else {
                    current.add(item);
                }
            }
            before = quicksort(before);
            more = quicksort(after);

            before.addAll(current);
            current.addAll(after);

            return before;
        } else {
            return input;
        }
    }
}
