package acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Retroceso implements ActionListener {

	private JPanel panelSeleccionarColor;
	private JButton botonSeleccionarColor;
	private JPanel panelPedirColor;
	private JButton botonPedirColor;
	private JButton botonBorrarColor;
	private JPanel panelBorrarColor;
	private Actualizador actualizador;
	
	public Retroceso(JPanel panelSeleccionarColor, JButton botonSeleccionarColor, JPanel panelPedirColor, JButton botonPedirColor,JButton botonBorrarColor,
	JPanel panelBorrarColor, Actualizador actualizador) {
		super();
		this.panelSeleccionarColor = panelSeleccionarColor;
		this.botonSeleccionarColor = botonSeleccionarColor;
		this.actualizador = actualizador;
		this.panelPedirColor = panelPedirColor;
		this.botonPedirColor = botonPedirColor;
		this.panelBorrarColor = panelBorrarColor;
		this.botonBorrarColor = botonBorrarColor;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.panelSeleccionarColor.removeAll();
		this.panelPedirColor.removeAll();
		this.panelBorrarColor.removeAll();
		this.panelBorrarColor.add(botonBorrarColor);
		this.panelPedirColor.add(botonPedirColor);
		this.panelSeleccionarColor.add(botonSeleccionarColor);
		this.panelBorrarColor.add(botonBorrarColor);
		this.actualizador.actualizar();
	}

}
