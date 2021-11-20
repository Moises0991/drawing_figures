package figuras;

public class Rombo extends Cuadrilateros {
	
	private double distancia_mayor, distancia_menor;
	
	public Rombo(double distancia_mayor,double distancia_menor,double x,double y ) {
		
		super(x,y);
		
		this.distancia_mayor=distancia_mayor;
		this.distancia_menor=distancia_menor;
		
		calcula_vertices();
	}
	
	public String toString() {
		
		return "Rombo";
	}
	
	public double area() {
		
		return (distancia_mayor*distancia_menor)/2;
	}
	
	public void calcula_vertices() {
		
		l1.puntoFinal.x = l1.puntoInicial.x + (distancia_menor/2);
		l1.puntoFinal.y = l1.puntoInicial.y + (distancia_mayor/2);
		
		l2.puntoInicial = l1.puntoFinal; 
		
		l2.puntoFinal.x = l1.puntoInicial.x ;
		l2.puntoFinal.y = l1.puntoInicial.y+distancia_mayor;
		
		l3.puntoInicial = l2.puntoFinal; 
		
		l3.puntoFinal.x = l2.puntoInicial.x-distancia_menor ;
		l3.puntoFinal.y = l3.puntoInicial.y - (distancia_mayor/2);
		
		l4.puntoInicial = l3.puntoFinal; 
		l4.puntoFinal =l1.puntoInicial;
		
		p1 = l1.puntoInicial;
		p2 = l2.puntoInicial;
		p3 = l3.puntoInicial;
		p4 = l4.puntoInicial;
		
	}	

}
