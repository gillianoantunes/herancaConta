package entities;

public class Conta {
	private Integer num;
	private String titular;
	//protected para a subclasse ContaPoupança poder usar
	protected Double saldo;
	
	public Conta() {
		
	}
	public Conta(Integer num, String titular, Double saldo) {
		this.num = num;
		this.titular = titular;
		this.saldo = saldo;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	// metodo deposito
	public void deposito(Double valor) {
		saldo += valor;
	}
	
	//metodo saque tira do saque e tita mais 5 reais de taxa
	public void saque(Double valor) {
		saldo -= valor+5;
	}
	
	
}
