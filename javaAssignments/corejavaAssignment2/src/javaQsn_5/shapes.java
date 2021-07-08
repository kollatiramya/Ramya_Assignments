package javaQsn_5;

public class shapes {

	public static void main(String[] args) {
		Line1 line=new Line1();
		line.draw(13, 16);
		Rectangle1 rect = new Rectangle1();
		rect.draw(15, 20);
		Cube1 cube= new Cube1();
		cube.draw(13, 13);

	}

}
 abstract class shape {

	
	abstract void draw(int length, int breadth);

}
  class Cube1 extends shapes {

		
		void draw(int length, int breadth) {
		
			System.out.println("length of the cube  \t:"+length);
			System.out.println("breadth of the cube  \t:"+breadth);
			System.out.println("height of the cube  \t:"+length);
		}

	}
   class Rectangle1 extends shapes {

		void draw(int length, int breadth) {
		
			System.out.println("length of the rectange  \t:"+length);
			System.out.println("breadth of the rectangle  \t:"+breadth);
			
			
		}
   }
    class Line1 extends shapes {

		void draw (int length, int breadth) {
			
			System.out.println("start point \t:"+length);
			System.out.println("end point \t:"+breadth);
		}

	}