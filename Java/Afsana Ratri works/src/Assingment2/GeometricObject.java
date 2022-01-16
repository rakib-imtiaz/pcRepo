package Assingment2;

import java.util.Date;;

public class GeometricObject {

	private String color;
	private boolean filled;
	private Date dateCreated;

	public GeometricObject() {
		super();
	}

	public GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {

		Date date = new Date(System.currentTimeMillis());

		return date;

	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}

}
