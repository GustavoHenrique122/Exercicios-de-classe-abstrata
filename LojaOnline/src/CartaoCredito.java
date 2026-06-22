
public class CartaoCredito extends Pagamento {

    public void processar(double preco, double saldo) {

        System.out.println("Pagamento efetuado no crédito");

        saldo -= preco;

        System.out.println("Saldo restante: R$ " + saldo);
    }
}