class MyException {
	public static void main(String[] ujjwal) {
	       int x=5;
	       int y=0;
	       int []i=new int[4];
	       try
	       {
	        System.out.println("x/y: "+x/y);
	       }
	       catch(ArithmeticException e)
	       {
	         System.out.println("invalid denominator "+e);
	       }
	       try
	       {
	         System.out.println("i[6]"+i[6]); 
	       }
	       catch(ArrayIndexOutOfBoundsException a)
	       {
	         System.out.println("Out of Index "+a);
	       }
	       finally
	       {
	         System.out.println("In final block"); 
	       }
	}
}

