package DebuggingBasics;

public class testBDebuggingBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  call add ()  defiend from class - B
		int a=10;
		int b= 20;
		int c = a +b;
		
		B bobj = new B();
		bobj.add();
		// insert break point :
//		How to insert break point?
		// Break point :  it is the point where program execution is broken  temporarily
		// where ever break pint is there, it breaks progr execution temporarily
		//  Run as Java  or Testng
		// Debug as Java appl or Debug as TestNG
		
		// 1. step into : line by line execution if it assignment stmt or method
		//2.  step over :  goes to method and executes all stmts inside that method - then it stops in next line
		
		// 3 .step return :  is enabled only when we are inside method
		//            can be used to come out of method
		
		int res= bobj.add(2, 3);
		System.out.println("res=" + res);
		
		//  View value of variable in run time 
		//  expression :    pass some expression a+b
				//   can change value of var in run time 
				//   call method also 
		
		// Can see the value of var from code also - move mouse over on var name -  displays val of var
		
		// HW Driver.findElemnt() .sendKeys();   run code from Expression tab ???
		
		

	}

}
