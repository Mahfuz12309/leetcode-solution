public class removeDuplicate2 {
        public static int removeDuplicates(int[] nums) {
                    if (nums == null || nums.length == 0) {
                        return 0;
                    }
                    int i = 1;
                    for (int j = 2; j < nums.length; j++) {
                        if (nums[j] != nums[i - 1]) {
                            i++;
                            nums[i] = nums[j];
                        }
                    }
                    return i + 1;
                }
            
                public static void main(String[] args) {
            
                  
                    int[] nums1 = {1, 1, 1, 2, 2, 3};
                    System.out.println("New length: " + removeDuplicates(nums1));
            
            System.out.print("Modified array: ");
            for (int num:nums1) {
                System.out.print(num+" ");
            }
            System.out.println();
    
            
        }
    }
    
