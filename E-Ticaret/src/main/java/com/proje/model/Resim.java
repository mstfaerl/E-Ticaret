package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Resim")
public class Resim {
	
	
	@Id
	@Column(name="resim_Id",unique=true,length=255,nullable=false)
	private Long resim_Id;
	
	@Column(name="adi",length=20,updatable=true,nullable=false)
    private String adi;
	
	@Column(name="yolu",length=20,updatable=true,nullable=false)
    private String yolu;
	
	@Column(name="tipi",length=20,updatable=true,nullable=false)
    private String tipi;
	
	@ManyToOne
	@JoinColumn(name="urun_Id")
    private Urun urun;
	
	public Resim() {
		// TODO Auto-generated constructor stub
	}

	public Resim(Long resim_Id, String adi, String yolu, String tipi, Urun urun) {
		this.resim_Id = resim_Id;
		this.adi = adi;
		this.yolu = yolu;
		this.tipi = tipi;
		this.urun = urun;
	}

	public Long getResim_Id() {
		return resim_Id;
	}

	public void setResim_Id(Long resim_Id) {
		this.resim_Id = resim_Id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getYolu() {
		return yolu;
	}

	public void setYolu(String yolu) {
		this.yolu = yolu;
	}

	public String getTipi() {
		return tipi;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}

	@Override
	public String toString() {
		return "Resim [resim_Id=" + resim_Id + ", adi=" + adi + ", yolu=" + yolu + ", tipi=" + tipi + ", urun=" + urun
				+ "]";
	}
	
	
	
	

}
