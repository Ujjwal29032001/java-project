class Handling {
	public static void main(String[] args) {
		 try
		 {
		 	System.out.println("Learn Coding");
		 	int a=20; int b=2; int c;
		 	c=a/b;
		 	System.out.println(c);
		 	System.out.println("like share");
		 }
		 catch(ArithmeticException a)
		 {
		 	System.out.println("can't devide by zero");
		 }
		 finally
		 {
		 	System.out.println("subscribe");
		 }
		 System.out.println("main method ended");
	}
}