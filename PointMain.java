import java.util.Scanner;
class Point {
	Scanner sc = new Scanner(System.in);
	int x,y;
	Point() {
      x=10;
      y=50;
	}
	Point(int a) {
	 x=y=a;

	}
	Point(int a,int b) {
	  x=a;
	  y=b;
	}
	Point(Point o) {
	 x= o.x;
	 y= o.y;
	}
	void get_data() {
	System.out.println("Enter the value of x: ");
	x = sc.nextInt();
	System.out.println("Enter the value of y: ");
	y = sc.nextInt(); 
	}
	void display() {
	System.out.println("Coordinate of points(x,y): " +"("+x+","+y+")");
	} 
}
class PointMain{
	public static void main(String[] args) {
	 Point p1 = new Point();
	 p1.display();

	 Point p2 = new Point(20,10);
	 p2.display();

	 Point p4 = new Point();
	 p4.get_data();

	 Point p3 = new Point(p2);
      p3.display();
      p4.display();

	}
}