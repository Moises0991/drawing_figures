package Programa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

class Logo extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private Image imagen;
	
	public Logo(Color colorFondo) {
				
		setPreferredSize(new Dimension (100,60));
		setBackground(colorFondo);
		
		
		try {
			
			imagen=ImageIO.read(new File("src/programa/logo.png"));
			
		}catch(IOException e) {
			
			JOptionPane.showMessageDialog(null, "No se ha podido encontrar la imagen");
			
		}
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		
		g2.drawImage(imagen, 0, 0, null);

	}
}
