package zeszyt;
import java.util.ArrayList;

public class AList {
	public static void main(String[] args) {

		ArrayList <String> names = new ArrayList <String> ();
		names.add("Lista");
		names.add("czegoś");
		names.add("tam");
		System.out.println("Size of list: " + names.size());
		System.out.println("No2 element to " + names.get(2));
		names.remove(2);
	}
}
