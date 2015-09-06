public static double[] bubblesort(double[] input) {
    boolean flag = true;
    while (flag) {
        flag = false;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] < input[i+1]) {
                double temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
                flag = true;
            }
        }
    }
    return input;
}