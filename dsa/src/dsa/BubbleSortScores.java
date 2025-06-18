package dsa;

public class BubbleSortScores {

    public static void main(String[] args) {
        int[] arr = {85, 67, 90, 76, 88};  // ✅ Declare and initialize the array
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // Optimization: stop if no swap occurred
        }

        // Output sorted scores
        System.out.println("Sorted Scores:");
        for (int score : arr) {
            System.out.print(score + " ");
        }
    }
}
