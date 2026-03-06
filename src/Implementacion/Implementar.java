package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.VideoJuegos;
import Interface.Metodos;

public class Implementar implements Metodos{
	
	//Se declara las variables de los metodos
	List<VideoJuegos> listaVideoJuegos = new ArrayList<VideoJuegos>();
	boolean bandera = false;
	VideoJuegos juegoEncontrado; 

	public void alta(VideoJuegos juegos) {
		// TODO Auto-generated method stub
		
		for (VideoJuegos jue : listaVideoJuegos) {
			if (jue.getNombre().equals(juegos.getNombre())) {
				bandera = true;
				break;
			}
		}
		if (!bandera) {
			listaVideoJuegos.add(juegos);
		}
		
	}

	public List<VideoJuegos> mostrar() {
		// TODO Auto-generated method stub
		return listaVideoJuegos;
	}

	public VideoJuegos buscar(int indice) {
		// TODO Auto-generated method stub
		juegoEncontrado = listaVideoJuegos.get(indice);
		return juegoEncontrado;
	}

	public void editar(int indice, VideoJuegos juegos) {
		// TODO Auto-generated method stub
		listaVideoJuegos.set(indice, juegos);
	}

	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaVideoJuegos.remove(indice); 
	}

	public void agregar(VideoJuegos juegoEncontrado2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VideoJuegos> mostar() {
		// TODO Auto-generated method stub
		return null;
	}


}
