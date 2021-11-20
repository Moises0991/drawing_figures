package Programa;

import java.awt.*;
import javax.swing.*;

public class Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco ventana=new Marco();
		ventana.pack();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Marco() {
		
		setTitle("Figuras");
		setBounds(250,80,500,300);
		
		Panel panel1=new Panel();
		panel1.setBackground(new Color(83,213,141));
		add(panel1);
		setResizable(false);
	}
	
	
}