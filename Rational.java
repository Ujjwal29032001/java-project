import java.util.Scanner;
class Rational {
	int a,b;
	Rational() {
	 a=b=0;
	}
	Rational(int x, int y) {
	 a=x;
	 b=y;
	}
	Rational add(Rational r) {
	Rational temp = new Rational();
	temp.a =((a*r.b + b*r.a));
	temp.b = b*r.b;
	return temp;
	}
	Rational sub(Rational r) {
	Rational temp = new Rational();
	temp.a = ((a*r.b - b*r.a));
	temp.b =   b*r.b;
	  return temp;
	}
	Rational multi(Rational r) {
	Rational temp = new Rational();
	temp.a = a*r.a;
	temp.b = b*r.b;
	 return temp;
	}
	Rational div(Rational r) {
	Rational temp = new Rational();
	temp.a = a*r.a;
	temp.b = b*r.b;
       return temp;
	}
	void Eq(Rational r) {
     int temp = (a*r.b-r.a*b);
     if(temp==0) {
     System.out.println("Rational numbers are equal");
     }
     else {
     System.out.println("They are not equal");
     }

	} void show() {
	  System.out.println(a+"/"+b);
	}
}
class Rdemo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first rational number: ");
	int p = sc.nextInt();
	int q = sc.nextInt();
	Rational r1 = new Rational(p,q);
	System.out.println("Enter second rational number: ");
	int c = sc.nextInt();
	int d = sc.nextInt();
    Rational r2 = new Rational(c,d);
    System.out.print("Addition= ");
    Rational r3 = r1.add(r2);
    r3.show();
    System.out.print("Substraction= ");
    Rational r4 = r1.sub(r2);
    r4.show();
    System.out.print("Multiplication= ");
    Rational r5 = r1.multi(r2);
    r5.show();
    System.out.print("Division= ");
    Rational r6 = r1.div(r2);
    r6.show();
    r1.Eq(r2);
	};
}