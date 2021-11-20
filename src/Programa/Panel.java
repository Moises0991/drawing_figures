package Programa;

import figuras.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



class Panel extends JPanel{
	
	boolean bandera=false;
	
	private static final long serialVersionUID = 1L;
	
	public static int cuadrados=0;
	public static int rectangulos=0;
	public static int rombos=0;
	public static int trapecios=0;
	
	int punto=0;
	int posicion=1000;
	
	
	Color colorFondo=new Color(83,213,141);
	Color colorPanel=new Color(61,235,152);
	Font fuente=new Font("Lemon",Font.BOLD,12);
	Font fuente2=new Font("Century",Font.BOLD,12);
	 Font fuente3=new Font("Century",Font.BOLD,13);
	
	JLabel tipo=new JLabel("TIPO:");
	JComboBox comboTipo=new JComboBox();
	JLabel A=new JLabel("A");
	JLabel B=new JLabel("B");
	JLabel C=new JLabel("C");
	JLabel D=new JLabel("D");
	JLabel E=new JLabel("E");
	JTextArea aviso=new JTextArea("ES NECESARIO QUE\nSE RELLENEN TODOS\nLOS CAMPOS!!!");
	JTextField campoA=new JTextField(5);
	JTextField campoB=new JTextField(5);
	JTextField campoC=new JTextField(5);
	JTextField campoD=new JTextField(5);
	JTextField campoE=new JTextField(5);
	JPanel panelOeste=new JPanel();
	
	JLabel area=new JLabel("Area");
	JLabel perimetro=new JLabel("Perimetro");
	JTextField campoArea=new JTextField(5);
	JTextField campoPerimetro=new JTextField(5);
	JCheckBox cuadricula=new JCheckBox("Cuadriculas",false);
	JPanel panelEste=new JPanel();
	
	
	JButton agregar=new JButton("Agregar");
	JButton dibujar=new JButton("Dibujar");
	JButton eliminar=new JButton("Eliminar");
	JPanel panelSur=new JPanel();
	
	JLabel cuadrilateros=new JLabel("Cuadrilateros:");
	JComboBox comboCuadrilateros=new JComboBox();
	JLabel coordenadas=new JLabel("");
	JPanel panelNorte=new JPanel();		
	
	panelCentral panelCentral=new panelCentral();
	

