package mercadoria;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
	private Map<Integer, Produto> produtos = new HashMap<>();
	private Map<Integer, Integer> quantidade = new HashMap<>();

	
	public Estoque(Produto produto, int quantidade) {
		produtos.put(produto.getCodigo(), produto);
		this.quantidade.put(produto.getCodigo(), quantidade);
	}
	
	public Produto busca(String produto){
		Produto p = produtos.getOrDefault(Integer.parseInt(produto), null);
		if(p != null)
			return p;
		else
			return produtos.getOrDefault(produto.hashCode(), null);
	}
	
	
	public void adiciona(Produto produto, int quantidade){
		if(quantidade < 1)
			return;
		if(produtos.containsKey(produto.getCodigo())){
			int qtd = this.quantidade.get(produto.getCodigo()) + quantidade;
			this.quantidade.put(produto.getCodigo(), qtd);
		}else{
			produtos.put(produto.getCodigo(), produto);
			this.quantidade.put(produto.getCodigo(), quantidade);
		}
	}
	
	public void remove(String produto, int quantidade){
		Produto p = busca(produto);
		if(p != null){
			int qtd = this.quantidade.get(p.getCodigo()) - quantidade;
			if(qtd < 1){
				produtos.remove(p.getCodigo());
				this.quantidade.remove(p.getCodigo());
			}
			this.quantidade.put(p.getCodigo(), qtd);
		}
	}

}
