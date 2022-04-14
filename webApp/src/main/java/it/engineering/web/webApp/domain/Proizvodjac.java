package it.engineering.web.webApp.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the proizvodjac database table.
 * 
 */
@Entity
@NamedQuery(name="Proizvodjac.findAll", query="SELECT p FROM Proizvodjac p")
public class Proizvodjac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_proizvodjaca")
	private Long idProizvodjaca;
	@Column(name="pib")
	private String pib;
	@Column(name="maticni_broj")
	private String maticniBroj;
	@Column(name="adresa")
	private String adresa;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="ptt_broj")
	private City city;

	public Long getIdProizvodjaca() {
		return idProizvodjaca;
	}

	public void setIdProizvodjaca(Long idProizvodjaca) {
		this.idProizvodjaca = idProizvodjaca;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public String getMaticniBroj() {
		return maticniBroj;
	}

	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Proizvodjac(Long idProizvodjaca, String pib, String maticniBroj, String adresa, City city) {
		super();
		this.idProizvodjaca = idProizvodjaca;
		this.pib = pib;
		this.maticniBroj = maticniBroj;
		this.adresa = adresa;
		this.city = city;
	}

	public Proizvodjac() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Proizvodjac [idProizvodjaca=" + idProizvodjaca + ", pib=" + pib + ", maticniBroj=" + maticniBroj
				+ ", adresa=" + adresa + ", city=" + city + "]";
	}
	
	
	
	

}