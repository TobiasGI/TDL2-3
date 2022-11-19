package tdl2.entrega3.components;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Estadisticas extends JDialog {
	private JButton btnImportar;
	private JTable tabla;
	private Object [][] titulos = {{"Pais","Part. ganados","Part. perdidos","Part. empatados","Cant. Torneos"}};
	private Object[] nombreCol = {"1","2","3","4","5"};
	private DefaultTableModel modelo;
	
	public Estadisticas() {
		super();
		this.setTitle("Estadisticas");
		this.setLayout(new BorderLayout());
		//this.add(new JPanel(), BorderLayout.NORTH);
		btnImportar = new JButton("Importar");
		this.add(this.getBtnImportar(), BorderLayout.SOUTH);
		modelo = new DefaultTableModel(titulos, nombreCol);
		tabla = new JTable(modelo);
		this.add(tabla,BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		this.setSize(400,200);
	}
	
	public JButton getBtnImportar() {
		return btnImportar;
	}
}
