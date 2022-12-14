package ex2_shape;

public class Square extends Rectangle {
	public Square(){
		super();
	}

	public Square(double side){
		super(side, side);
	}

	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}

	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public String toString() {
		super.toString();
		return "A Square with side = " + this.getSide() + ", which is a subclass of " + super.toString();
	}
}
