package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="SiparisDurumu")
public class SiparisDurumu {
	
	@Id
	@Column(name="siparisdurumu_Id",unique=true,length=10,nullable=false)
	private Long siparisdurumu_Id;
	
	@Column(name="adi",length=20,updatable=true,nullable=false)
    private String adi;
	
	@Lob
    private String aciklama;
	
	public SiparisDurumu() {
		// TODO Auto-generated constructor stub
	}

	public SiparisDurumu(Long siparisdurumu_Id, String adi, String aciklama) {
		this.siparisdurumu_Id = siparisdurumu_Id;
		this.adi = adi;
		this.aciklama = aciklama;
	}

	public Long getSiparisdurumu_Id() {
		return siparisdurumu_Id;
	}

	public void setSiparisdurumu_Id(Long siparisdurumu_Id) {
		this.siparisdurumu_Id = siparisdurumu_Id;
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
		return "SiparisDurumu [siparisdurumu_Id=" + siparisdurumu_Id + ", adi=" + adi + ", aciklama=" + aciklama + "]";
	}
	
	
	
	

}
