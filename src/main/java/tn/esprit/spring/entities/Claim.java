package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties
@Entity
@Table (name = "T_CLAIM")
public class Claim implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idClaim ;
	private String titleClaim ;
	private String descriptionClaim ;
	private StateClaim_Order stateClaim ;
	@Temporal (TemporalType.DATE)
	private Date dateClaim ;
	
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Claim(int idClaim, String titleClaim, String descriptionClaim, StateClaim_Order stateClaim, Date dateClaim) {
		super();
		this.idClaim = idClaim;
		this.titleClaim = titleClaim;
		this.descriptionClaim = descriptionClaim;
		this.stateClaim = stateClaim;
		this.dateClaim = dateClaim;
	}

	//@JsonIgnore
	@ManyToOne
	Client Client;
	
	
	//@JsonIgnore
	@ManyToOne
	Administrator Administrator; 
	
	public Date getDateClaim() {
		return dateClaim;
	}
	public void setDateClaim(Date dateClaim) {
		this.dateClaim = dateClaim;
	}
	public int getIdClaim() {
		return idClaim;
	}
	public void setIdClaim(int idClaim) {
		this.idClaim = idClaim;
	}
	public String getTitleClaim() {
		return titleClaim;
	}
	public void setTitleClaim(String titleClaim) {
		this.titleClaim = titleClaim;
	}
	public String getDescriptionClaim() {
		return descriptionClaim;
	}
	public void setDescriptionClaim(String descriptionClaim) {
		this.descriptionClaim = descriptionClaim;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public StateClaim_Order getStateClaim() {
		return stateClaim;
	}
	public void setStateClaim(StateClaim_Order stateClaim) {
		this.stateClaim = stateClaim;
	}
	public Client getClient() {
		return Client;
	}
	public void setClient(Client client) {
		Client = client;
	}
	public Administrator getAdministrator() {
		return Administrator;
	}
	public void setAdministrator(Administrator administrator) {
		Administrator = administrator;
	}

}
