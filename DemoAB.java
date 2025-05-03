class A
{
	int i;
	void setI(int x)
	{ i=x;        }
	void disp();
	 {system.out.println("i: "+i); }  

	
}
class B extends A
{
	int j;
	void setJ(int x)
	{ j=x;        }
	void dispJ();
	 {System.out.println("j: "+j); }

	
}

class C extends A
{
	int k;
	void setK(int x)
	{ k=x;         }
	void dispK();
	 {System.out.println("k: "+k); }

	
}
class DemoAB {
	public static void main(String[] args) {
	 A a1 = new A();
	 B b1 = new B();
	 C c1 = new C();

	 c1.setK(4000);
	 c1.dispK();
	  c1.setI(40);
	  c1.dispI();
	  c1.setJ(400);
	  c1.dispJ();
	}
}