	public Panel() {
		
		setLayout(new BorderLayout(5,5));
		
		comboTipo.addItem("Ninguno");
		comboTipo.addItem("Cuadrado");
		comboTipo.addItem("Rectangulo");
		comboTipo.addItem("Rombo");
		comboTipo.addItem("Trapecio");
		comboCuadrilateros.addItem("Ninguno");
		
		
		campoA.setEnabled(false);
		campoB.setEnabled(false);
		campoC.setEnabled(false);
		campoD.setEnabled(false);
		campoE.setEnabled(false);
		campoArea.setEnabled(true);
		campoArea.setEditable(false);
		campoPerimetro.setEnabled(true);
		campoPerimetro.setEditable(false);
		
		
		D.setVisible(false);
		E.setVisible(false);
		campoD.setVisible(false);
		campoE.setVisible(false);
		aviso.setVisible(false);
		
		panelCentral.setPreferredSize(new Dimension (500,500));
		panelOeste.setPreferredSize(new Dimension(140,500));
		panelEste.setPreferredSize(new Dimension(145,500));
		panelNorte.setPreferredSize(new Dimension(500+140+145,55));
		
		
		panelCentral.setBackground(colorPanel);
		panelOeste.setBackground(colorFondo);
		panelEste.setBackground(colorFondo);
		panelNorte.setBackground(colorFondo);
		panelSur.setBackground(colorFondo);
		Logo logo=new Logo(colorFondo);
		aviso.setBackground(colorFondo);
		aviso.setForeground(new Color(170,0,0));
		cuadricula.setBackground(colorFondo);
		
		panelOeste.setLayout(null);
		panelEste.setLayout(null);
		panelNorte.setLayout(null);
		
		
		tipo.setBounds(0,5,50,25);
		A.setBounds(25, 35, 50, 50);
		B.setBounds(25, 60, 50, 50);
		C.setBounds(25, 85, 50, 50);
		D.setBounds(25, 110, 50, 50);
		E.setBounds(25, 135, 50, 50);
		comboTipo.setBounds(40,5,100,25);
		campoA.setBounds(40,50,100,20);
		campoB.setBounds(40,75,100,20);
		campoC.setBounds(40,100,100,20);
		campoD.setBounds(40,125,100,20);
		campoE.setBounds(40,150,100,20);
		
		tipo.setFont(fuente);
		A.setFont(fuente3);
		B.setFont(fuente3);
		C.setFont(fuente3);
		D.setFont(fuente3);
		E.setFont(fuente3);
		aviso.setFont(new Font("Century",Font.BOLD,11));
		
		panelOeste.add(tipo);
		panelOeste.add(comboTipo);
		panelOeste.add(A);
		panelOeste.add(campoA);
		panelOeste.add(B);
		panelOeste.add(campoB);
		panelOeste.add(C);
		panelOeste.add(campoC);
		panelOeste.add(D);
		panelOeste.add(campoD);
		panelOeste.add(E);
		panelOeste.add(campoE);
		
		
		
		area.setBounds(20, 10, 50, 50);
		perimetro.setBounds(0, 40, 60, 50);
		campoArea.setBounds(60,25,80,20);
		campoPerimetro.setBounds(60, 55, 80, 20);
		aviso.setBounds(10, 400, 130, 50);
		cuadricula.setBounds(10, 480, 100, 20);
		
		area.setFont(fuente2);
		perimetro.setFont(fuente2);
		
		panelEste.add(area);		
		panelEste.add(campoArea);
		panelEste.add(perimetro);
		panelEste.add(campoPerimetro);
		panelEste.add(aviso);
		panelEste.add(cuadricula);
		
		
		cuadrilateros.setFont(fuente);
		
		logo.setBounds(40, 5, 100, 70);
		cuadrilateros.setBounds(290, 7, 101, 50);
		comboCuadrilateros.setBounds(400, 20, 100, 25);
		coordenadas.setBounds(510, 7, 100, 50);
		
		panelNorte.add(logo);
		panelNorte.add(cuadrilateros);
		panelNorte.add(comboCuadrilateros);
		panelNorte.add(coordenadas);
		

		panelSur.add(agregar);
		panelSur.add(dibujar);
		panelSur.add(eliminar);
		
		
		panelCentral.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		
		add(panelOeste,BorderLayout.WEST);
		add(panelEste,BorderLayout.EAST);
		add(panelNorte,BorderLayout.NORTH);
		add(panelSur,BorderLayout.SOUTH);
		add(panelCentral,BorderLayout.CENTER);
		
		
		campoA.addKeyListener(new RestriccionesCampos(campoA));
		campoB.addKeyListener(new RestriccionesCampos(campoB));
		campoC.addKeyListener(new RestriccionesCampos(campoC));
		campoD.addKeyListener(new RestriccionesCampos(campoD));
		campoE.addKeyListener(new RestriccionesCampos(campoE));
		
		
		comboTipo.addActionListener(new Eleccion());
		agregar.addActionListener(new Agregar());	
		dibujar.addActionListener(new Dibujar());
		eliminar.addActionListener(new Remover());
		comboCuadrilateros.addActionListener(new Dibujar());
		cuadricula.addActionListener(new Cuadriculas());
	}
	
	private class RestriccionesCampos extends KeyAdapter{	
		
		JTextField eleccion;
		
