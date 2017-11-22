package mercadoria;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
	private Map<Integer, Produto> produtos = new HashMap<>();
	private Map<Integer, Float> quantidade = new HashMap<>();

	
	public Estoque() {
            super();
	}
	
	public Produto busca(String produto){
		Produto p = produtos.getOrDefault(Integer.parseInt(produto), null);
		if(p != null)
			return p;
		else
			return produtos.getOrDefault(produto.hashCode(), null);
	}
	
	
	public boolean adiciona(Produto produto, float quantidade){
            boolean foiAdicionado;
		if(quantidade < 1){
                    foiAdicionado = false;
                }else {
                    if(produtos.containsKey(produto.getCodigo())){
			float qtd = this.quantidade.get(produto.getCodigo()) + quantidade;
			this.quantidade.put(produto.getCodigo(), qtd);
                    }else{
			produtos.put(produto.getCodigo(), produto);
			this.quantidade.put(produto.getCodigo(), quantidade);
                    }
                    
                    foiAdicionado = true;
                    
		}
                
                return foiAdicionado;
	}
	
	public void remove(String produto, float quantidade){
		Produto p = busca(produto);
		if(p != null){
			float qtd = this.quantidade.get(p.getCodigo()) - quantidade;
			if(qtd < 1){
				produtos.remove(p.getCodigo());
				this.quantidade.remove(p.getCodigo());
			}
			this.quantidade.put(p.getCodigo(), qtd);
		}
	}

}
