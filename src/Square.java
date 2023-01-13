/**
 * Name: Yue Liu
 * Assignment:5004 lab0 extension
 * Date:01/12/2023
 * Notes: I create a square class. In the class, I defined the constructor, 
 * calculate the perimeter and calculate the area methods.
 *
 */
public class Square {
	private int length;
	/**
	 * @param length: The length of the square
	 */
	public Square(int length) {
		this.length=length;
	}
	/**
	 * @return the perimeter of the square
	 */
	public int getPerimeter() {
		return length*4;
	}
	/**
	 * @return the area of the square
	 */
	public int getArea() {
		return length*length;
	}
	
	
	

}
