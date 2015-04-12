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
		System.out.println("Bawi siê 7h");
	}
	
	public void doHomework(){
		System.out.println("Pracuje 1h");
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