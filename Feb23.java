package ArrayPattern;
import java.util.Scanner;

public class Feb23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*QUE:- 1*/
//		System.out.println("Enter length of the array: ");
//		int []a = new int[scan.nextInt()];
//		
//		System.out.println("Enter elements to store in array: ");
//		for(int i=0; i<=a.length-1; i++) {
//			a[i] = scan.nextInt();
//		}
//		
//		System.out.println("Array content are...");
//		for(int i=0; i<=a.length-1; i++) {
//			System.out.print(a[i]+" ");
//		}
		
		
		/*QUE:- 2*/
//		System.out.println("Enter length of the array: ");
//		int []a = new int[scan.nextInt()];
//		
//		System.out.println("Enter elements to store in array: ");
//		for(int i=0; i<=a.length-1; i++) {
//			a[i] = scan.nextInt();
//		}
//		
//		System.out.println("Array content are...");
//		for(int i=0; i<=a.length-1; i++) {
//			if(i%2==0) {
//				System.out.print(a[i]+" ");
//			}
//			
//		}
		
		
//		/*QUE:-3*/
//		System.out.println("Enter length of the array: ");
//		int []a = new int[scan.nextInt()];
//		
//		System.out.println("Enter elements to store in array: ");
//		for(int i=0; i<=a.length-1; i++) {
//			a[i] = scan.nextInt();
//		}
//		
//		System.out.println("Array content are...");
//		for(int i=0; i<=a.length-1; i++) {
//			if(i%2!=0) {
//				System.out.print(a[i]+" ");
//			}
//			
//		}
		
		
//		/*QUE:-4*/
//		System.out.println("Enter length of the array: ");
//		int []a = new int[scan.nextInt()];
//		
//		System.out.println("Enter elements to store in array: ");
//		for(int i=0; i<=a.length-1; i++) {
//			a[i] = scan.nextInt();
//		}
//		
//		System.out.println("Array even content are...");
//		for(int i=0; i<=a.length-1; i++) {
//			if(a[i]%2==0) {
//				System.out.print(a[i]+" ");
//			}
//			
//		}
		
		
		
//		/*QUE:-5*/
//		System.out.println("Enter length of the array: ");
//		int []a = new int[scan.nextInt()];
//		
//		System.out.println("Enter elements to store in array: ");
//		for(int i=0; i<=a.length-1; i++) {
//			a[i] = scan.nextInt();
//		}
//		
//		System.out.println("Array odd content are...");
//		for(int i=0; i<=a.length-1; i++) {
//			if(a[i]%2!=0) {                          //OR (a[i]%2==1){
//				System.out.print(a[i]+" ");
//			}
//			
//		}
//		
		
		
		/*QUE:-5*/
		System.out.println("Enter length of the array: ");
		int []a = new int[scan.nextInt()];
		
		System.out.println("Enter elements to store in array: ");
		for(int i=0; i<=a.length-1; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("Array odd content are...");
		for(int i=0; i<=a.length-1; i++) {
			if(i%3==0) {                          //OR (a[i]%2==1){
				System.out.print(a[i]+" ");
			}
			
		}
	}
}
