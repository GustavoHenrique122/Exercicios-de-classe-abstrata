import java.util.Scanner;

public class Ler {
	
	Scanner in = new Scanner(System.in);
	
	private String figura;
	private double area;
	
	Quadrado q = new Quadrado(0);
	
	public void lerValores() {
		
		System.out.println("Qual a figura que você quer descobrir a area?");
		System.out.println("t = triangulo");
		System.out.println("q = quadrado");
		System.out.println("r = retangulo");
		figura = in.next();
		
		if (figura.equals("q") || figura.equals("Q")) {
			
			Quadrado q = new Quadrado(0);

			System.out.println("Qual a base?");
			q.setBase(in.nextDouble());

			area = q.getBase() * q.getBase();
			
		} else if (figura.equals("t") || figura.equals("T")) {
			
			Triangulo t = new Triangulo(0, 0);
			
			System.out.println("Qual a base");
			t.setBase(in.nextDouble());
			
			System.out.println("Qual a Altura");
			t.setAltura(in.nextDouble());
			
			area = (t.getBase() * t.getAltura())/2;
			
		} else if (figura.equals("R") || figura.equals("r")) {
			
			Retangulo r = new Retangulo(0, 0);
			
			System.out.println("Qual a base");
			r.setBase(in.nextDouble());
			
			System.out.println("Qual a Altura");
			r.setAltura(in.nextDouble());
			
			area = r.getBase() * r.getAltura();
		} else {
			System.out.println("Figura incompatível");
		}
	}
	
	public void apresentar() {
		System.out.println("A area é: " + area);
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
