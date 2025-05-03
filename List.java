import java.util.Scanner;
class List {
	int a[];
    List() {
    a = new int[5];
    }
    List(int x) {
    a = new int[x];
    } 
    List(List l) {
    a = new int[l.a.length];
       for(int i=0; i<a.length; i++) {
          a[i] = l.a[i];
       }
    }
    void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number for length of array");
         int i = sc.nextInt();
         a = new int[i];
    }
    void disp() {
    System.out.println("The length a is"+a.length);
      for(int i=0; i<a.length; i++) {
      System.out.println("the value of a on index: "+i+" is: "+a[i]);
      }
      System.out.println();
    }

}
class Ylist {
	public static void main(String[] args) {
	  List a1 =new List();
	  List a2 =new List();
	  List a3 =new List();
	  a1.disp();
	  a2.disp();
	  a3.read();
	  a3.disp();  
	}
}