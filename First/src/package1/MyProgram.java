package package1;

import day3.ICalculation;

public class MyProgram {
	protected String name="hg";
	public String lastname;
	String family;
	
	
	public static void main(String[] args){
		//MyProgram mp=new MyProgram();
		//mp.lastname="Sharma";
		//mp.name="Bulbul";
		System.out.println("I am PSVM!!");
		Class2 c2=new Class2();
		c2.method1();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int c=0;
		for(int i=0;i<=10;i++){
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}
}
