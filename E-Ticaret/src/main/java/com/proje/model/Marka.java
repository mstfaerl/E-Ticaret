package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Marka")
public class Marka {
	@Id
	@Column(name="marka_Id",unique=true,length=10,nullable=false)
	private Long marka_Id;
	
	@Column(name="adi",length=20,updatable=true,nullable=false)
    private String adi;
	
	@Lob
    private String aciklama;
	
	public Marka() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Marka(Long marka_Id, String adi, String aciklama) {
		this.marka_Id = marka_Id;
		this.adi = adi;
		this.aciklama = aciklama;
	}



	public Long getMarka_Id() {
		return marka_Id;
	}

	public void setMarka_Id(Long marka_Id) {
		this.marka_Id = marka_Id;
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
		return "Marka [marka_Id=" + marka_Id + ", adi=" + adi + ", aciklama=" + aciklama + "]";
	}

	
	
}
