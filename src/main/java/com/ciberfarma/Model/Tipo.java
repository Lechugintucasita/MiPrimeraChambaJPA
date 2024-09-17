package com.ciberfarma.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "tb_tipos")
public class Tipo {
	@Id
	private int idtipo;
	private String descripcion;
	 
	@OneToMany
	@JoinColumn(name = "idtipo",insertable = false,updatable = false)
	private List<Usuario> lstUsuarios;
}
