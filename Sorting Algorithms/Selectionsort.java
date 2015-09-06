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