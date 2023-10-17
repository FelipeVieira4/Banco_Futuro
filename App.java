/**
 * Hello world!
 *
 */
import contas.cliente.Cliente;
import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaFactory;
import contas.contaBancarias.ContaInvestimento;
import contas.contaBancarias.ContaPoupanca;
import tipos.Investimento;

public class App 
{
    public static void main( String[] args )
    {
        


        System.out.println( "Hello World!" );
        Cliente c1 = new Cliente(0, "Felipe V.");

        

        //Criar conta bancaria
        ContaBancaria cb1 = new ContaFactory().criarContaBancaria();
        cb1.addCliente(c1);
        cb1.addCliente(new Cliente(1, "José"));
        cb1.setId(2);

        System.out.println(cb1.getId());


        //Criar investimentos
        Investimento investimento1 = new Investimento(0,1200);
        Investimento investimento2 = new Investimento(1,600);
        
        System.out.println(cb1.getClass().getName());


        //Criar conta investimento
        ContaInvestimento ci1 = new ContaFactory().criarContaInvestimento();
        
        ci1.addInvestimento(investimento1);
        ci1.addInvestimento(investimento2);

        System.out.println(ci1.getClass().getName());


        ci1.addCliente(c1);
        ci1.addCliente(new Cliente(1, "José"));

        System.out.println(ci1.calcularLucroMensal());
        
        //Criar conta poupança
        ContaPoupanca cp1 = new ContaFactory().criarContaPoupanca();
        cp1.setTaxaJuros((float)2.5);
        System.out.println(cp1.calcularRendimento());
    }
}
