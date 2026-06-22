import java.util.Scanner;

public class Ler {

    Scanner in = new Scanner(System.in);

    private String tipo;

    public void lerValores() {

        System.out.println("Qual seu cargo?");
        System.out.println("gerente");
        System.out.println("assistente");
        tipo = in.next();
        
        System.out.println("Você quer listar os dados?");
        System.out.println("s = sim");
        System.out.println("n = não");
        String listardados = in.next();

        if (tipo.equals("gerente") || tipo.equals("Gerente")) {
        	
        	Gerente g = new Gerente(null, 0, null);

            System.out.println("Qual seu nome:");
            g.setNome(in.next());

            System.out.println("Qual seu salario:");
            g.setSalario(in.nextDouble());
            
            System.out.println("Qual a Tarefa extra:");
            g.setTarefaExtra(in.next());

            if (listardados.equals("s") || listardados.equals("S")) {
            	System.out.println("------------ Gerente ------------");
                System.out.println("Nome: "+ g.getNome());
                System.out.println("Saldo: "+ g.getSalario());
                System.out.println("Tarefa Extra: "+ g.getTarefaExtra());
            }

        } else if (tipo.equals("assistente") || tipo.equals("Assistente")) {

        	Assistente a = new Assistente(null, 0);

        	System.out.println("Qual seu nome:");
            a.setNome(in.next());

            System.out.println("Qual seu salario:");
            a.setSalario(in.nextDouble());
            
            if (listardados.equals("s") || listardados.equals("S")) {
            	System.out.println("------------ Assistente ------------");
            	System.out.println("Nome: "+ a.getNome());
                System.out.println("Saldo: "+ a.getSalario());
        } else {
            System.out.println("Tipo inválido");
        }
    }
}
    
    public void setTipo(String tipo) {
    	this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}