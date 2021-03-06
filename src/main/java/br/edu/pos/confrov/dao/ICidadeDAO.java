package br.edu.pos.confrov.dao;

import java.io.Serializable;
import java.util.List;

import br.edu.pos.confrov.entity.Cidade;
import br.edu.pos.confrov.persistence.Dba;

public interface ICidadeDAO extends Serializable {
	
	public Cidade criaCidade(Cidade cidade, Dba dba);

	public Cidade findByNome(String nome);
	
	public List<Cidade> findbyEstado (Long estado);
	
	public List<Cidade> findByAll();

	public Cidade editaCidade(Cidade cidade);

	public Cidade findById(Long id);
	
	public Cidade Remove(Cidade cidade, Dba dba);



}
