package ArrayPattern;

import java.util.Scanner;

public class Feb27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		
//		int max =a[0];
//		
//    	for(int i=0; i<=a.length-1; i++) {
//			if(a[i]>max) {
//				max= a[i];
//			
//			}
//		}
//    	System.out.println("largest element of the array is "+max);
	
		
		
		/*Question 16 --> Smallest element*/
		
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		
//		int min =a[0];
//		
//    	for(int i=0; i<=a.length-1; i++) {
//			if(a[i]<min) {
//				min= a[i];
//			
//			}
//		}
//    	System.out.println("largest element of the array is "+min);
		
		
		
		/*Question 17--> 2nd largest*/
		
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		
//		int max =a[0];
//		int secondMax = a[0];
//		
//    	for(int i=0; i<=a.length-1; i++) {
//			if(a[i]>max) {
//				secondMax = max;
//				max= a[i];
//			
//			}else if(a[i]>secondMax && a[i]!=max) {
//				secondMax=a[i];
//			}
//		}
//    	System.out.println("2nd largest element of the array is "+secondMax);
//    	
    	
		
		
		/*Swapping*/
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		
//		int temp = 0;
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]>a[j]) {
//					temp =a[i];
//					a[i]= a[j];
//					a[j]= temp;
//				}
//			}
//		}
//		//System.out.println(a[j]);
//    	System.out.println(" After sorting assending Array content are...");
//    	for(int i=0;i<a.length; i++) {
//    		System.out.print(a[i]+" ");
//    	}
		
		
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		
//		int temp = 0;
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]<a[j]) {
//					temp =a[i];
//					a[i]= a[j];
//					a[j]= temp;
//				}
//			}
//		}
//		//System.out.println(a[j]);
//    	System.out.println(" After sorting decending Array content are...");
//    	for(int i=0;i<a.length; i++) {
//    		System.out.print(a[i]+" ");
//    	}
		
		
		
		
//		/*Question no. 15,16,17,18 answers------------>*/
//		System.out.println("Enter your length...");
//		int a[] = new int [scan.nextInt()];
//		
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.println("Enter an element");
//			a[i]=scan.nextInt();
//			}
//		
//		int temp = 0;
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]>a[j]) {
//					temp =a[i];
//					a[i]= a[j];
//					a[j]= temp;
//				}
//			}
//		}
//		//System.out.println(a[j]);
//    	System.out.println(" Smallest element is: "+a[0]);
//    	System.out.println("Second Smallest element " +a[1]);
//    	
//    	System.out.println(" Largest element is: "+a[a.length-1]);
//    	System.out.println(" Second Largest element is: "+a[a.length-2]);
		
		
		
		/*Swapping without third variable*/
//		int a=10;
//		int b=20;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("value of A after swapping "+a+", "+"value of B after swapping " + b);
		
		
		
		
		/*Ques no. 15,16,17,18 answers-> IN THIS SWAPPING IS DONE WITHOUT CREATING 3RD VARIABLE*/
		System.out.println("Enter your length...");
		int a[] = new int [scan.nextInt()];
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter an element");
			a[i]=scan.nextInt();
			}
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]= a[i]-a[j];
					a[i]= a[i]-a[j];
				}
			}
		}
		//System.out.println(a[j]);
    	System.out.println(" Smallest element is: "+a[0]);
    	System.out.println("Second Smallest element " +a[1]);
    	
    	System.out.println(" Largest element is: "+a[a.length-1]);
    	System.out.println(" Second Largest element is: "+a[a.length-2]);
		
	}

}
