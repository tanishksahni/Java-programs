/*
 Rearrange Array Alternately
Points: 4
Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Example 1:
Input:
N = 6
arr [] {1,2,3,4,5,6} Output: 6 1 5 2 4 3
=
Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... Modified array is: 6 1 5 2 4 3.
**/
import java.util.*;
class arrayrearrange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++)
        {
            for(int j =0; j<n; j++)
            {
                if(arr[i] > arr[j])
                {
                    int c = arr[j];
                    arr[j] = arr[i];
                    arr[i]=c;
                }

            }
        }
        int narr[]= new int[n];
        int elepos=0;
        int fm= 0;
        int bm=n-1;
        while(elepos < n)
        {
            if (elepos% 2 == 0)
            {
                narr[elepos]= arr[fm];
                fm++;
            }
            else{
                narr[elepos]= arr[bm];
                bm--;
            }
            elepos++;

        }
        for(int p=0;p<n;p++)
        {
            System.out.println(narr[p]);
        }
    }
}