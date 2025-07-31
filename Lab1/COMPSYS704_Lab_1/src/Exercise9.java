public class Exercise9 {
    public static void bubbleSort(int[] A) {
        int n = A.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (A[i - 1] > A[i]) {
                    // Swap A[i-1] and A[i]
                    int temp = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = temp;
                    swapped = true;
                }
            }
            // After each pass, the largest element is at the end
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    private static void printArray(int[] A) {
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
