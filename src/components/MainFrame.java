package components;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	private JPanel panel;
	
	private MainFrame() {
		 // Frame
		 super("Mundial Qatar 2022");
		 this.setSize(400,200);
		 
		 // Panel General NORTE-CENTRO
		 panel = new JPanel();
		 panel.setLayout(new BorderLayout());
		 
		 // subPanel NORTE
		 JPanel subPanel = new JPanel();
		 GridLayout grid= new GridLayout(2,4);
		 grid.setHgap(15);
		 subPanel.setLayout(grid);
		 subPanel.add(new JPanel());
		 subPanel.add(new JPanel());
		 subPanel.add(new JButton("Configuración"));
		 subPanel.add(new JButton("lala"));
		 subPanel.add(new JPanel());
		 subPanel.add(new JPanel());
		 subPanel.add(new JPanel());
		 subPanel.add(new JPanel());
		 panel.add(subPanel, BorderLayout.NORTH); 
		 
		 
		 // subPanel CENTRO
		 subPanel = new JPanel();
		 grid= new GridLayout(2,3);
		 grid.setHgap(20);
		 grid.setVgap(20);
		 subPanel.setLayout(grid);
		 subPanel.add(new JButton("FUTBOLISTA"));
		 subPanel.add(new JButton("PAIS"));
		 subPanel.add(new JButton("SIN DEFINIR"));
		 subPanel.add(new JButton("SIN DEFINIR"));
		 subPanel.add(new JButton("SIN DEFINIR"));
		 subPanel.add(new JButton("SIN DEFINIR"));
		 panel.add(subPanel, BorderLayout.CENTER);
		 
		 
		 this.add(panel);
		 this.setVisible(true);
	} 

	public static void main(String[] args) {
		MainFrame app = new MainFrame();
	}
}
