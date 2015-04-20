package zeszyt;

public class Wyjatek_NFE_konwersja {

	public static void main(String[] args) {

		Integer liczba1 = null;
		Integer liczba2 = null;
		Integer liczba3 = null;
		Integer liczba4 = null;
		
		try{
		liczba1 = Integer.parseInt("2");
		liczba2 = Integer.parseInt("0");
		liczba3 = liczba1/liczba2;
		liczba4 = Integer.parseInt("Ala ma kota");
		}
		
		catch(NumberFormatException e){
			System.out.println("Błąd formatu przy parsowaniu");
		}
		
		catch(ArithmeticException e){
			System.out.println("Błąd arytmetyczny");
		}
		
		System.out.println(liczba1);
		System.out.println(liczba2);
		
		//NIE DZIAŁA:
		/*String napis1= "0.55";
		String napis2= "0.66.33";
		
		try{
			Double liczba1 = Double.parseDouble(napis1);
			Double liczba2 = Double.parseDouble(napis2);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		
		System.out.println(liczba1);
		System.out.println(liczba2);*/

	}
}
