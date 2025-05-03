import java.util.Scanner;
class Run {
	public static void main(String[] args) {
	  int a[] [];

	  a = new int[3][];
	  a[0] = new int[]{5,7,6};
	  a[1] = new int[]{10,50,6,98,12,40};
	  a[2] = new int[]{2,54};

	  for(int i=0; i<a.length; i++) {
	     for(int j=0; j<a[i].length; j++) {
	         System.out.println(a[i][j]+ " ");
	     }
	     System.out.println(); 
	  }
	}
}