package zeszyt;

public class Person {

	private String name;
	private int age;
	private float weight;
	
	public Person(){
		this.name="Doctor";
		this.age=907;
		this.weight=75;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public float getWeight(){
		return this.weight;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		String name = p.getName();
		System.out.println(name);
	}
}
