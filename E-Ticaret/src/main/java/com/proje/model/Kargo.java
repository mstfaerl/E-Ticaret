package com.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Kargo")
public class Kargo {
	
	@Id
	@Column(name="kargo_Id",unique=true,length=10,nullable=false)
	private Long kargo_Id;
	
	@Column(name="adres",unique=true,length=10,nullable=false)
    private String adres;
	
	@Column(name="telefon",length=20,updatable=true,nullable=false)
    private String telefon;
	
	@Column(name="email",unique=true,updatable=true,length=10,nullable=false)
    private String email;
	
	@Column(name="sirket_adi",length=10,updatable=true,nullable=false)
    private String sirket_Adi;
    
    public Kargo() {
		
    }

	public Kargo(Long kargo_Id, String adres, String telefon, String email, String sirket_Adi) {
		super();
		this.kargo_Id = kargo_Id;
		this.adres = adres;
		this.telefon = telefon;
		this.email = email;
		this.sirket_Adi = sirket_Adi;
	}

	public Long getKargo_Id() {
		return kargo_Id;
	}

	public void setKargo_Id(Long kargo_Id) {
		this.kargo_Id = kargo_Id;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSirket_Adi() {
		return sirket_Adi;
	}

	public void setSirket_Adi(String sirket_Adi) {
		this.sirket_Adi = sirket_Adi;
	}

	@Override
	public String toString() {
		return "Kargo [kargo_Id=" + kargo_Id + ", adres=" + adres + ", telefon=" + telefon + ", email=" + email
				+ ", sirket_Adi=" + sirket_Adi + "]";
	}
    
    

}
