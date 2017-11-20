package recursosHumanos;

public class Pessoa {
	private String nome;
	private char sexo;
	private int idade;
		
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	Pessoa(String nome, int idade, char sexo){
		this.nome = nome;
		this.idade = idade;
		this.setSexo(sexo);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
