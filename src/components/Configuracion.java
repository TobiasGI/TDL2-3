package components;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Configuracion extends JFrame {

	private JLabel lblUsuario;
	private JLabel lblContraseña;
	private TextField tfUsuario;
	private JPasswordField pf;
	public JButton btnGuardar;
	public Configuracion() throws HeadlessException {
		super();
		this.setLayout(new FlowLayout());
		lblUsuario = new JLabel("        Usuario");
		this.add(lblUsuario);
		tfUsuario = new TextField("", 20);
		this.add(tfUsuario);
		lblContraseña = new JLabel("Contraseña");
		this.add(lblContraseña);
		pf = new JPasswordField("", 14);
		pf.setEchoChar('●');
		this.add(pf);
		btnGuardar = new JButton("Guardar");
		this.add(btnGuardar);
		this.setSize(260,140);
	}

}