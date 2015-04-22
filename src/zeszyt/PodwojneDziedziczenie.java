package zeszyt;

public class PodwojneDziedziczenie implements X,Y{
	public void myMethod(){
		System.out.println("Multiple inheritance ... using interfaces");
	}
	
	public static void main(String[] args){
		
		PodwojneDziedziczenie pd = new PodwojneDziedziczenie();
		pd.myMethod();
	}
}
