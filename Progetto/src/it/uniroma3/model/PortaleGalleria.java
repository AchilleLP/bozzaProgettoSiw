package it.uniroma3.model;

public class PortaleGalleria {
	private Opera operaCorrente;
	private Amministratore amministratoreCorrente;
	private Autore autoreCorrente;
	private Galleria galleria;
	
	public PortaleGalleria(){}

	public Opera getOperaCorrente() {
		return operaCorrente;
	}

	public void setOperaCorrente(Opera operaCorrente) {
		this.operaCorrente = operaCorrente;
	}

	public Amministratore getAmministratoreCorrente() {
		return amministratoreCorrente;
	}

	public void setAmministratoreCorrente(Amministratore amministratoreCorrente) {
		this.amministratoreCorrente = amministratoreCorrente;
	}

	public Autore getAutoreCorrente() {
		return autoreCorrente;
	}

	public void setAutoreCorrente(Autore autoreCorrente) {
		this.autoreCorrente = autoreCorrente;
	}

	public Galleria getGalleria() {
		return galleria;
	}

	public void setGalleria(Galleria galleria) {
		this.galleria = galleria;
	}
	
	/*public void inserisciOpera(Opera o){
		
	}*/
	
	
}
