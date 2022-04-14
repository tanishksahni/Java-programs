//Find the unique number in an array of n integers. A unique is a number over which the last iteration ends, on rotating the entire array r times.  
import java.util.*;
class unino
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array and array elements");
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotations");
        int r=sc.nextInt();
        int num=0, diff=0;
        int fpos=0;
        num=arr[0];
        int uno=num;
        while (r>=0)
        {
            int i=0;
            if (diff==0){

                while (i<n)
                {
                   uno=arr[i];
                   i+=num;    
                   fpos=i;
                }
                diff=num-(n-fpos);
            }
            else{
                num=diff;
                while (i<n)
                {
                    uno=arr[i];
                    i+=num;    
                    fpos=i;
                }
                diff=num-(n-fpos);
               
            }    
            r-=1;
        }
        System.out.println("UNIQUE NUMBER: "+ uno);
    }
}
