package com.ciberfarma.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "tb_productos")
public class Productos {
	@Id
	private String id_prod ;
	private String des_prod ;
	private int stk_prod ;
	private double pre_prod ;
	private int idcategoria ;
	private int est_prod ;
	private int idproveedor ;
	
	
}
