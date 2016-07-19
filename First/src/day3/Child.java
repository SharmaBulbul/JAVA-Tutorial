package day3;


public class Child extends Parent implements ICalculation{

	public int c;
	public Child(){
		c=10;
		super.c=89;
		System.out.println(c);
	}
	
	public void addition(String x, String y){
		String z=x+y;
		System.out.println("The sum of the given numbers:"  +  z);
	}
	
	public void multiplication(int x, int y){
		int z=x*y;
		System.out.println("The product of the given numbers:"+z);
		}
	
	public void sameMethod() {
		System.out.println("I am in method of class Child...");		
	}
	
	@Override
	public void method1() {
		System.out.println("I am in method of interface in child...");
		
	}
	
	/**
	 * 
	 * @param args
	 */
		public static void main(String args[]){
			
			int a=20, b=10;
			
			Child demo = new Child();
			//contains all methods
			
			demo.addition(a, b);
			demo.substraction(a, b);
			demo.multiplication(a, b);
			demo.sameMethod();
			demo.method1();
			
			System.out.println();
			System.out.println();
			
			
			
			Parent demo2 = new Parent();
			//contains only parent's methods
			demo2.addition(a, b);
			demo2.substraction(a, b);
			demo2.sameMethod();
			demo2.method1();
			System.out.println();
			
			//Child cs=new Parent();
			
			Parent calc=new Child();
			//contains only parent's methods but object of child
			calc.addition(a, b);
			calc.substraction(a, b);
			calc.sameMethod();
			calc.method1();
			System.out.println();
			
			ICalculation c=new Child();
			
			
			
			//Child ch= new Parent();
			
						
		}
}
