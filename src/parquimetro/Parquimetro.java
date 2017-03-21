package parquimetro;

public class Parquimetro{
	// Permite inserir moedas no parquimetro (soma no saldo)
	// Valores poss�veis: 1, 5, 10, 25, 50 e 100 (1 real)
	// Gera InvalidValueException no caso de valor inv�lido
	private double saldo;
	public Parquimetro() {
		saldo = 0.0; 
		}
	public void insereMoeda(int valor) {
	switch (valor) {
	case 1:
	case 5:
	case 10:
	case 25:
	case 50:
	case 100:
	saldo += valor;
	break;
	default:
		}
	}
	// Retorna o saldo acumulado no parquimetro
	public double getSaldo(){
		return saldo;
	}
	// Emite um ticket de 2 reais se houver saldo dispon�vel.
	// Retorna true se a opera��o foi poss�vel
	public boolean emiteTicket(){
		if (saldo < 200){
			return (false);
		}else saldo -= 200;
		return (true);
	}
	// Devolve o saldo existente. Retorna o valor devolvido
	public double devolve(){
		double dev = saldo;
		saldo = 0;
		return (dev);
	}
}