import java.util.Scanner;
class AshaComplex {
	int a,b;
	AshaComplex() {
	  a=10;
	  b=20;
	}
	AshaComplex(int x, int y) {
      a=x;
      b=y;
	}
	void setvalue(int x,int y) {
	 a=x;
	 b=y;
	}
	void displayComplex() {
	 System.out.println(a + "+"+ "i"+b);
	} 
} class Complex{
	public static void main(String[] args) {
	 AshaComplex c1 = new AshaComplex();
	 c1.displayComplex();

	 AshaComplex c2 = new AshaComplex();
	 c2.setvalue(25,50);
	 c2.displayComplex();
	}
}