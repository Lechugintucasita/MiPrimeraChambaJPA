package com.ciberfarma.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ciberfarma.Model.Tipo;
import com.ciberfarma.Model.Usuario;



public class Demo07 {
		//listado de los tipos de usuarios y los usuarios qye pertenecen a el (o sus usuarios)
	public static void main(String[] args) {
		
		 EntityManagerFactory Conexion =
				 Persistence.createEntityManagerFactory("jpa_sesion2");
				 EntityManager manager = Conexion.createEntityManager();
				 
				 //Si quiero conseguir con un comando sql(sql="select* fromtb_tipos"  mayormente para llamar a un procedimiento almacenado 
				 List<Tipo>LstTipos= manager.createNativeQuery("select * from tb_tipos",Tipo.class).getResultList();
				
				 for (Tipo t : LstTipos) {
					System.out.println("Tipo de usuario :   " + t.getDescripcion());
					System.out.println("------------------------------");
					
					for (Usuario u : t.getLstUsuarios()) {
						System.out.println(" Nombre :   "+ u.getNom_usua() +"  "+ u.getApe_usua());
						System.out.println("Email :    "+ u.getCorreo());
						System.out.println("------------------------------");

					}
				}
				 //Si QUIEROHACERLO DE MEJHOR FORMA (jpql= "select u from tipos u")
				 List<Tipo>LstTipos2= manager.createQuery("select u from Tipo u").getResultList();
		
				 for (Tipo t : LstTipos) {
						System.out.println("Tipo de usuario :   " + t.getDescripcion());
						System.out.println("------------------------------");
						
						for (Usuario u : t.getLstUsuarios()) {
							System.out.println(" Nombre :   "+ u.getNom_usua() +"  "+ u.getApe_usua());
							System.out.println("Email :    "+ u.getCorreo());
							System.out.println("------------------------------");

						}
					}
				 
	}
}
