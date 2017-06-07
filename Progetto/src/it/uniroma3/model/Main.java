package it.uniroma3.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.service.AutoreService;

public class Main {
	public static void main(String[]args){
		Autore a = new Autore();
		a.setNome("Andrea2");
		AutoreService as = new AutoreService();
		as.inserisciAutore(a);
		System.out.println(a.getId());
		
	}
}
