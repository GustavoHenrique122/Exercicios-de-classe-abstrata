
public class Retangulo extends FigurasGeometricas{

	private double altura;

	public Retangulo(double base, double altura) {
		super(base);
		
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
