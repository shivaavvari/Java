package java_proj;

interface Area
{

	final static float pi = 3.14F;
	float compute(float x, float y);
	
	
}

class Rectangle implements Area
{

	@Override
	public float compute(float x, float y) {
		// TODO Auto-generated method stub
		return (x*y);
	}
	
}

class circle implements Area
{

	@Override
	public float compute(float x, float y) {
		// TODO Auto-generated method stub
		return (pi *x*x) ;
		
	}
	
}



public class InterfaceTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		circle cir = new circle();
		Area area;
		area = rect;
		System.out.println(area.compute(1, 2));
		area = cir;
		System.out.println(area.compute(10, 2));
		
		
		
	}
}
