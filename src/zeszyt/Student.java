package zeszyt;

public class Student {
	
	private String name;
	private long cardNumber;
	private int yearOfStudy;
	public void doHomework(){
		System.out.println("Pracuje 8h");
	}
}

class StudentAGH extends Student{
	private String favouriteBand;
	private String favouriteWhiskey;
	private int numberOfCars;
	
	public void doEntertainment(){
		System.out.println("Bawi si� 7h");
	}
	
	public void doHomework(){
		System.out.println("Pracuje 1h");
	}
	
	class StudentIB extends StudentAGH implements Magician{
		public void doMagic(){
			System.out.println("Czaruje");
		}
	}
	
	// Dodane 20.04:
	
	public static void main(String[] args){
		Student s = new Student();
		s.doHomework();
		StudentAGH agh = new StudentAGH();
		agh.doEntertainment();
		agh.doHomework();
	}
}

/*public interface Magician{
	public doMagic();
}

class StudentIB extends StudentAGH implements Magician{
	public void doMagic(){
		System.out.println("Czaruje");
	}
}*/