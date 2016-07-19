package day3;

class Parent implements ICalculation{
	public int c;
	public Parent(){
		c=100;
		System.out.println(c);
	}
	//variable
	int z;
	
	
	/**
	 * Method for addition.
	 * @param x
	 * @param y
	 */
	public void addition(int x, int y){
		z=x+y;
		System.out.println("The sum of the given numbers:"  +  z);
	}
	/**
	 * Method for subtraction.
	 * @param x
	 * @param y
	 */
	public void substraction(int x,int y){
			z=x-y;
				System.out.println("The difference between the given numbers:"+z);
	}

	public void sameMethod() {
		System.out.println("I am in method of class Parent...");		
	}
	
	@Override
	public void method1() {
		System.out.println("I am in method of interface in parent...");
		
	}
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}
