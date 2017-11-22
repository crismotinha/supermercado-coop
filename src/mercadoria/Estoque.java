package mercadoria;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
	private final Map<Integer, Produto> produtos = new HashMap<>();
	private final Map<Integer, Double> quantidade = new HashMap<>();

	
	public Estoque() {
            super();
	}
	
	public Produto busca(String produto){
            
            Produto p = produtos.getOrDefault(produto.hashCode(), null);		
            return p;
		
	}
        
        public Produto busca(int codigo){
            Produto p = produtos.getOrDefault(codigo, null);		
            return p;
        }
	
	
	public boolean adiciona(Produto produto, double quantidade){
            boolean foiAdicionado;
		if(quantidade < 1){
                    foiAdicionado = false;
                }else {
                    if(produtos.containsKey(produto.getCodigo())){
			double qtd = this.quantidade.get(produto.getCodigo()) + quantidade;
			this.quantidade.put(produto.getCodigo(), qtd);
                    }else{
			produtos.put(produto.getCodigo(), produto);
			this.quantidade.put(produto.getCodigo(), quantidade);
                    }
                    
                    foiAdicionado = true;
                    
		}
                
                return foiAdicionado;
	}
	
	public void remove(String produto, double quantidade){
		Produto p = busca(produto);
		if(p != null){
			double qtd = this.quantidade.get(p.getCodigo()) - quantidade;
			if(qtd < 1){
				produtos.remove(p.getCodigo());
				this.quantidade.remove(p.getCodigo());
			}
			this.quantidade.put(p.getCodigo(), qtd);
		}
	}
        
        

}
