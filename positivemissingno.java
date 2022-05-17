/* Smallest Positive missing number Medium Accuracy: 45.09% Submissions: 100k+
Points: 4
You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.
Example 1:
Input:
N = 5
arr [] {1,2,3,4,5} =
Output: 6
Explanation: Smallest positive missing
number is 6.
**/
import java.util.*;
public class positivemissingno 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++)
        {
            for(int j =0; j<n; j++)
            {
                if(arr[i] < arr[j])
                {
                    int c = arr[j];
                    arr[j] = arr[i];
                    arr[i]=c;
                }

            }
        }
        System.out.println();
        for(int i=0; i<n ; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
        
        System.out.print("Smallest Positive missing number: ");
        for(int i=arr[0], j=0 ; i<=arr[n-1] && j<n; i++ , j++)
        {
            if(i>0)
            {
                if(i!=arr[j])
                {
                    System.out.println("A"+i);
                    System.exit(0);
                }
                else{
                    if(arr[0]>1){
                       System.out.println("B"+(arr[0]-1));
                       System.exit(0);
                    }
                    else{
                        System.out.println("C"+(arr[n-1]+1));
                        System.exit(0);
                    }
                }

            }  
            
        }
    }
    
}
