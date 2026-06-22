import java.util.Scanner;

public class Ler {

    Scanner in = new Scanner(System.in);
    
    private String formaDePagamento;

    public void lerValores() {
    	
    	System.out.println("Qual sua forma de pagamento?");
        System.out.println("Credito = c");
        System.out.println("Boleto = b");
        formaDePagamento = in.next();
        
        if (formaDePagamento.equals("c") || formaDePagamento.equals("C")) {
        	Pagamento pagamento = new CartaoCredito();

            System.out.println("Qual o preço do produto?");
            double preco = in.nextDouble();

            System.out.println("Qual o saldo?");
            double saldo = in.nextDouble();

            pagamento.processar(preco, saldo);
        } else if (formaDePagamento.equals("b") || formaDePagamento.equals("B")) {
        	Pagamento pagamento = new BoletoBancario();

            System.out.println("Qual o preço do produto?");
            double preco = in.nextDouble();

            System.out.println("Qual o saldo?");
            double saldo = in.nextDouble();

            pagamento.processar(preco, saldo);
        } else {
        	System.out.println("Forma de pagamento indisponivel.");
        }
    }

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
}