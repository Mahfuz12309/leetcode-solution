public class majorityElement {
        // Function to find the majority element using Boyer-Moore Voting Algorithm
        public static int majorityElement(int[] nums) {
            int candidate = -1;
            int count = 0;
    
            
            for (int num : nums) {
                if (count == 0) {
                    candidate = num;  
                }
                count += (num == candidate) ? 1 : -1;  
            }
    
            return candidate;
        }
    
        public static void main(String[] args) {
            
            int[] nums1 = {3, 2, 3};
            System.out.println("Majority Element in nums1: " + majorityElement(nums1));  // Output: 3
    
               
        }

    
}
