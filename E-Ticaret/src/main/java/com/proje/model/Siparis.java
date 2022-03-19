package com.proje.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Siparis")
public class Siparis {
	
	@Id
	@Column(name="siparis_Id",unique=true,length=255,nullable=false)
	private Long siparis_Id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="satis_Tarihi")
    private Date satis_Tarihi;
	
	@Column(name="toplam_Tutar",length=20,updatable=true,nullable=false)
    private String toplam_Tutar;
	
	@Column(columnDefinition="tinyint (1) default 1")
    private Boolean siparis_Sepeti;
	
	@Column(name="kargo_takip_No",length=20,updatable=true,nullable=false)
    private String kargo_takip_No;
	
	@ManyToOne
	@JoinColumn(name="musteri_Id")
    private Musteri musteri;
	
	@ManyToOne
	@JoinColumn(name="siparisDurumu_Id")
    private SiparisDurumu siparisDurumu;
	
	@ManyToOne
	@JoinColumn(name="kargo_Id")
    private Kargo kargo;
	
	@ManyToOne
	@JoinColumn(name="urun_Id")
    private Urun urun;
	
	@ManyToOne
	@JoinColumn(name="sepet_Id")
    private Sepet sepet;
	
	public Siparis() {
		// TODO Auto-generated constructor stub
	}

	public Siparis(Long siparis_Id, Date satis_Tarihi, String toplam_Tutar, Boolean siparis_Sepeti,
			String kargo_takip_No, Musteri musteri, SiparisDurumu siparisDurumu, Kargo kargo, Urun urun, Sepet sepet) {
		this.siparis_Id = siparis_Id;
		this.satis_Tarihi = satis_Tarihi;
		this.toplam_Tutar = toplam_Tutar;
		this.siparis_Sepeti = siparis_Sepeti;
		this.kargo_takip_No = kargo_takip_No;
		this.musteri = musteri;
		this.siparisDurumu = siparisDurumu;
		this.kargo = kargo;
		this.urun = urun;
		this.sepet = sepet;
	}

	public Long getSiparis_Id() {
		return siparis_Id;
	}

	public void setSiparis_Id(Long siparis_Id) {
		this.siparis_Id = siparis_Id;
	}

	public Date getSatis_Tarihi() {
		return satis_Tarihi;
	}

	public void setSatis_Tarihi(Date satis_Tarihi) {
		this.satis_Tarihi = satis_Tarihi;
	}

	public String getToplam_Tutar() {
		return toplam_Tutar;
	}

	public void setToplam_Tutar(String toplam_Tutar) {
		this.toplam_Tutar = toplam_Tutar;
	}

	public Boolean getSiparis_Sepeti() {
		return siparis_Sepeti;
	}

	public void setSiparis_Sepeti(Boolean siparis_Sepeti) {
		this.siparis_Sepeti = siparis_Sepeti;
	}

	public String getKargo_takip_No() {
		return kargo_takip_No;
	}

	public void setKargo_takip_No(String kargo_takip_No) {
		this.kargo_takip_No = kargo_takip_No;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public SiparisDurumu getSiparisDurumu() {
		return siparisDurumu;
	}

	public void setSiparisDurumu(SiparisDurumu siparisDurumu) {
		this.siparisDurumu = siparisDurumu;
	}

	public Kargo getKargo() {
		return kargo;
	}

	public void setKargo(Kargo kargo) {
		this.kargo = kargo;
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}

	public Sepet getSepet() {
		return sepet;
	}

	public void setSepet(Sepet sepet) {
		this.sepet = sepet;
	}

	@Override
	public String toString() {
		return "Siparis [siparis_Id=" + siparis_Id + ", satis_Tarihi=" + satis_Tarihi + ", toplam_Tutar=" + toplam_Tutar
				+ ", siparis_Sepeti=" + siparis_Sepeti + ", kargo_takip_No=" + kargo_takip_No + ", musteri=" + musteri
				+ ", siparisDurumu=" + siparisDurumu + ", kargo=" + kargo + ", urun=" + urun + ", sepet=" + sepet + "]";
	}
	
	
	
	

}
