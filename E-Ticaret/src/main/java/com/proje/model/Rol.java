package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Rol")
public class Rol {
	@Id
	@Column(name="rol_Id",unique=true,length=10,nullable=false)
	private Long rol_Id;
	@Column(name="isim",length=20,updatable=true,nullable=false)
    private String isim;

	
	public Rol() {
		
	}
	
	


	public Rol(Long rol_Id, String isim) {
		this.rol_Id = rol_Id;
		this.isim = isim;
	}




	public Long getRol_Id() {
		return rol_Id;
	}


	public void setRol_Id(Long rol_Id) {
		this.rol_Id = rol_Id;
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	@Override
	public String toString() {
		return "Rol [rol_Id=" + rol_Id + ", isim=" + isim + "]";
	}
	
	
}
