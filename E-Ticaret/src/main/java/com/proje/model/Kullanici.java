package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Kullanici")
public class Kullanici {
	@Id
	@Column(name="kullanici_Id",unique=true,length=10,nullable=false)
	private Long kullanici_Id;
	
	@Column(name="adi",length=20,updatable=true,nullable=false)
    private String adi;
	
	@Column(name="soyadi",length=20,updatable=true,nullable=false)
    private String soyadi;
	
	@Column(name="email",unique=true,updatable=true,length=10,nullable=false)
    private String email;
	
	@Column(name="sifre",length=20,updatable=true,nullable=false)
    private String sifre;
	
	@Column(name="telefon_Numarasi",length=20,updatable=true,nullable=false)
    private String telefon_Numarasi;
	
	@ManyToOne
	@JoinColumn(name="rol_Id")
    private Rol rol;
	
	public Kullanici() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Kullanici(Long kullanici_Id, String adi, String soyadi, String email, String sifre, String telefon_Numarasi,
			Rol rol) {
		this.kullanici_Id = kullanici_Id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.email = email;
		this.sifre = sifre;
		this.telefon_Numarasi = telefon_Numarasi;
		this.rol = rol;
	}



	public Long getKullanici_Id() {
		return kullanici_Id;
	}

	public void setKullanici_Id(Long kullanici_Id) {
		this.kullanici_Id = kullanici_Id;
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

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getTelefon_Numarasi() {
		return telefon_Numarasi;
	}

	public void setTelefon_Numarasi(String telefon_Numarasi) {
		this.telefon_Numarasi = telefon_Numarasi;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Kullanici [kullanici_Id=" + kullanici_Id + ", adi=" + adi + ", soyadi=" + soyadi + ", email=" + email
				+ ", sifre=" + sifre + ", telefon_Numarasi=" + telefon_Numarasi + ", rol=" + rol + "]";
	}
	
	

}
