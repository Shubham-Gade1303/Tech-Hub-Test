import java.util.*;
public class Q6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // merge arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        // remaining elements
        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        int total = m + n;

        double median;

        // find median
        if (total % 2 == 1) {
            median = merged[total / 2];
        } else {
            median = (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }

        System.out.println("Median = " + median);
    }
}