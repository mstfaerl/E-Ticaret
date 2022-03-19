package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Adres")
public class Adres {

	@Id
	@Column(name="adres_Id",unique=true,length=10,nullable=false)
	private Long adres_Id;
	
	@Column(name="sehir",length=20,updatable=true,nullable=false)
	private String sehir;
	
	@Column(name="il",length=20,updatable=true,nullable=false)
	private String il;
	
	@Column(name="ilce",length=20,updatable=true,nullable=false)
	private String ilce;
	
	@Lob
	private String aciklama;
	
	public Adres() {
		
	}

	public Adres(Long adres_Id, String sehir, String il, String ilce, String aciklama) {
		this.adres_Id = adres_Id;
		this.sehir = sehir;
		this.il = il;
		this.ilce = ilce;
		this.aciklama = aciklama;
	}

	public Long getAdres_Id() {
		return adres_Id;
	}

	public void setAdres_Id(Long adres_Id) {
		this.adres_Id = adres_Id;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	@Override
	public String toString() {
		return "Adres [adres_Id=" + adres_Id + ", sehir=" + sehir + ", il=" + il + ", ilce=" + ilce + ", aciklama="
				+ aciklama + "]";
	}
	
	
	

}
