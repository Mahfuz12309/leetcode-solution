import java.util.Scanner;

public class validPalindrom {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s|[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int n=s.length();
        boolean palindrom = true;
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                palindrom =false;
                
            }
        }
        return palindrom;


        
    }    
    public static void main(String[] args) {
        String s= new String();
        Scanner sc = new Scanner(System.in);
        s= sc.nextLine();
        s = s.replaceAll("\\s|[^a-zA-Z0-9]","");
        System.out.println(s);
        System.out.println(isPalindrome(s));

    }
    
}
