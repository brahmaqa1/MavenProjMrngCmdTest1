package TestCases;

import java.util.LinkedList;


abstract class school
{
	int i=0;
	//protected abstract int marks(int a, int b);
	public school()
	{
		display();
		i=2;
		
	}
	
	abstract void method();
	void display()
	{
		System.out.println(i);
	}
	
}

interface  Student

{
	abstract void method();
	
}

class teacher extends school implements Student
{
	
	public teacher()
	{
		super();
		i=1;
	}
	public void method()
	{
		new teacher();
	}
	
	
}


class marks extends teacher

{
	public marks()
	{
		i=5;
		method();
	}
	
}

public class test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		marks st =  new marks();
		 

	}

}
