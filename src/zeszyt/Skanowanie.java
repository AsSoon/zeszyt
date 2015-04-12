package zeszyt;
import java.util.Scanner;

public class Skanowanie {
	public static void main(String[] args) {

		String S;
		int i;
		Scanner scanIn = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		S = scanIn.nextLine();
		
		System.out.println("Enter int: ");
		i = scanIn.nextInt();
		
		scanIn.close();
		System.out.println(S+" "+i);

	}
}
