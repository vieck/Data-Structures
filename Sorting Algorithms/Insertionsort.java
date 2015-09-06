public static double[] insertionSort(double[] input) {
    for (int i = 1; i < input.length - 1) {
        double temp = double[i];
        int j = i - 1;
        while (j >= 0 && (input[j] > temp)) {
            input[j+1] = input[j];
            j--;
        }
        input[j+1] = temp;
    }
    return input;
}