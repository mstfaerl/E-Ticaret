package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Kategori")
public class Kategori  {
	@Id
	@Column(name="kategori_Id",unique=true,length=10,nullable=false)
	private Long kategori_Id;
	
	@Column(name="adi",length=20,updatable=true,nullable=false)
    private String adi;
	
	@Lob
    private String aciklama;
	
	@Column(columnDefinition="tinyint (1) default 1")
	private String urun_Ozellikleri;

	
	public Kategori() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Kategori(Long kategori_Id, String adi, String aciklama, String urun_Ozellikleri) {
		this.kategori_Id = kategori_Id;
		this.adi = adi;
		this.aciklama = aciklama;
		this.urun_Ozellikleri = urun_Ozellikleri;
	}


	public Long getKategori_Id() {
		return kategori_Id;
	}

	public void setKategori_Id(Long kategori_Id) {
		this.kategori_Id = kategori_Id;
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

	public String getUrun_Ozellikleri() {
		return urun_Ozellikleri;
	}

	public void setUrun_Ozellikleri(String urun_Ozellikleri) {
		this.urun_Ozellikleri = urun_Ozellikleri;
	}

	@Override
	public String toString() {
		return "Kategori [kategori_Id=" + kategori_Id + ", adi=" + adi + ", aciklama=" + aciklama
				+ ", urun_Ozellikleri=" + urun_Ozellikleri + "]";
	}


}
