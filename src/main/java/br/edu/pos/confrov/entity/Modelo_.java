package br.edu.pos.confrov.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-09-14T11:09:38.245-0400")
@StaticMetamodel(Modelo.class)
public class Modelo_ {
	public static volatile SingularAttribute<Modelo, Long> id;
	public static volatile SingularAttribute<Modelo, String> descricao;
	public static volatile SingularAttribute<Modelo, Marca> marca;
	public static volatile SingularAttribute<Modelo, Categoria> categoria;
}
