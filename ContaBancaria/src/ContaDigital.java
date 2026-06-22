
public class ContaDigital extends Contas {
	
	private String chave;
	
	public ContaDigital(double saldo, String chave) {
		super(saldo);
		this.chave = chave;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

}
