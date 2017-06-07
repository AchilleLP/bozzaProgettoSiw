package it.uniroma3.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.model.Autore;
import it.uniroma3.repository.CrudRepositoryJPA;

public class AutoreService {
	EntityManager em;
	public AutoreService(){}
	public Autore inserisciAutore(Autore a){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria");
		em = emf.createEntityManager();
		CrudRepositoryJPA<Autore> c=new CrudRepositoryJPA<>(em,Autore.class);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		a = c.save(a);
		tx.commit();
		em.close();
		emf.close();
		return a;
	}
	public void cancellaAutore(Autore a){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria");
		em = emf.createEntityManager();
		CrudRepositoryJPA<Autore> c=new CrudRepositoryJPA<>(em,Autore.class);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		c.delete(a);
		tx.commit();
		em.close();
		emf.close();
	}
	public void getAutore(Long id){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria");
		em = emf.createEntityManager();
		CrudRepositoryJPA<Autore> c=new CrudRepositoryJPA<>(em,Autore.class);
		c.findOne(id);
	}
	public List<Autore> getAutori(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria");
		em = emf.createEntityManager();
		CrudRepositoryJPA<Autore> c=new CrudRepositoryJPA<>(em,Autore.class);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<Autore> lista = c.findAll();
		tx.commit();
		em.close();
		emf.close();
		return lista;
	}
	public void cancellaAutori(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("galleria");
		em = emf.createEntityManager();
		CrudRepositoryJPA<Autore> c=new CrudRepositoryJPA<>(em,Autore.class);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		c.deleteAll();
		tx.commit();
		em.close();
		emf.close();		
	}
}
