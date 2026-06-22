public abstract class Pagamento {

    private double preco;
    private double saldo;

    public abstract void processar(double preco, double saldo);

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}