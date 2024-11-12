
public class code {
    public static int removeDuplicates(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0; 
            }
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;  
                    nums[i] = nums[j];  
                }
            }
            
            return i + 1;
        }
                
    
        public static void main(String[] args) {
            int num[]={1,1,2};
            int length=removeDuplicates(num);
            for(int i=0;i<length;i++)
            {
                System.out.println(num[i]);
            }
    }
    
}
