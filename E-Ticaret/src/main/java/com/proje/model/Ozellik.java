package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Ozellik")
public class Ozellik {
	@Id
	@Column(name="ozellik_Id",unique=true,length=10,nullable=false)
	private Long ozellik_Id;
	
	
	@Column(name="adi",length=20,updatable=true,nullable=false)
    private String adi;
	
	@Lob
    private String aciklama;
	
	public Ozellik() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Ozellik(Long ozellik_Id, String adi, String aciklama) {
		this.ozellik_Id = ozellik_Id;
		this.adi = adi;
		this.aciklama = aciklama;
	}



	public Long getOzellik_Id() {
		return ozellik_Id;
	}

	public void setOzellik_Id(Long ozellik_Id) {
		this.ozellik_Id = ozellik_Id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	@Override
	public String toString() {
		return "Ozellik [ozellik_Id=" + ozellik_Id + ", adi=" + adi + ", aciklama=" + aciklama + "]";
	}
	
	

}
