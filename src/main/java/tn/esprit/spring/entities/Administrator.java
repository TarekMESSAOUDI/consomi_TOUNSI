package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Administrator extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String specialityAdmin ;
	private String typeAdmin ;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="Administrator")
	private Set<Claim> Claim;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Administrator")
	private Set<CharityEvent> CharityEvent;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="Administrator")
	private Set<Publicity> Publicity;

	
	public Administrator() {
		super();
	}
	
	public Administrator(String firstNameUser, String lastNameUser, String cinUser, String passwordUser, String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser, Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser, String specialityAdmin, String typeAdmin) {
		super();
		this.firstNameUser = firstNameUser ;
		this.lastNameUser = lastNameUser ;
		this.cinUser = cinUser ;
		this.passwordUser = passwordUser;
		this.confirmPasswordUser = confirmPasswordUser ;
		this.stateUser = stateUser ;
		this.phoneNumberUser = phoneNumberUser ;
		this.adressUser = adressUser ;
		this.birthDateUser = birthDateUser;
		this.emailUser = emailUser ;
		this.imageUser = imageUser;
		this.sexeUser = sexeUser ;
		this.specialityAdmin = specialityAdmin;
		this.typeAdmin = typeAdmin;
	}
	
	

	public Administrator(String specialityAdmin, String typeAdmin, Set<Claim> claim,Set<CharityEvent> charityEvent,Set<Publicity> publicity) {
		super();
		this.specialityAdmin = specialityAdmin;
		this.typeAdmin = typeAdmin;
		Claim = claim;
		CharityEvent = charityEvent;
		Publicity = publicity;
	}
	
	
	
	public String getSpecialityAdmin() {
		return specialityAdmin;
	}

	public void setSpecialityAdmin(String specialityAdmin) {
		this.specialityAdmin = specialityAdmin;
	}

	public String getTypeAdmin() {
		return typeAdmin;
	}

	public void setTypeAdmin(String typeAdmin) {
		this.typeAdmin = typeAdmin;
	}

	public Set<Claim> getClaim() {
		return Claim;
	}

	public void setClaim(Set<Claim> claim) {
		Claim = claim;
	}

	public Set<CharityEvent> getCharityEvent() {
		return CharityEvent;
	}

	public void setCharityEvent(Set<CharityEvent> charityEvent) {
		CharityEvent = charityEvent;
	}

	public Set<Publicity> getPublicity() {
		return Publicity;
	}

	public void setPublicity(Set<Publicity> publicity) {
		Publicity = publicity;
	}
	

}
