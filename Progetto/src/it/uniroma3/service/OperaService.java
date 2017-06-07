package it.uniroma3.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.model.Autore;
import it.uniroma3.model.Opera;
import it.uniroma3.repository.CrudRepositoryJPA;

public class OperaService {
	EntityManager em;
	public OperaService(){}
	public Opera inserisciOpera(Opera o){
		Opera persistentOpera = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria");
		em = emf.createEntityManager();
		CrudRepositoryJPA<Opera> c=new CrudRepositoryJPA<>(em,Opera.class);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		persistentOpera = c.save(o);
		tx.commit();
		em.close();
		emf.close();
		return persistentOpera;
	}
	public void cancellaOpere(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria");
		em = emf.createEntityManager();
		CrudRepositoryJPA<Opera> c=new CrudRepositoryJPA<>(em,Opera.class);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		c.deleteAll();
		tx.commit();
		em.close();
		emf.close();		
	}
	public List<Opera> getOpere(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria");
		em = emf.createEntityManager();
		CrudRepositoryJPA<Opera> c=new CrudRepositoryJPA<>(em,Opera.class);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<Opera> lista = c.findAll();
		tx.commit();
		em.close();
		emf.close();
		return lista;
	}
}
