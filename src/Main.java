
public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Mariane");
		Aluno a2 = new Aluno("Vanguart");
		Aluno a3 = new Aluno("Catfish");
		
		Vetor test = new Vetor();
		
		test.adiciona(a1);
		test.adiciona(a2);
		
		System.out.println(test);
		System.out.println(test.tamanho());
		System.out.println(test.contem(a3));
		System.out.println(test.pega(1));
		test.adiciona(a3, 1);
		System.out.println(test);
		test.remove(2);
		System.out.println(test);


		
		
		
		
	}

}
