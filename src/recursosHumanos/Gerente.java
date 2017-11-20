package recursosHumanos;

import mercadoria.Estoque;
import mercadoria.Produto;

public class Gerente extends Funcionario{

	public Gerente(Funcionario f) {
		super(f);
		// TODO Auto-generated constructor stub
	}
        
        public boolean adicionaProduto(Estoque estoque,Produto produto,int quantidade){
            return estoque.adiciona(produto,quantidade);
        }

}
