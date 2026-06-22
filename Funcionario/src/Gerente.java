
public class Gerente extends Funcionario{
	
	private String tarefaExtra;

	public Gerente(String nome, double salario, String tarefaExtra) {
		super(nome, salario + 3000);
		
		this.tarefaExtra = tarefaExtra;
	}

	public String getTarefaExtra() {
		return tarefaExtra;
	}

	public void setTarefaExtra(String tarefaExtra) {
		this.tarefaExtra = tarefaExtra;
	}

}
