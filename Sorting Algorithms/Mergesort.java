import java.util.Arrays;
public static void mergesort(double[] input) {
    if ( input.length() > 1 ) {
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