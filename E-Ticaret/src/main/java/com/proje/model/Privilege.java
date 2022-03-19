package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Privilege")
public class Privilege {
	@Id
	@Column(name="privilege_Id",unique=true,length=10,nullable=false)
	private Long privilage_Id;
	
	@Column(name="modul",length=250)
    private String modul;
	
	@Column(columnDefinition="tinyint (1) default 1")
    private boolean y_Create;
	
	@Column(columnDefinition="tinyint (1) default 1")
    private boolean y_Read;
	
	@Column(columnDefinition="tinyint (1) default 1")
    private boolean y_Update;
	
	@Column(columnDefinition="tinyint (1) default 1")
    private boolean y_Delete;
	
	@ManyToOne
	@JoinColumn(name="rol_Id")
    private Rol rol;
	
	public Privilege() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Privilege(Long privilage_Id, String modul, boolean y_Create, boolean y_Read, boolean y_Update,
			boolean y_Delete, Rol rol) {
		this.privilage_Id = privilage_Id;
		this.modul = modul;
		this.y_Create = y_Create;
		this.y_Read = y_Read;
		this.y_Update = y_Update;
		this.y_Delete = y_Delete;
		this.rol = rol;
	}



	public Long getPrivilage_Id() {
		return privilage_Id;
	}

	public void setPrivilage_Id(Long privilage_Id) {
		this.privilage_Id = privilage_Id;
	}

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}

	public boolean isY_Create() {
		return y_Create;
	}

	public void setY_Create(boolean y_Create) {
		this.y_Create = y_Create;
	}

	public boolean isY_Read() {
		return y_Read;
	}

	public void setY_Read(boolean y_Read) {
		this.y_Read = y_Read;
	}

	public boolean isY_Update() {
		return y_Update;
	}

	public void setY_Update(boolean y_Update) {
		this.y_Update = y_Update;
	}

	public boolean isY_Delete() {
		return y_Delete;
	}

	public void setY_Delete(boolean y_Delete) {
		this.y_Delete = y_Delete;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Privilege [privilage_Id=" + privilage_Id + ", modul=" + modul + ", y_Create=" + y_Create + ", y_Read="
				+ y_Read + ", y_Update=" + y_Update + ", y_Delete=" + y_Delete + ", rol=" + rol + "]";
	}
	
	

}
