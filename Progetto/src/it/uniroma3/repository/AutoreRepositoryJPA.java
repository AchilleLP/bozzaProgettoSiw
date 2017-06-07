package it.uniroma3.repository;

import javax.persistence.EntityManager;

import it.uniroma3.model.Autore;

public class AutoreRepositoryJPA extends CrudRepositoryJPA<Autore>{

	public AutoreRepositoryJPA(EntityManager em, Class<Autore> entityClass) {
		super(em, entityClass);
	}

}
