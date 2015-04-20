package zeszyt;

public class RzucanieWyjatkow {

	static void isZero(Integer number){
		if(number==0){
			throw new ArithmeticException("Błąd - zero");
		}
	}
	
	public static void main(String[] args) {
		
		try{
			isZero(0);
		}
		catch(Exception e){
			System.out.println("Błąd ogólny");
			System.out.println(e);
		}
	}
}
