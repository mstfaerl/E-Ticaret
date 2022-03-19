package com.proje.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="Urun")
public class Urun {
	
	@Id
	@Column(name="urun_Id",unique=true,length=10,nullable=false)
	private Long urun_Id;
	
	@Column(name="adi",length=20,updatable=true,nullable=false)
    private String adi;
	
	@Lob
    private String aciklama;
	
	@Column(precision=8, scale=2)
    private Float alis_Fiyati;
	
	@Column(precision=8, scale=2)
    private Float satis_Fiyati;
	
	@Temporal(TemporalType.DATE)
	@Column(name="olusturulma_Tarihi")
    private Date olusturulma_Tarihi;
	
	@Temporal(TemporalType.DATE)
	@Column(name="son_kullanma_Tarihi")
    private Date son_kullanma_Tarihi;
	
	@Column(columnDefinition="tinyint (1) default 1")
    private Boolean silindi;
	
	@ManyToOne
	@JoinColumn(name="kategori_Id")
    private Kategori kategori;
	
	@ManyToOne
	@JoinColumn(name="marka_Id")
    private Marka marka;
	
	public Urun() {
		
	}

	public Urun(Long urun_Id, String adi, String aciklama, Float alis_Fiyati, Float satis_Fiyati,
			Date olusturulma_Tarihi, Date son_kullanma_Tarihi, Boolean silindi, Kategori kategori, Marka marka) {
		this.urun_Id = urun_Id;
		this.adi = adi;
		this.aciklama = aciklama;
		this.alis_Fiyati = alis_Fiyati;
		this.satis_Fiyati = satis_Fiyati;
		this.olusturulma_Tarihi = olusturulma_Tarihi;
		this.son_kullanma_Tarihi = son_kullanma_Tarihi;
		this.silindi = silindi;
		this.kategori = kategori;
		this.marka = marka;
	}
	
	

}
