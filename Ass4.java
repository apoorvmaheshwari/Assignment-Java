import java.util.Scanner;
public class Ass4 
{

     public static void main(String[] args) 
     {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array to enter");
        int num = s.nextInt();
        int a[] = new int[num];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number array");
             for(int i = 0; i < num; i++)
                    {
                        a[i] = s1.nextInt();
                    }
                    int b[]=new int[num];
                    int temp=num;
                for(int j=0;j<num;j++)
                {
                        b[temp-1]=a[j];
                        temp--;
                }
        for (int  k= 0; k <num; k++) 
        {
            System.out.print(b[k] + ",");
        }


    }
}