import java.util.Scanner;

public class Cadastrar {
	
	Scanner in = new Scanner(System.in);
	
	private String c1;
	private String c2;
	private double s1;
	private double s2;
	private String chave1;
	private String chave2;
	
	public void lerValores() {
		System.out.println("Qual o nome do primeiro cliente?");
		c1 = in.next();
		
		System.out.println("Qual o saldo primeiro cliente?");
		s1 = in.nextDouble();
		
		System.out.println("Qual o nome do segundo cliente?");
		c2 = in.next();
		
		System.out.println("Qual o saldo segundo cliente?");
		s2 = in.nextDouble();
		
		System.out.println("Qual a chave pix do primeiro cliente?");
		chave1 = in.next();
		
		System.out.println("Qual a chave pix do segundo cliente?");
		chave2 = in.next();
	}
	
	public void apresentar() {
		ContaCorrente cc1 = new ContaCorrente(s1);
		ContaCorrente cc2 = new ContaCorrente(s2);
		ContaPoupanca cp1 = new ContaPoupanca(s1);
        ContaPoupanca cp2 = new ContaPoupanca(s2);
        ContaDigital cd1 = new ContaDigital(s1, chave1);
        ContaDigital cd2 = new ContaDigital(s2, chave2);
        
        if (s1 > cc1.getLimite()) {
        	s1 = cc1.getLimite();
        }
        
        if (s2 > cc2.getLimite()) {
        	s2 = cc2.getLimite();
        }
        
        System.out.println("------------ Primeito Cliente ------------");
        System.out.println("Nome: "+ c1);
        System.out.println("Saldo: "+ s1);
        System.out.println("Conta Corrente: "+ cc1.getLimite());
        System.out.println("Conta Poupança: "+ s1 * cp1.getTaxa());
        System.out.println("Conta Digital: "+ cd1.getChave());
        System.out.println("------------ Segundo Cliente ------------");
        System.out.println("Nome: "+ c2);
        System.out.println("Saldo: "+ s2);
        System.out.println("Conta Corrente: "+ cc2.getLimite());
        System.out.println("Conta Poupança: "+ s2 * cp2.getTaxa());
        System.out.println("Conta Digital: "+ cd2.getChave());
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getChave1() {
		return chave1;
	}

	public void setChave1(String chave1) {
		this.chave1 = chave1;
	}

	public String getChave2() {
		return chave2;
	}

	public void setChave2(String chave2) {
		this.chave2 = chave2;
	}

}
