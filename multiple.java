class multiple {
	public static void main(String[] args) {
		try 
		{
			int a=20; int b=0; int c=0;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException a)
		{
			System.out.println("can't devide by zero");
			

		}
		try
		{
			int a[] = {10,20,30,40};
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println(b);
		}

		
	}
}