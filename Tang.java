import java.util.Scanner;
class Tang {
	public static void main(String[] args) {
	int arr [] []; 
	arr = new int [2][3];
	System.out.println("Enter the array value: ");
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<arr.length; i++) {
	   for(int j=0; j<arr.length; j++) {
            arr[i][j] = sc.nextInt();
	   }
	}
	System.out.println("The Array");
	for(int i = 0; i<arr.length; i++ ) {
	  for (int j = 0; j<arr.length; j++) {
	    System.out.println(" "+ arr[i][j]);
	  }
	  System.out.println(" ");
	}
	}
}