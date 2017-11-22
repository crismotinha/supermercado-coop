/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadoria;

/**
 *
 * @author luizlaljr
 */
class ItemDaVenda {
    private final Produto produto;
    private final double quantidade;

    public ItemDaVenda(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }
    
    
}
