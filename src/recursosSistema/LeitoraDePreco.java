/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursosSistema;

import mercadoria.Estoque;
import mercadoria.Produto;

/**
 *
 * @author luizlaljr
 */
public class LeitoraDePreco {
    
    private final Estoque estoque;

    public LeitoraDePreco(Estoque estoque) {
        this.estoque = estoque;
    }
    
    public void ler(int codigo){
        Produto p = estoque.busca(codigo);
        System.out.println(p);
    }
    
}
