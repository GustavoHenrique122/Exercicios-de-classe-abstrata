
public class ContaCorrente extends Contas {
	
	private double limite = 5000;
	
	public ContaCorrente(double saldo) {
		super(saldo);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
