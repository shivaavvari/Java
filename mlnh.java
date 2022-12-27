package sample;

class student {
 int rollno;

public void setRoll(int r)
{
	this.rollno =r;
}
 
public void getRollno()
{
	System.out.println("The rollno is: "+rollno);
}
}

class test extends student{
	int m1,m2;
	void setmarks(int a,int b)
	{
		this.m1 =a;
		this.m2 =b;
	}
	void getmarks()
	{
		
		System.out.println("The marks are "+ m1 +" " +m2);
	}

}

interface sports
{
	float spwt= 6.0f;
	void putwt();
}
class Result extends test implements sports
{

	float total;
	@Override
	public void putwt() {
	
		System.out.println("sports weight "+spwt);
	}
	void display()
	{
		total = m1+m2+spwt;
		System.out.println("Total  is  "+total);
		getRollno();
		getmarks();		
		putwt();
	}
	
}




public class mlnh
{
public static void main(String[] args) {
	Result result = new Result();
	result.setRoll(100);
	result.setmarks(150, 150);
	result.display();
}	
}