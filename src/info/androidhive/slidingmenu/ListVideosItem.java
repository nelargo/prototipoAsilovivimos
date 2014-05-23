package info.androidhive.slidingmenu;

public class ListVideosItem {
	private String Titulo;
	private String Estado;
	
	public ListVideosItem(String t, String e){
		super();
		this.setTitulo(t);
		this.setEstado(e);
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
}
