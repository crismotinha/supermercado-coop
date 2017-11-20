package recursosHumanos;

public class Funcionario extends Pessoa{
	private int matricula;
	private float salario;
	
	public Funcionario(String nome, int idade) {
		super(nome, idade);
		matricula=(nome + idade).hashCode();
	}
	
	public Funcionario(String nome, int idade, char sexo, float salario) {
		super(nome, idade, sexo);
		matricula=(nome + idade).hashCode();
		this.setSalario(salario);
	}

	public Funcionario(Funcionario f) {
		super(f.getNome(), f.getIdade(), f.getSexo());
		this.setSalario(f.getSalario());
		this.matricula = f.getMatricula();
	}

	public int getMatricula() {
		return matricula;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
