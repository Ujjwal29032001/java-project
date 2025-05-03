
class megha {
	public static void main(String[] args) {
		System.out.println("main method started");
		int a=10; int b=0; int c;
		try{
			c=a/b; //c=10/0
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("can't devide by zero");
		}
		System.out.println("main method ended");
	}
}