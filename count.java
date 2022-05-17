import java.util.*;
public class count 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=0;
            if(arr[i] != -1)
            {
                int c=arr[i];
                for(int j=0;j<n;j++)
                {
                    if(c==arr[j])
                    {
                        count++;
                        arr[j]=-1;
                    }
                }
                System.out.println("Frequency of "+ c + " is " + count);
            }
        }
    }
    
}
