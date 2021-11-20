package figuras;

public abstract class Cuadrilateros {
	
	protected Recta l1,l2,l3,l4;
	   protected Punto p1,p2,p3,p4;
	   
	   
	   public abstract double area();
	   public abstract void calcula_vertices();
	   
	   public Cuadrilateros(double x, double y) {

		   l1 = new Recta(x,y,0,0);
		   l2 = new Recta(0,0,0,0);
		   l3 = new Recta(0,0,0,0);
		   l4 = new Recta(0,0,0,0);
		   
		   p1 = l1.puntoInicial;
		   p2 = l2.puntoInicial;
		   p3 = l3.puntoInicial;
		   p4 = l4.puntoInicial;
	   }
	   
	   public void setp1(double x,double y) {
		   
		   p1.x=x;
		   p1.y=y;
		   
		   calcula_vertices();
	   }
	   
	   public Punto getp1() {
		   
		   return p1;  
	   }
	   
	   public Punto getp2() {
		   
		   return p2;  
	   }
	   
	   public Punto getp3() {
		   
		   return p3;  
	   }
	   
	   public Punto getp4() {
		   
		   return p4;  
	   }
	   
	   public double perimetro() {
		   
		  return (l1.dameLongitud()+l2.dameLongitud()+l3.dameLongitud()+l4.dameLongitud());
		    
	   }	   
}