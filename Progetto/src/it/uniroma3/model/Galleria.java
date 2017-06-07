package it.uniroma3.model;

import java.util.HashMap;
import java.util.Map;

public class Galleria {
	private Map<String,Amministratore> amministratori;
	private Map<String,Opera> opere;
	private Map<String,Autore> autori;
	private PortaleGalleria portale;
	
	public Galleria(){
		this.opere = new HashMap<>();
		this.amministratori = new HashMap<>();
		this.autori = new HashMap<>();
	}
	
	public Amministratore getAmministratore(String user){
		return amministratori.get(user);
	}
}
