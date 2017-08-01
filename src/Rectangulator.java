public class Rectangulator {
	public stactic void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[0]);

		Rectangle myRectangle = new Rectangle(lenght, width);

		String output = String.format("*** Your Rectangle ***\n\nLenght: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\", myRectangle.leght, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());

		System.ot.println(output);
	}	

}
