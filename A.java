class A {
	public static void main (String[] args)
	A (){
	System.out.println("Inside A's constructor.");
	}
}
//Create a subclass by extending class A.
class B extends A {
	B () {
	System.out.println("Inside B's constructor.");
	}
}