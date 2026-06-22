
public class ContaPoupanca extends Contas {
	
	private double taxa = 0.3;

	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}	

}
