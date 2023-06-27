package ArrayPattern;

import java.util.Scanner;

public class Mar1 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter length of the array");
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter elements of the array");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println("Enter your elements for index "+i);
			arr[i]= sc.nextInt();
		}
		
	}

}
