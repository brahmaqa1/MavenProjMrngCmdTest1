package DebuggingBasics;

public class B 
{

	public void add()
	{
		System.out.println("in add method");
		System.out.println("stmt-1");
		
		System.out.println("stmt-2");
		System.out.println("stmt-3");

	}
	
	
	//  void -  null -  method does not return any value
	//  int  --  method return int val and we must use retuen stmt inside method
	public int add(int a , int b)
	{
		System.out.println("in add method - with 2 args");
		int res;
		res = a +b;
		System.out.println("res=" + res);
		
		return res;
	}
	
	
}
