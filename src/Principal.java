
import recursosSistema.CaixaRegistradora;
import mercadoria.Estoque;
import mercadoria.Produto;
import recursosHumanos.Funcionario;
import recursosHumanos.Gerente;
import recursosSistema.LeitoraDePreco;


public class Principal {

	public static void main(String[] args) {
            Estoque estoque = new Estoque();
            Funcionario joao = new Funcionario("Joao",40);
            Gerente gerente = new Gerente(joao);
            Produto gelatina = new Produto("Gelatina",5.00);
            Produto arroz = new Produto("Arroz",10.00); 
            gerente.adicionaProduto(estoque, gelatina, 50);
            gerente.adicionaProduto(estoque, arroz, 100);
            CaixaRegistradora cx = new CaixaRegistradora(estoque, joao, 5);
            cx.addItemDaCompra(arroz, 20);
            cx.addItemDaCompra(gelatina, 10);
            cx.imprimeVendaTotal();
            cx.getPagamento();
            Produto p1 = estoque.busca("Arroz");
            System.out.println(p1);
            LeitoraDePreco lp = new LeitoraDePreco(estoque);
            lp.ler(gelatina.getCodigo());
            
	}

}
