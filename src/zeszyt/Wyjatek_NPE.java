package zeszyt;
import java.util.ArrayList;

public class Wyjatek_NPE{

	public static void main(String[] args) {
		
	try{
		ArrayList<String> names = null;
		System.out.println("Size of list: "+ names.size());
	}
	catch (Exception e){
		System.out.println(e);
	}

	}
}
