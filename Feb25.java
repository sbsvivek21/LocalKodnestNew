package ArrayPattern;

import java.util.Scanner;

public class Feb25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*Question 9 - index divisible by 3 or 5*/
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		System.out.println("Array contents...");
//		for(int i=0; i<a.length; i++) {
//			if(i%3==0||i%5==0) {
//				System.out.println(a[i]);
//			}
//		}
		
		
		
		/*sum of the even or odd elements of array by for loop*/
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		System.out.println("Array contents...");
//		 int evensum=0;
//		 int oddsum = 0;
//		 for(int i=0; i<=a.length-1; i++) {
//			 if(a[i]%2==0) {
//				evensum = evensum+a[i];
//			 }
//			 else {
//			    oddsum = oddsum+a[i];
//			 }
//			 
//		 }
//		 System.out.println("Sum of even elements of array is: "+evensum);
//		 System.out.println("Sum of odd elements of array is: "+oddsum);
	
	/*ques 12 = write to print the product of all elements present in an array*/
//		 System.out.println("Enter your length...");
//			int a[] = new int [scan.nextInt()];
//			
//			
//			for(int i=0; i<a.length; i++) {
//				System.out.println("Enter an element");
//				a[i]=scan.nextInt();
//				}
//			int product = 1;
//			System.out.println("Array contents...");
//			for(int i=0; i<=a.length-1; i++) {
//				product= product*a[i];
//			}
//			System.out.println("product of the array is "+product);
//	
		
		
//		/*Question 13*/
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		int sum = 0, avg =0;
//		System.out.println("Array contents...");
//		for(int i=0; i<=a.length-1; i++) {
//			sum = sum+a[i];
//			
//		}
//		avg = sum/a.length;
//		System.out.println("avg of the array is "+avg);

		
		
		
//		/*Question 14 - reverse the array*/
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		
//		System.out.println("reverse array ");
//		for(int i=a.length-1; i>=0; i--) {
//			System.out.print(+a[i]);
//			
//		}
//		
		
		
		/*Question 15 - largest element of array*/
		System.out.println("Enter your length...");
		int a[] = new int [scan.nextInt()];
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter an element");
			a[i]=scan.nextInt();
			}
		
		int max =a[0];
		
    	for(int i=0; i<=a.length-1; i++) {
			if(a[i]>max) {
				max= a[i];
			
			}
		}
    	System.out.println("largest element of the array is "+max);

		
		
		
		
	}

}
