package Interface;

import java.util.List;

import Dominio.VideoJuegos;

public interface Metodos {
	
	public void alta(VideoJuegos juegos);
	public List<VideoJuegos> mostar();
	public VideoJuegos buscar (int indice);
	public void editar(int indice, VideoJuegos juegos);
	public void eliminar(int indice);

}
