package modelo;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

import utiles.Constantes;
import vista.Casilla;

public class Cola{
	private LinkedList <Colores> cola;
	private MemorizadorCola memoriaCola;

	public Cola() {
		super();
		this.cola = new LinkedList<>();
		this.memoriaCola = new MemorizadorCola();
	}

	public void encolar(Colores color) {
		this.cola.push(color);
		this.memoriaCola.encolar(color);
		if (this.memoriaCola.getTamanioMemoriaCola() >= Constantes.TAMANO_HISTORICO) {
			this.memoriaCola.eliminarSextoDeMemoriaCola();
		}
	}
	
	public  MemorizadorCola getHistorico() {
		return this.memoriaCola;
	}
	
	public LinkedList<Colores> getCola() {
		return cola;
	}

	public Colores desencolar() {
		return this.cola.removeLast();
	}

//	private boolean compararHistorial(Cola cola, Colores color) {
//		for (int i = cola.getCola().size()-Constantes.TAMANO_HISTORICO; i < cola.getCola().size(); i++) {
//			if (color==cola.getCola().get(i)) {
//				return true;
//			}
//		}
//		return false;
//	} 	
}