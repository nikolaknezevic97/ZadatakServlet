package it.engineering.web.webApp.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the city database table.
 * 
 */
@Entity
@NamedQuery(name="City.findAll", query="SELECT c FROM City c")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ptt_broj")
	private Long ptt_broj;
	@Column(name="naziv")
	private String naziv;
	public Long getPtt_broj() {
		return ptt_broj;
	}
	public void setPtt_broj(Long ptt_broj) {
		this.ptt_broj = ptt_broj;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public City(Long ptt_broj, String naziv) {
		super();
		this.ptt_broj = ptt_broj;
		this.naziv = naziv;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [ptt_broj=" + ptt_broj + ", naziv=" + naziv + "]";
	}
	
	

}