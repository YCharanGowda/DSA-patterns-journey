// Day: 1
// Pattern: Two Pointers
// Difficulty: Easy
// Problem: Palindrome Check
// Time Complexity: O(n)
// Space Complexity: O(1)

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "madam";

        if (isPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
Example Output:
Palindrome
*/

