package entities;
//essa classe vai herdar da classe Conta
public class ContaPoupanca extends Conta {
	private Double limite;
	
	// o construtor vazio fica com o super()
	public ContaPoupanca() {
		super();
	}
	//construtores palavra super criar automatico e selecionar na combo select super
	 public ContaPoupanca(Integer num, String titular, Double saldo, Double limite) {
		super(num, titular, saldo);
		this.limite = limite;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
// metodo de emprestismo da classe ContaPoupanca
	
	public void emprestimo(double valor) {
		// verifica se o valor � menor que o limte
		if(valor <= limite) {
			//chama o metodo deposito da classe Conta - superclasse
			deposito(valor);
		}
	}
	
	//sobreposi��o - implementar o metodo saque da superclasse conta e alterar algo
	//colocar o @Override
	
	@Override
	public void saque(Double valor) {
		//altera�ao , aqui o saque n�o tem taxa de 5 reais
		saldo -= valor;
	}
	
	
	//a palavra final n�o deixa o m�todo ser sobreposto ou a classe ser herdada
	//sempre por final em metodos ja sobreposto tipo este abaixo
	//quando poe final a classe ou metodo sao analisados mais rapido
	//faz o preograma ficar com melhor performance mais r�pido
	//n�o � bom portando ter sobreposi��es m�ltiplas.
	@Override
	public final void deposito(Double valor) {
		
		//a palavra super reutiliza todo o codigo do metodo da superclasse
		//sem precisar escrever todo o metodo
		// e depois f�ao a altera�cao, depositar ja ganha mais 2 reais
		//vantagem do super - reutiliza��o de codigo
		super.deposito(200.00);
		//fa�o a altera��o aqui sem sobrepor mais 2 reais por deposito
		saldo += 2.00;
	}

	
}