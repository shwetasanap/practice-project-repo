package org.studyeasy;

public class App {
	
	public static void main(String[] args) {
		
		int x = 2;
		int a[]=new int[2];
		try{
		
		    System.out.println("We don't know, what will be the outcome "+a[3]);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Runtime exception");
			
		}
		
		
		catch(RuntimeException e)
		{
			System.out.println("Runtime exception");
			
		}
		catch(Exception e){
			System.out.println("Exception!!!");
		}
		
		finally{
			System.out.println("This will be get printed");
			System.out.println();
		}
	
		
		
		
		
		
       /*int y=new A().x;
       // System.out.println(y);
        App obj = new App();
        obj.case2(10, 0);
	}
	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println(x / y);
		}else{
			System.out.println("The value of y is 0");
		}
	}
 
	public void case2(int x, int y) {
		try{
		  System.out.println(x / y);
		}catch(Exception e){
			e.printStackTrace();
		}
	}*/
	}
}
