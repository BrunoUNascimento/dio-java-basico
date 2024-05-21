package caixa_eletronico;

public class CaixaEletronico {
	public static void main(String[] args) {
		double saldo = 23;
		double saque = 21;
		if (saldo>saque) {
			saldo-=saque;
			System.out.println(saldo);
		}
	}
}