		public RestriccionesCampos(JTextField eleccion) {
			
			this.eleccion=eleccion;
		}
		
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode()!=8&&!(e.getKeyChar()>='0' && e.getKeyChar()<='9'||e.getKeyChar()=='.'||e.getKeyChar()=='-'||e.getKeyCode()==37||e.getKeyCode()==39)) {	
				
				Toolkit.getDefaultToolkit().beep();	
			}
		}
		
		public void keyTyped(KeyEvent e) {
			
			String cadena="";
			int indices=0;
			punto=0;
			
			
			if(comboTipo.getSelectedItem()=="Cuadrado"&&e.getKeyChar()=='-'&&(eleccion==campoA)) {
				Toolkit.getDefaultToolkit().beep();	
				e.consume();	
			}else if((comboTipo.getSelectedItem()=="Rectangulo"||comboTipo.getSelectedItem()=="Rombo")&&e.getKeyChar()=='-'&&(eleccion==campoA||eleccion==campoB)) {
				Toolkit.getDefaultToolkit().beep();	
				e.consume();	
			}else if(comboTipo.getSelectedItem()=="Trapecio"&&e.getKeyChar()=='-'&&(eleccion==campoA||eleccion==campoB||eleccion==campoC)) {
				Toolkit.getDefaultToolkit().beep();	
				e.consume();	
			}
			
			
			if(eleccion==campoA) {
				cadena=campoA.getText();
			}else if(eleccion==campoB) {
				cadena=campoB.getText();
			}else if(eleccion==campoC) {
				cadena=campoC.getText();
			}else if(eleccion==campoD) {
				cadena=campoD.getText();
			}else if(eleccion==campoE) {
				cadena=campoE.getText();
			}
			
			if(!(e.getKeyChar()>='0' && e.getKeyChar()<='9'||e.getKeyChar()=='.'||e.getKeyChar()=='-')) {
				
				e.consume();
			}
			
			if(cadena.length()>0&&e.getKeyChar()=='-') {	//aceptar solo en el indice 1 el negativo
				
				Toolkit.getDefaultToolkit().beep();	
				e.consume();
			}
			
			if(cadena.contains("-")) {
				
				indices=6;
			}else {
				
				indices=5;
			}
			
			for(int i=0;i<cadena.length();i++) {
				
				if(cadena.charAt(i)=='.') {
					punto++;
					posicion=i;
				}
				
				if(punto==0) {
					
					posicion=1000;
				}
				
				if(cadena.length()==posicion+3) {
					
					Toolkit.getDefaultToolkit().beep();	
					e.consume();
				}	
			}
			
			if(cadena.length()>=indices&&punto==0&&!(e.getKeyChar()=='.')) {
				Toolkit.getDefaultToolkit().beep();	
				e.consume();
			}else if(punto==1&&e.getKeyChar()=='.') {
				Toolkit.getDefaultToolkit().beep();	
				e.consume();	
			}				
		}
	}

	private class Eleccion implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(comboTipo.getSelectedIndex()==0) {
				A.setBounds(25, 35, 50, 50);
				B.setBounds(25, 60, 50, 50);
				C.setBounds(25, 85, 50, 50);
				A.setText("A");
				B.setText("B");
				C.setText("C");
				B.setVisible(true);
				C.setVisible(true);
				campoB.setVisible(true);
				campoC.setVisible(true);
				
			}else if(comboTipo.getSelectedIndex()==1) {
				A.setBounds(5, 35, 50, 50);
				B.setBounds(20, 60, 50, 50);
				C.setBounds(20, 85, 50, 50);
				A.setText("Lado");
				B.setText("X1");
				C.setText("Y1");	
				D.setVisible(false);
				campoD.setVisible(false);
				E.setVisible(false);
				campoE.setVisible(false);
				
			}else if(comboTipo.getSelectedIndex()==2) {
				A.setBounds(5, 35, 50, 50);
				B.setBounds(0, 60, 50, 50);
				C.setBounds(20, 85, 50, 50);
				D.setBounds(20, 110, 50, 50);
				A.setText("Base");
				B.setText("Altura");
				C.setText("X1");
				D.setText("Y1");
				D.setVisible(true);
				campoD.setVisible(true);
				E.setVisible(false);
				campoE.setVisible(false);
				
				
			}else if(comboTipo.getSelectedIndex()==3) {
				A.setBounds(8, 35, 50, 50);
				B.setBounds(8, 60, 50, 50);
				C.setBounds(20, 85, 50, 50);
				D.setBounds(20, 110, 50, 50);
				A.setText("D.M");
				B.setText("D.m");
				C.setText("X1");
				D.setText("Y1");
				C.setVisible(true);
				campoC.setVisible(true);
				D.setVisible(true);
				campoD.setVisible(true);
				E.setVisible(false);
				campoE.setVisible(false);
				
				
			}else if(comboTipo.getSelectedIndex()==4) {
				A.setBounds(0, 35, 50, 50);
				B.setBounds(8, 60, 50, 50);
				C.setBounds(8, 85, 50, 50);
				D.setBounds(20, 110, 50, 50);
				E.setBounds(20, 135, 50, 50);
				A.setText("Altura");
				B.setText("B.M");
				C.setText("B.m");
				D.setText("X1");
				E.setText("Y1");
				D.setVisible(true);
				campoD.setVisible(true);
				E.setVisible(true);
				campoE.setVisible(true);
				
			}
			
			if(comboTipo.getSelectedIndex()==0) {
				
				campoA.setEnabled(false);
				campoB.setEnabled(false);
				campoC.setEnabled(false);
				campoD.setEnabled(false);
				campoE.setEnabled(false);
				D.setVisible(false);
				E.setVisible(false);
				campoD.setVisible(false);
				campoE.setVisible(false);
				estadoInicial();
				
			}else {
				
				campoA.setEnabled(true);
				campoB.setEnabled(true);
				campoC.setEnabled(true);
				campoD.setEnabled(true);
				campoE.setEnabled(true);
				estadoInicial();
			}
		}		
	}
	
	private class Agregar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(comboTipo.getSelectedItem()=="Cuadrado") {
				
				if(campoA.getText().length()==0||campoB.getText().length()==0||campoC.getText().length()==0) {
					aviso.setVisible(true);
				}else {
					cuadrados++;
					comboCuadrilateros.removeItem("Ninguno");
					
					Cuadrado cuadrado=new Cuadrado(Double.parseDouble(campoA.getText()), Double.parseDouble(campoB.getText()), Double.parseDouble(campoC.getText()));
					comboCuadrilateros.addItem(cuadrado);
					campoArea.setText(""+cuadrado.area());
					campoPerimetro.setText(""+Math.round(cuadrado.perimetro()));
					estadoInicial();
				}
				
			}
			
			if(comboTipo.getSelectedItem()=="Rectangulo") {
				
				if(campoA.getText().length()==0||campoB.getText().length()==0||campoC.getText().length()==0||campoD.getText().length()==0) {
					aviso.setVisible(true);
				}else {
					rectangulos++;
					comboCuadrilateros.removeItem("Ninguno");
					Rectangulo rectangulo=new Rectangulo(Double.parseDouble(campoA.getText()), Double.parseDouble(campoB.getText()), Double.parseDouble(campoC.getText()),Double.parseDouble(campoD.getText()));
					comboCuadrilateros.addItem(rectangulo);
					campoArea.setText(""+rectangulo.area());
					campoPerimetro.setText(""+Math.round(rectangulo.perimetro()));
					estadoInicial();
				}
			}
			
			if(comboTipo.getSelectedItem()=="Rombo") {
				
				if(campoA.getText().length()==0||campoB.getText().length()==0||campoC.getText().length()==0||campoD.getText().length()==0) {
					aviso.setVisible(true);
				}else {
					rombos++;
					comboCuadrilateros.removeItem("Ninguno");
					Rombo rombo=new Rombo(Double.parseDouble(campoA.getText()), Double.parseDouble(campoB.getText()), Double.parseDouble(campoC.getText()), Double.parseDouble(campoD.getText()));
					comboCuadrilateros.addItem(rombo);
					campoArea.setText(""+rombo.area());
					campoPerimetro.setText(""+Math.round(rombo.perimetro()));
					estadoInicial();	
				}
				
			}

			if(comboTipo.getSelectedItem()=="Trapecio") {
	
				if(campoA.getText().length()==0||campoB.getText().length()==0||campoC.getText().length()==0||campoD.getText().length()==0||campoE.getText().length()==0) {
					aviso.setVisible(true);
				}else {
					trapecios++;
					comboCuadrilateros.removeItem("Ninguno");
					Trapecio trapecio=new Trapecio(Double.parseDouble(campoA.getText()), Double.parseDouble(campoB.getText()), Double.parseDouble(campoC.getText()), Double.parseDouble(campoD.getText()), Double.parseDouble(campoE.getText()));
					comboCuadrilateros.addItem(trapecio);
					campoArea.setText(""+trapecio.area());
					campoPerimetro.setText(""+Math.round(trapecio.perimetro()));
					estadoInicial();
				}
			}
		}
	}
	
	public void estadoInicial() {
		
		aviso.setVisible(false);
		campoA.setText("");
		campoB.setText("");
		campoC.setText("");
		campoD.setText("");
		campoE.setText("");
	}
	
	private class Dibujar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(comboCuadrilateros.getSelectedItem()=="Ninguno") {
			
			}else {
				
				if(e.getSource().equals(dibujar)) {
					
					bandera=true;
					repaint();
				}
			}
		}
	}
	
	private class Cuadriculas implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(cuadricula)) {
				
				repaint();
			}
		}
	}	
	
	private class panelCentral extends JPanel{
		
		public void paint(Graphics g) {
			
			super.paint(g);
			
			if(bandera) {
				
				Cuadrilateros figura;
				
				int x1=250,y1=250;
				int x2=250,y2=250;
				int x3=250,y3=250;
				int x4=250,y4=250;
				
				figura=(Cuadrilateros)comboCuadrilateros.getSelectedItem();
				
				campoArea.setText(""+figura.area());
				campoPerimetro.setText(""+Math.round(figura.perimetro()));
				
				
				Punto p1=figura.getp1();
				Punto p2=figura.getp2();
				Punto p3=figura.getp3();
				Punto p4=figura.getp4();
				
				coordenadas.setText("X= "+p1.x+" Y= "+p1.y);
				
				x1+=(int) p1.x;
				if(p1.y>0) {
					y1-=(int) p1.y;
				}else if(p1.y<0) {
					y1+=((int) p1.y)*(-1);
				}
				
				x2+=(int) p2.x;
				if(p2.y>0) {
					y2-=(int) p2.y;
				}else if(p2.y<0) {
					y2+=((int) p2.y)*(-1);
				}
				
				x3+=(int) p3.x;
				if(p3.y>0) {
					y3-=(int) p3.y;
				}else if(p3.y<0) {
					y3+=((int) p3.y)*(-1);
				}
				
				x4+=(int) p4.x;
				if(p4.y>0) {
					y4-=(int) p4.y;
				}else if(p4.y<0) {
					y4+=((int) p4.y)*(-1);
				}
				
				g.setColor(Color.RED);
				g.drawLine(10, 250, 490, 250);
				g.drawLine(250, 10, 250, 490);
				
				int y=10;
				for(int i=10;i<=490;i+=10) {
					
					g.drawLine(i, 247, i, 253);
					g.drawLine(247, y, 253, y);
					y+=10;
				}
				
				g.setColor(Color.RED);
				g.fillOval(x1, y1, 2, 2);
				
				g.setColor(Color.BLUE);
				g.drawLine(x1, y1, x2, y2);
				g.drawLine(x2, y2, x3, y3);
				g.drawLine(x3, y3, x4, y4);
				g.drawLine(x4, y4, x1, y1);

			}
			
			if(cuadricula.isSelected()) {
				
				g.setColor(new Color(250,0,0,25));
				int y=10;
				for(int x=10;x<=490;x+=10) {
					
					g.drawLine(x, 0, x, 500);
					g.drawLine(0, y, 500, y);
					y+=10;
				}
			}
		}
	}	
	
	public class Remover implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(comboCuadrilateros.getSelectedItem()=="Ninguno") {
				
			}else {
				comboCuadrilateros.removeItem(comboCuadrilateros.getSelectedItem());
			}
		}
	}
}