package figuras;

public class Recta {
	
	public Punto puntoInicial,puntoFinal;
	
	public Recta(double xinicial,double yinicial,double xfinal,double yfinal) {
		
		puntoInicial= new Punto(xinicial,yinicial);
		puntoFinal= new Punto(xfinal,yfinal);

	}
	
	public double dameLongitud() {
		
		double distancia_puntos;
	
		distancia_puntos = Math.pow(puntoInicial.x - puntoFinal.x, 2);
		distancia_puntos = distancia_puntos + Math.pow(puntoInicial.y - puntoFinal.y, 2);
		distancia_puntos = Math.sqrt(distancia_puntos);
		
		return distancia_puntos;
	}

}