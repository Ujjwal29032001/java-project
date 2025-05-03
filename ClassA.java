// Demonstrate when constructors are called.
// create a super class.
class A {
	A (){
	System.out.println("Inside A's constructor.");
	}
}
//Create a subclass by extending class A.
class B extends A {
	B () {
	System.ut.println("Inside B's constructor.");
	}
}
//Create another subclass by extending B.
class c extends B {
	C () {
	System.out.println("Inside C's constructor.");
	}
}
class CallingCons {
	public static void main(String args[]) {
	 C c = new C();
	}
}