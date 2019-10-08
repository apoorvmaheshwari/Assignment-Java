import java.util.Scanner;
public class DescendingOrder{
    
    public static void main(String[] args) {
        //int a[]= {12,27,46,4,5,23,7,8,9,0};
        //int temp=0;
        //Scanner s= new Scanner(System.in);
        //System.out.println("Enter Elements of array");
        //for (int i=0;i<a.length;i++)
        //{
          //  for (int j=0;j<a.length;j++)
            //{
              //  if(a[i]>a[j])
                //{
                  //  temp=a[i];
                    //a[i]=a[j];
                    //a[j]=temp;

                //}
            //}
        //}
        //for(int k=0;k<a.length;k++)
        //{
          //  System.out.println(a[k]);
        //}
        int n=5;
        String temp;
       
        String a[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the a:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i].compareTo(a[j])>0) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("a in Sorted Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        
    }
}
