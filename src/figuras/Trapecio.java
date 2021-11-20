package figuras;

public class Trapecio extends Cuadrilateros {
	
	
	private double base_mayor,base_menor,altura;
	
	public Trapecio(double altura,double base_mayor,double base_menor,double x,double y) {
		
		super(x,y);
		this.base_mayor=base_mayor;
		this.base_menor=base_menor;
		this.altura=altura;
		
		calcula_vertices();
		
	}
	
	public String toString() {
		
		return "Trapecio";
	}
	
	public double area() {
		
		return ((base_mayor+base_menor)/2)*altura;
	}
	
	public void calcula_vertices() {
		
		l1.puntoFinal.x = l1.puntoInicial.x + base_mayor;
		l1.puntoFinal.y = l1.puntoInicial.y ;
		
		l2.puntoInicial = l1.puntoFinal; 
		
		l2.puntoFinal.x = l1.puntoInicial.x +((base_mayor+base_menor)/2);
		l2.puntoFinal.y = l2.puntoInicial.y+altura;
		
		l3.puntoInicial = l2.puntoFinal; 
		
		l3.puntoFinal.x = l3.puntoInicial.x-base_menor;
		l3.puntoFinal.y = l3.puntoInicial.y;
		
		l4.puntoInicial = l3.puntoFinal; 
		l4.puntoFinal =l1.puntoInicial;
		
		p1 = l1.puntoInicial;
		p2 = l2.puntoInicial;
		p3 = l3.puntoInicial;
		p4 = l4.puntoInicial;

	}

}
