class E{
	int i;
	void showI();
      {	
	     System.out.println("i = "+i);
      }   

 }
class B extends E{
	int j,k;

	void showJK(){
	    System.out.println("j : "+j+ " "+ "K: "+ k);
	}
    void sum(){
         System.out.println("i+j+k= "+ (i+j+k));
    }
}

class Inher{
	public static void main(String args[]) {
	     E superOb = new E();
	     B subOb   = new B();

	     superOb.i = 10;
	     System.out.println("Value of Super Class:");
	     superOb.showI();

	     subOb.i = 25;
	     subOb.j = 63;
	     subOb.k = 10;
	     System.out.println("Value of SubClass:");
	     subOb.showJK();
	     subOb.showI();
	     subOb.sum();
	}
}



