package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Pannello extends JPanel {

	LinkedList<BufferedImage> ll;
	
	public Pannello(LinkedList<BufferedImage> ll) {
		this.setBackground(Color.WHITE);
		this.ll=ll;	
	}

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(ll.getFirst(),0,0,this);
	}
	

}
