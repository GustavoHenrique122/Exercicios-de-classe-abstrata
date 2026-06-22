public abstract class Contas {
    private double saldo;

    public Contas(double saldo) {
        this.saldo = saldo;
    }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
