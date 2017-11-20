package mercadoria;

public class Produto {
	private String nome;
	private float preco;
	private int codigo;	

	public Produto(String nome, float preco) {
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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
