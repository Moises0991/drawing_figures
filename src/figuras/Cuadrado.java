package figuras;

public class Cuadrado extends Cuadrilateros {
	
	private double longitud_lado;
	
	public Cuadrado(double longitud,double x,double y) {
		
		super(x,y);
		longitud_lado=longitud;
		calcula_vertices();
		
		
	}
	
	public String toString() {
		
		return "Cuadrado";
		
	}
	
	
	public double area() {
		
		return longitud_lado*longitud_lado;
		
	}
	
	public void calcula_vertices() {
		
		l1.puntoFinal.x = l1.puntoInicial.x + longitud_lado;
		l1.puntoFinal.y = l1.puntoInicial.y ;
		
		l2.puntoInicial = l1.puntoFinal; 
		
		l2.puntoFinal.x = l2.puntoInicial.x ;
		l2.puntoFinal.y = l2.puntoInicial.y+longitud_lado;
		
		l3.puntoInicial = l2.puntoFinal; 
		
		l3.puntoFinal.x = l1.puntoInicial.x ;
		l3.puntoFinal.y = l3.puntoInicial.y ;
		
		l4.puntoInicial = l3.puntoFinal; 
		l4.puntoFinal =l1.puntoInicial;
		
		p1 = l1.puntoInicial;
		p2 = l2.puntoInicial;
		p3 = l3.puntoInicial;
		p4 = l4.puntoInicial;
		
	}
	
	public void setlongitud(double longitud){
		
		longitud_lado=longitud;
		calcula_vertices();
		
	}
	
	public double obtenLongitud() {
		
		return longitud_lado;
	}
	
}