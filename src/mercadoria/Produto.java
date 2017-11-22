package mercadoria;

public class Produto {
	private String nome;
	private double preco;
	private int codigo;	

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		codigo = nome.hashCode();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
