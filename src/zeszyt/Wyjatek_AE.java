package zeszyt;

public class Wyjatek_AE {

	public static void main(String[] args) {
		
		try{
		Integer a=10;
		Integer b=0;
		Integer c;
		c=a/b;
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
