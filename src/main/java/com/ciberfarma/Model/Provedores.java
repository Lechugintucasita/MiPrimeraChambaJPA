package com.ciberfarma.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name = "tb_proveedor")
public class Provedores {
	@Id
	private int idproveedor ;
	private String nombre_rs ;
	private String telefono ;
	private String email ;
	
}
