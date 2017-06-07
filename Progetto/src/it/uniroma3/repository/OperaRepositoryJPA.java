package it.uniroma3.repository;

import javax.persistence.EntityManager;

public class OperaRepositoryJPA<Opera> extends CrudRepositoryJPA<Opera>{

	public OperaRepositoryJPA(EntityManager em, Class<Opera> entityClass) {
		super(em, entityClass);
	}

}
