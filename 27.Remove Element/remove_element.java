public class remove_element {
    public static void remove_element(int []array,int target)
    {
        int j= array.length-1;
        int count =0;
        for(int i=0;i<j;i++)
        {
            if(array[i]!=target ){

                array[count]=array[i];
                count++;
            }

        }
            
        for(int i=0;i<count;i++)
        {
            System.out.println(array[count]);
            
        }
        
}

    public static void main(String[] args) {
        int arr[]= {4,5};
        int target =5;
        remove_element(arr,target);
    }
    
}
