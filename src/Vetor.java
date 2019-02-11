import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
			
	}
	
	public boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;
	}
	public void adiciona(Aluno aluno, int posicao) {
		if(!posicaoValida(posicao))
			throw new IllegalArgumentException("posicao inválida"); 
		for(int i = totalDeAlunos -1; i>= posicao; i-=1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao<=totalDeAlunos;
	}
	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao inválida");
		}
		return alunos[posicao];
	}
	
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < totalDeAlunos; i++) {
			if(aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void remove(int posicao) {
		for(int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i+1];
					
		}
		totalDeAlunos--;
		
	}
	public int tamanho() {
		return totalDeAlunos;
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}

}
