class test {
	void div(int a,int b)  throws ArithmeticException
	{
	    if(b==0)
	    {
	      throw new ArithmeticException();
	    }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
	}
	public static void main(String[] args) {
	   Throw  t=new Throw();
	    t.div(20,0);
	}
}

