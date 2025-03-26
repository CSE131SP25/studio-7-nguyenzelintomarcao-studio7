package studio7;


//TODO Auto-generated method stub

		/** 
		 * @param length - how long the rectangle is
		 * @param width - how wide the rectangle is
		 * @return area - how much space does it take up
		 * @return perimeter - how long is the sum of all the sides
		
		*/


public class Rectangle {

	private double length;
	private double width;
	
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public double area () {
		return length * width;
	}
	
	public double perimeter () {
		return (2*length) + (2*width);
	}
	
	 public boolean checker(Rectangle other) {
	        return this.area() > other.area();
	    }
	
	public  boolean checkSquare() {
		if (length == width) {
			return true;
			
		}else {
			return false;
		}
	}

	
	public static void main(String[] args) {
	
		 Rectangle r1 = new Rectangle (5, 5);
		 Rectangle r2 = new Rectangle (4, 4);
		 
		
	System.out.println(r1.area());
	System.out.println(r1.perimeter());
	System.out.println(r1.checker(r2));
	System.out.println(r1.checkSquare());
	
		
		
	}

}







