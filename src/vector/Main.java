package vector;

public class Main {
	public static void main(String[] args) {
		Student a1 = new Student("Dylan");
		Student a2 = new Student("Vanguart");
		Student a3 = new Student("Catfish");
		
		Vector test = new Vector();
		
		test.add(a1);
		test.add(a2);
		
		System.out.println(test);
		System.out.println(test.length());
		System.out.println(test.contains(a3));
		System.out.println(test.take(1));
		test.add(a3, 1);
		System.out.println(test);
		test.remove(2);
		System.out.println(test);


		
		
		
		
	}

}
