class Solution {

    static int merge(int arr[], int s, int e, int mid) {

        int leftArrayLen = mid - s + 1;
        int rightArrayLen = e - mid;

        int leftArray[] = new int[leftArrayLen];
        int rightArray[] = new int[rightArrayLen];

        // Copy left array
        int k = s;

        for (int i = 0; i < leftArrayLen; i++) {
            leftArray[i] = arr[k];
            k++;
        }

        // Copy right array
        k = mid + 1;

        for (int j = 0; j < rightArrayLen; j++) {
            rightArray[j] = arr[k];
            k++;
        }

        // Merge
        int i = 0;
        int j = 0;
        k = s;

        int invCount = 0;

        while (i < leftArrayLen && j < rightArrayLen) {

            if (leftArray[i] <= rightArray[j]) {

                arr[k] = leftArray[i];
                i++;
                k++;

            } else {

                arr[k] = rightArray[j];
                j++;
                k++;

                // All remaining elements in left array
                // will form inversions with rightArray[j]
                invCount += leftArrayLen - i;
            }
        }

        // Remaining left elements
        while (i < leftArrayLen) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Remaining right elements
        while (j < rightArrayLen) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

        return invCount;
    }


    static int mergeSort(int arr[], int s, int e) {

        // Base case
        if (s >= e) {
            return 0;
        }

        // Divide
        int mid = s + (e - s) / 2;

        // Count inversions in left half
        int leftInversions = mergeSort(arr, s, mid);

        // Count inversions in right half
        int rightInversions = mergeSort(arr, mid + 1, e);

        // Merge and count cross inversions
        int intermediateInversions = merge(arr, s, e, mid);

        // Total inversions
        return leftInversions + rightInversions + intermediateInversions;
    }


    public int inversionCount(int arr[]) {

        int s = 0;
        int e = arr.length - 1;

        return mergeSort(arr, s, e);
    }
}