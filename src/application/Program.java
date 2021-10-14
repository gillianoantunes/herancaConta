package application;

import java.util.Locale;

import entities.Conta;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ContaPoupanca contap = new ContaPoupanca(001,"Gilliano",1000.0,500.0);
		// a contap do tipo  Conta poupança acessa todos atributos e metodos da superclasse conta
		//atraves do get
		System.out.println(" Conta: " + contap.getNum()+
				           "\n Titular: " + contap.getTitular() +
				           "\n Saldo: " + String.format("%.2f",contap.getSaldo()) +
				           "\n Limite: "	+ String.format("%.2f", contap.getLimite()));
		
		//sobreposição
		// tenho o objeto conta 1 do tipo Conta super classe
		// e contap1 do tipo ContaPoupança SubClasse
		Conta conta1 = new Conta(002,"Kauã",2000.00);
		ContaPoupanca contapoupanca1 = new ContaPoupanca(004,"Kaiky",2000.00,500.00);
		
		//vou chamar o método da superclasse saque e da subclasse saque
		// a difereça~é que o metodo saque da conta tem taxa de 5
		// o da subclasse nao tem taxa 5 esta sobreposto
		
		//as duas conta tem saldo de 2000 e vou sacar 500
		conta1.saque(500.00);
		contapoupanca1.saque(500.00);
		
		//resultados diferente pois no saque da Conta(superclasse) tem taxa de 5
		System.out.println(conta1.getSaldo());
		System.out.println(contapoupanca1.getSaldo());
		
		//palavra super eu reutilizo o metodo todo sem precisar escrever codigo
		//vou fazer com metodo deposito apenas reutilizando com super copio todo o metodo da superclasse e so depois altero
		//vou criar o metodo deposito com super na classe ContaPoupança
		//instancio e chamo o metodo
		
		ContaPoupanca contapoupanca3 = new ContaPoupanca(005,"Kethelin",1000.00,500.00);
		contapoupanca3.deposito(200.00);
		//tenho 1000 na conta, depositei 200 e ganhei 2 reais no metodo
		System.out.println(contapoupanca3.getSaldo());
		
		//polimorfismo 
		//ex: 2 objetos do mesmo tipo tendo comportamento diferentes
		//tipo chamar o saque da classe conta e o metodo saque da classe  ContaPoupança
		//resultados diferentes
		Conta contax = new Conta(002,"Kauã",2000.00);
		Conta contay = new ContaPoupanca(004,"Kaiky",2000.00,500.00);
		
		//as duas conta tem saldo de 2000 e vou sacar 500
		contax.saque(500.00);
		contay.saque(500.00);
		
		//resultados diferente pois no saque da Conta(superclasse) tem taxa de 5
		System.out.println(contax.getSaldo());
		System.out.println(contay.getSaldo());
		
		
	
	}

}
