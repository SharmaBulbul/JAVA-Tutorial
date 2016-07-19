package day3;

public class Practice {
	int wow;
	/**
	 * 
	 * @param args
	 */
	public void stairs(int n){
		String hash="#";
		for(int i=1;i<=n;i++){
			for(int k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(hash);
			}
			System.out.println();
		}
	}
		public static void main(String args[]){
			Practice p=new Practice();
			//List<String> as=new ArrayList<String>();
			String s1="Hello";
			String s2=new String("Hello");
			String s3="HELLO";
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			System.out.println(s2==s3);
			System.out.println(s2.equals(s3));
			System.out.println(s1==s3);
			System.out.println(s1.equals(s3));
			System.out.println(p.wow+"   ");
			System.out.println(43%10);
			System.out.println("Staircase is starting now...!!!!");
			p.stairs(10);
			
			
			ICalculation cal=new Parent();
			
		}
}
