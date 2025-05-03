class Base{
	public static void main(String args[]);
	int x;
	public int getx() {
	return x;
	}
    public void setx(int x) {
    System.out.println("I an setting x now");
     this.x = x;
    }
    public void printme(){
       System.out.println("I an a constructor");
    }
}

class derived extends Base{
	int y;
	public int getY() {
	   return y;
	}
    public void setY(int y) {
      this.y = y;
    }
}

public class cwh_45_inheritance {
	public static void main(String[]args) {
	     Base b = new Base();
	     
	}
}