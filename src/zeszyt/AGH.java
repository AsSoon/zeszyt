package zeszyt;

public class AGH {

	public final static int ESTABLISHED=1919;
	public String name;
	public static String rector="Tadeusz S³omka";
	
	public void showName(){
		System.out.println(name);
	}
	
	public static void showRector(){
		System.out.println(rector);
	}
	
	public static void showEstablished(){
		System.out.println(ESTABLISHED);
	}
	
	public static void main(String[] args) {

		AGH.showRector();
		
		AGH.rector="Jan Nowak";
		AGH.showRector();
		
		AGH agh = new AGH();
		agh.rector="Adam Kowalski";
		agh.showRector();
		AGH.showRector();
		
		AGH.rector="Ryszard Tadeusiewicz";
		agh.showRector();
		
		AGH.showEstablished();
		//agh.ESTABLISHED=1920;
		AGH.showEstablished();
		
	}
	
}