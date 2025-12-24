// Day: 1
// Pattern: Two Pointers
// Difficulty: Easy
// Problem: Two Sum (Sorted Array)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class TwoSumSorted {

    public static void twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Indices: " + left + ", " + right);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        twoSum(arr, target);
    }
}

/*
Example Output:
Indices: 1, 3
*/

