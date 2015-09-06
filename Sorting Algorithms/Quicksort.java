import java.util.ArrayList;
// Best Case: n * log(n)
// Average Case: n * log(n)
// Worst Case: n^2
public static quicksort(ArrayList input) {
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