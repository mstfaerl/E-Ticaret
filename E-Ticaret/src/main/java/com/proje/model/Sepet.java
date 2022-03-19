package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Sepet")
public class Sepet {
	
	
	@Id
	@Column(name="sepet_Id",unique=true,length=255,nullable=false)
	private Long sepet_Id;
	
	@Column(name="adet",length = 255,updatable=true,nullable=false)
    private Long adet;
	
	@Column(precision=8, scale=2)
    private Float fiyat;
	
	@Column(precision=8, scale=2)
    private Float indirim_Orani;
	
	@ManyToOne
	@JoinColumn(name="musteri_Id")
    private Musteri musteri;
	
	@ManyToOne
	@JoinColumn(name="urun_Id")
    private Urun urun;
	
	public Sepet() {
		// TODO Auto-generated constructor stub
	}

	public Sepet(Long sepet_Id, Long adet, Float fiyat, Float indirim_Orani, Musteri musteri, Urun urun) {
		this.sepet_Id = sepet_Id;
		this.adet = adet;
		this.fiyat = fiyat;
		this.indirim_Orani = indirim_Orani;
		this.musteri = musteri;
		this.urun = urun;
	}

	public Long getSepet_Id() {
		return sepet_Id;
	}

	public void setSepet_Id(Long sepet_Id) {
		this.sepet_Id = sepet_Id;
	}

	public Long getAdet() {
		return adet;
	}

	public void setAdet(Long adet) {
		this.adet = adet;
	}

	public Float getFiyat() {
		return fiyat;
	}

	public void setFiyat(Float fiyat) {
		this.fiyat = fiyat;
	}

	public Float getIndirim_Orani() {
		return indirim_Orani;
	}

	public void setIndirim_Orani(Float indirim_Orani) {
		this.indirim_Orani = indirim_Orani;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}

	@Override
	public String toString() {
		return "Sepet [sepet_Id=" + sepet_Id + ", adet=" + adet + ", fiyat=" + fiyat + ", indirim_Orani="
				+ indirim_Orani + ", musteri=" + musteri + ", urun=" + urun + "]";
	}
	
	
	
	

}
