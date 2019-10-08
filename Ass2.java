import java.util.Scanner;
public class Ass2{
    
    public static void main(String[] args) {
       
        int n=5;
        String temp;
        
       
        String a[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the a:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s1.nextLine();
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string you want to search");
        temp=s.nextLine();
        for (int i = 0; i < n; i++) 
        {
            
                if (a[i].compareTo(temp)==0) 
                {
                    System.out.println("String found");
                    System.out.println("Location of string:"+i);
                    

                }

            
        }
        
    }
}
