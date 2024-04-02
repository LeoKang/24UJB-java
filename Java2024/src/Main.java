import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Point1[] pt1 = new Point1[2];
      Point2[] pt2 = new Point2[2];
      Point3[] pt3 = new Point3[2];
      
      for (int i= 0; i < pt1.length; i++) {
         int x1 = sc.nextInt();
         int y1 = sc.nextInt();
         pt1[i] = new Point1(x1, y1);
      }   
         
         
      for (int i= 0; i < pt2.length; i++) {
         int x2 = sc.nextInt();
         int y2 = sc.nextInt();
         pt2[i] = new Point2(x2, y2);
      }   
         
      
      for (int i= 0; i < pt3.length; i++) {      
         int x3 = sc.nextInt();
         int y3 = sc.nextInt();
         pt3[i] = new Point3(x3, y3);
      }   
         sc.close();
         
         for (int i = 0; i < pt1.length; i++) {
            pt1[i].print();
         
      }
         for (int i = 0; i < pt2.length; i++) {
            pt2[i].print();
         
      }
         for (int i = 0; i < pt3.length; i++) {
            pt3[i].print();
         
      }
         
      int sumLocation1 = 0, sumLocation = 0, sumLocation3 = 0;
      for (int = 0; i < pt; )
      
      System.out.println(pt1);
      System.out.println(pt2);
      System.out.println(pt3);
   }
}

class Point1 {
	private int x1;
	private int y1;

	public Point1(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}

	public void print() {
		System.out.println(x1 + " " + y1);
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

}

class Point2 {

	private int x2;
	private int y2;

	public Point2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	public void print() {
		System.out.println(x2 + " " + y2);
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}
}

class Point3 {

	private int x3;
	private int y3;

	public Point3(int x3, int y3) {
		this.x3 = x3;
		this.y3 = y3;
	}

	public void print() {
		System.out.println(x3 + " " + y3);
	}

	public int getX3() {
		return x3;
	}

	public int getY3() {
		return y3;
	}
}