package contas.contaBancarias;

import java.util.ArrayList;

import tipos.Investimento;
import tipos.Transacao;

/**
  Métodos das Classes que extedem a ContaBancaria.
  Esses métodos são incializados com um Exception para que um conta não consiga utilizar métodos
  de outra conta.
**/

public abstract class OperacoesBancarias {
	
  private final String mensagem = "Classe sem supporte a esse método";


  //Métodos da ContaCorrente
  public ArrayList<Transacao> getlistaTransacoes(){throw new UnsupportedOperationException(mensagem);}
    
  //Métodos da ContaPoupança
  public float getTaxaJuros() {throw new UnsupportedOperationException(mensagem);}
  public void setTaxaJuros(float taxaJuros) {throw new UnsupportedOperationException(mensagem);}
  public float calcularRendimento() {throw new UnsupportedOperationException(mensagem);}

  //Métodos da ContaInvestimento
  public void addInvestimento(Investimento i){throw new UnsupportedOperationException(mensagem);}
  public void removeInvestimento(String id){throw new UnsupportedOperationException(mensagem);}
  public void calcularLucroMensal(){throw new UnsupportedOperationException(mensagem);}
}