import java.util.Arrays;

public class Plusone {
    
    public static int[] plusOne(int[] digits) {
        // Start from the last digit and increment
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, just return the result
            }
            digits[i] = 0; // Set current digit to 0 if it was 9
        }
        
        // If we exit the loop, it means we have a carry
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1; // Set the first element to 1 (carry)
        return newArray; // Remaining elements are already 0
    }

    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits))); // Print the result
    }
}