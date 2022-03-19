package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Musteri")
public class Musteri {
	
	
	@Id
	@Column(name="musteri_Id",unique=true,length=10,nullable=false)
	private Long musteri_Id;
	
	@Column(name="adi",length=20,updatable=true,nullable=false)
    private String adi;
	
	@Column(name="soyadi",length=20,updatable=true,nullable=false)
    private String soyadi;
	
	@Column(name="email",unique=true,updatable=true,length=10,nullable=false)
    private String email;
	
	@Column(name="telefon",length=20,updatable=true,nullable=false)
    private String telefon;
	
	public Musteri() {
		// TODO Auto-generated constructor stub
	}

	public Musteri(Long musteri_Id, String adi, String soyadi, String email, String telefon) {
		this.musteri_Id = musteri_Id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
		this.telefon = telefon;
	}

	public Long getMusteri_Id() {
		return musteri_Id;
	}

	public void setMusteri_Id(Long musteri_Id) {
		this.musteri_Id = musteri_Id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	@Override
	public String toString() {
		return "Musteri [musteri_Id=" + musteri_Id + ", adi=" + adi + ", soyadi=" + soyadi + ", email=" + email
				+ ", telefon=" + telefon + "]";
	}
	
	
	
	

}
