package ArrayPattern;

import java.util.Scanner;

public class Feb28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length array");
		int arr[]= new int[scan.nextInt()];
		
		System.out.println("Enter elements to store in array");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter element of index: "+i);
			arr[i]= scan.nextInt();
		}
		
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("Array after sorting-------> ");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
					
				}
			}
			
		}
		System.out.println("The number of duplicate elements is "+count);
	}
}
