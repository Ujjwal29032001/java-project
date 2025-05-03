class AB{
	int x, y;
	AB(){
      x=0;
      y=0;
	}
	AB(int a,int b) {
       x=a;
       y=b;
	}
	AB(AB t1) {
	 x = t1.x;
	 y = t1.y;  
	}
	void display() {
	System.out.println("x: "+x);
	System.out.println("y: "+y);
	}
}
class Constructor{
	public static void main(String[] args) {
	 AB a1 =new AB();
	 a1.display();

	 AB a2 = new AB(10,20);
	 a2.display();

	 AB a3 = new AB(a2);
        a3.display();
	}
}