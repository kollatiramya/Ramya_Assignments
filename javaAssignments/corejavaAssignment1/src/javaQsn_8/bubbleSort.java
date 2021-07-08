package javaQsn_8;

import java.util.Scanner;

public class bubbleSort {
	public static void search(int arr[]){
		 int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	}
	
	public static void main(String[] args) {
		int arr[] =new int[15];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array number:");
		for(int i=0;i<15;i++){
			System.out.println("enter "+(i+1)+"value:");
			arr[i]=sc.nextInt();
			//System.out.println(search(num));
		}
		System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
			search(arr);
			System.out.println("number in bubble sorting");
			for(int i=0;i<arr.length-1;i++) {
				System.out.println(arr[i]+"");
			}
			
			
		

	}


}