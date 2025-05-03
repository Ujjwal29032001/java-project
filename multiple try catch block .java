class multiple {
	public static void main(String[] args) {
	   try
	   {
	   int a=10; int b=0; int c=0;
	   c=a/b;
	   System.out.println(c);
	   }
	   catch(ArithmeticExpression a)
	   {
	      System.out.println("can't divide by zero");
	   }
	   try
	   {
	      int a[] = {10,20,30,40};
	      System.out.println(a[5]);
	   }
	   catch(ArrayIndexOutOfBoundException b)
	   {
	       System.out.println("beyond the array list")
	   }
	}
}