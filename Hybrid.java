package java_proj;

 class Student {
  int rollNumber;
  void getNumber(int n)
  {
	  rollNumber =n;
  }
  void putNumber()
  {
	  System.out.println("Rollno :"+rollNumber);
  }
  
}

class Test extends Student
{
	
	float part1, part2;
	void getMarks(float m1, float m2)
	{
		part1 =m1;
		part2 =m2;
		
		
	}
	void putmarks()
	{
		System.out.println("marks obtained"+" \n");
		System.out.println("part1 is :" + part1);
		System.out.println("part2 is :" + part2);
		
	}
}

interface Sports
{
 float sportswt =6.0F;
 void putwt();
 
}

class Results 	extends Test implements Sports
{
     float total;
	@Override
	public void putwt() {
		// TODO Auto-generated method stub
		System.out.println("sports wt ="+sportswt);
		
	}
    void display()
    {
    	total= part1 +part2+sportswt;
    	
    	putNumber();
    	putmarks();
    	putwt();
    	System.out.println("Total score  = "+total);
    	
    }

}

class Hybrid
{
	public static void main(String[] args) {
		Results student1 = new Results();
		student1.getNumber(12323);
		student1.getMarks(27.5F,33.0F);
		student1.display();
	}

}

