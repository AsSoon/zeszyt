package zeszyt;

public class Main {

	public static void main(String[] args) {
		A a = new B();
		a.x();
		//a.y(); <-error
		//(B(a)).y(); <-error
		
		//Improwizacja wściekłego Andziorka:
		B whatever = new B();
		whatever.x();
		whatever.y();
	}
}
