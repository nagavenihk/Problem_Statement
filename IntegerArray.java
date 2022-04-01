package com.integerarray;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int A[] = {3,2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
	       
	        System.out.println("Original array: ");
	        for(int i = 0;i<=17;i++)
	        {
	            System.out.print(A[i]+" ");
	        }
	        
	        int sum=0;
	        for(int i=0;i<=14;i++)
	        {
	            sum+=A[i];
	        }
	       
	        A[15] = sum;
	        int average = (sum+A[15])/16;
	        A[16] = average;
	       
	        int min = A[0];
	        for(int i=1;i<=16;i++)
	        {
	            if(A[i]<min)
	            {
	                
	                min=A[i];
	            }
	        }
	        
	        A[17] = min;
	        
	        System.out.println("\nUpdated array: ");
	        for(int i = 0;i<=17;i++)
	        {
	            System.out.print(A[i]+" ");
	        }
	    }

	}


