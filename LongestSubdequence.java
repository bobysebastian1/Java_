package longestSubsequence;
import java.util.*;
public class LongestSubdequence {
			static int lis(int  numbers[] , int n)
		    {
		        int lis[]  = new int[n];
		        int i, j, max = 0;
		 
		        // Initialize LIS values for all indexes 
		        for (i = 0; i < n; i++)
		            lis[i] = 1;
		 
		        /* Compute optimized LIS values in
		           bottom up manner */
		        for (i = 1; i < n; i++)
		            for (j = 0; j < i; j++)
		                if (numbers[i] > numbers[j] && lis[i] < lis[j] + 1 )
		                    lis[i] = lis[j] + 1;
		 
		        // Pick maximum of all LIS values 
		        for (i = 0; i < n; i++)
		            if (max < lis[i])
		                max = lis[i];
		 
		        return max;
		    }
			public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter How Many Elements in Array:");
				int n = sc.nextInt();
				int[] numbers = new int[n];  
				System.out.println("Enter Some Random Numbers to the array: ");  
				for(int i=0; i<n; i++)  
				{  
				//reading array elements from the user   
				numbers[i]=sc.nextInt();  
				}  
				System.out.println("Array elements are: ");  
				for (int i=0; i<n; i++)   
				{  
				System.out.print(numbers[i]+" ");  
				}  
				System.out.println("\n---------------------");
				System.out.println("The Longest Increasing Subsequence Contains of "
						+ "\nMaximum "+lis(numbers,n)+" Values ");
			
			}
		

	

}
