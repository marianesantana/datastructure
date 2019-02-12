package lists;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println(list);
		list.addBeginning("Gus");
		list.addBeginning("Mick");
		list.addBeginning("Jagger");
		System.out.println(list);
		list.add("Ändre");
		System.out.println(list);
		list.add(3, "Lucas");
		list.add(2, "Erick");

		System.out.println(list);
		
		Object x = list.takeElement(0);
		System.out.println(x);
		System.out.println(list.length());
		
		list.removeBeginning(1);
		System.out.println(list);
		System.out.println(list.length());

		


		
		
	}
}
