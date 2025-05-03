  import java.util.Scanner;
  class Matrix {
    int a [][];

    Matrix() {
       a = new int [2] [2];
    }
    Matrix(int m,int n) {
      a= new int[m] [n];
    }
    Matrix(Matrix l) {
      a= new int[l.a.length] [l.a[0].length];
       for(int i=0; i<a.length; i++) {
        for(int j=0; j<a[i].length; j++){
            a[i][j] = l.a[i][j];
        }
       }
    }
    void set_get2() {
    System.out.println("Enter the value of Matrix");
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<a.length; i++) {
        for(int j=0; j<a[i].length; j++) {
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("Values of Matrix");
    for(int i=0; i<a.length; i++ ) {
       for(int j=0; i<a[i].length; j++) {
           System.out.println(a[i][j]+" " );
       }
       System.out.println(" ");
    }
    } 
}
class List_Matrix{
	public static void main(String[] args) {
	   List l1 = new List();
	   l1.display();

	   List l2 = new List(5);
	   l2.display();

	   List l3 = new List(l2);
	   l3.set_get1();
	   Matrix m1 = new Matrix();

	   Matrix m2 = new Matrix(3,3);
	   m2.set_get2();

	   Matrix m3 = new Matrix(m2);
	   m3.set_get2();
	}
}
