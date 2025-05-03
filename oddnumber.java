import java.util.Scanner;
class oddnumber {
	public static void main(String []args) {
	 int n;
	 System.out.print("Enter no of term");
	 Scanner r=new Scanner(System.in);
	 n=r.nextInt();
	 for(int i=1; i<=n; i=i+2)
      {
         System.out.print(i + " ");
      }

	}
}