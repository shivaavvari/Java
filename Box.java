package sample;

import java.util.Objects;

public class Box {
double height;
double length;
double width;


@Override
public int hashCode() {
	return Objects.hash(height, length, width);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Box other = (Box) obj;
	return Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
			&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
			&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}

public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}

public Box()
{
	
}

public Box(double h,double l,double w)
{
  height =h;
  length =l;
  width = w;
}



private double volume() {
	return height *length * width;

}

private void printVolume() {
System.out.println("the volume is "+ volume());
	
}

public static void main(String[] args) {
	Box box= new Box(50,50,50);
    box.printVolume();	
    System.out.println(box.hashCode());
}
}