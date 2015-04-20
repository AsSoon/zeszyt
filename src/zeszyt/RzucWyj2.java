package zeszyt;

public class RzucWyj2 {

	static void isRealZero(Integer number) throws ArithmeticException{
		if(number==0){
			throw new ArithmeticException("Błąd - zero");
		}
	}
	
	public static void main(String[] args) {
		
		RzucWyj2 rw = new RzucWyj2();
		
		try{
			rw.isRealZero(0);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
