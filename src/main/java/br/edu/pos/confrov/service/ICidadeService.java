package br.edu.pos.confrov.service;

import java.io.Serializable;
import java.util.List;

import br.edu.pos.confrov.entity.Cidade;
import br.edu.pos.confrov.persistence.Dba;

public interface ICidadeService  extends Serializable{

	public Cidade criaCidade(Cidade cidade);

	public Cidade findByNome(String nome);

	public List<Cidade> findByAll();
		
	List<Cidade> findbyEstado(Long estado);

	public Cidade editaCidade(Cidade cidade);

	public Cidade Remove (Cidade cidade);
	
	public Cidade findById( Long id);

}
