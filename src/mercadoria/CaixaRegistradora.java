package mercadoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import recursosHumanos.Funcionario;

public class CaixaRegistradora {
    
    public static final int CREDITO = 1;
    public static final int DINHEIRO = 2;

    private final List<ItemDaVenda> venda;
    private final Estoque estoque;
    private final Funcionario funcionario;
    private final int numeroCaixa;

    public CaixaRegistradora(Estoque estoque, Funcionario funcionario, int numeroCaixa) {
        venda = new ArrayList<>();
        this.estoque = estoque;
        this.funcionario = funcionario;
        this.numeroCaixa = numeroCaixa;
    }  

    public void addItemDaCompra(Produto produto, double quantidade) {
        venda.add(new ItemDaVenda(produto, quantidade));
    }

    private double getSubTotal() {
        double subTotal = 0;
        for (ItemDaVenda itemDaVenda : venda) {
            subTotal += itemDaVenda.getProduto().getPreco() * itemDaVenda.getQuantidade();
        }
        return subTotal;
    }
    
    public void imprimeVendaTotal(){
        System.out.println("***************VENDA***************");
        System.out.println("Caixa: "+numeroCaixa);
        System.out.println("Funcionário: "+funcionario.getNome());
        System.out.println("Total da Venda: "+this.getSubTotal());
        System.out.println("***********************************");
    } 
    
    public void getPagamento(){
        Scanner sc = new Scanner(System.in);
        int formaPagamento;
        double pagamento;
        double troco;
        
        do{
        System.out.println("Como deseja pagar? ");
        System.out.println("Digite 1- Para Credito e 2- Para Dinheiro:");
        formaPagamento = sc.nextInt();
        sc.nextLine();
        }while((formaPagamento!=CREDITO)&&(formaPagamento!=DINHEIRO));
        if(formaPagamento==CREDITO){
            System.out.println("Pagamento Efetuado!");
        }else{
            System.out.println("Digite o valor pago:");
            pagamento = sc.nextFloat();
            troco = pagamento - this.getSubTotal();
            System.out.printf("O Pagamento efetuado foi de R$ %.2f e seu troco foi de R$ %.2f",pagamento,troco);
            System.out.println();
        }
        //this.baixaEstoque();
         
    }
    
    private void baixaEstoque(){
        for (ItemDaVenda itemDaVenda : venda) {
            estoque.remove(itemDaVenda.getProduto().getNome(), itemDaVenda.getQuantidade());
        }
    }
    
}
