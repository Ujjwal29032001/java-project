class InvalidAgeException extends InvalidAgeException
{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}
class Demo {
	public static void main(String[] args) {
            try
            {
            	vote(12);
            }
            catch(Exception e)
            {
            	System.out.println(e);
            }
	}
	public static void vote() throws  InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Not eligible foe voting");
		}
		else
		{
			System.out.println("Eligible for voting");
		}	
	}
}

