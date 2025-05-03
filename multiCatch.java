class multiCatch {
	public static void main(String[] args) {
		try
		{  
            int a=10; int b=2; int c;
            c=a/b;
            System.out.println(c);

            int arr[] = {10,20,30};
            System.out.println(arr[0]);

            String str = "null";
            System.out.println(str.toUpperCase());

		}
		catch(ArrayIndexOutOfBoundsException b)
		{
                System.out.println("Array Exception");
		}
		catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(NumberFormatException n)
        {
                System.out.println("Number exception");
        }
        catch(Exception e)
        {
           System.out.println("All type of exception handle");
        }
	}
}