package view;

/**
 * Hello world!
 *
 */
import AbstractFactory.*;
import contas.cliente.Cliente;
import tipos.Investimento;
import tipos.Transacao;

public class App 
{
  public static void main( String[] args )
  {

    
    Cliente clienteTest = new Cliente(0, "José Teste");
    System.out.println(clienteTest.setCpf("123.456.789-09"));
    
    clienteTest.criarConta(new ContaCorrenteFactory());
    
    clienteTest.getContasBancarias().get(0).depositar(250.0f);
    clienteTest.getContasBancarias().get(0).sacar(100.0f);
    
    //Retorna exception
    try{
        clienteTest.getContasBancarias().get(0).setTaxaJuros(250.0f);
    }catch(UnsupportedOperationException e){
        System.out.println("Conta Bancaria sem");
    }

    for(Transacao i: clienteTest.getContasBancarias().get(0).getlistaTransacoes()) {
      System.out.println("Transação:"+i.getDataEspedicao().getTime()+" valor "+i.getValor());
    }

    clienteTest.criarConta(new ContaInvestimentoFactory());
    clienteTest.getContasBancarias().get(1).addInvestimento(new Investimento("inv_1_a", 250));
    clienteTest.getContasBancarias().get(1).addInvestimento(new Investimento("inv_2_g", 2500));

    clienteTest.getContasBancarias().get(1).calcularLucroMensal();
    clienteTest.getContasBancarias().get(1).depositar(250.0f);
    System.out.println("Saldo:"+clienteTest.getContasBancarias().get(1).getSaldo());
  }
}
