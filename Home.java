import java.util.Scanner;
class Home {
	public static void main(String[] args) {
	 int arr[] [];
	 arr = new int[2] [3];
	 System.out.println("Enter the value of arrays: ");
	 Scanner sc=new  Scanner(System.in);
	 for(i=0; i<arr.length; i++) {
	    for(j=0; j<arr.length; j++) {
	    arr[i] [j] = sc.nextInt();
	    }
	 }
	 System.out.println("The array: ");
	   for(i=0; i<arr.length; i++) {
	      for(j=0; j<arr.length; j++) {
	      System.out.println(" "+a[i] [j]);
	      }
	      System.out.println(" ");
	   }
	}
}