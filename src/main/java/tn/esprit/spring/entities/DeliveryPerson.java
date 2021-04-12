package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table (name = "T_DELIVERY_PERSON")
public class DeliveryPerson extends User implements Serializable {
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int missionNumberDeliveryPerson ;
	private String placeDeliveryPerson ;
	private int primeDeliveryPerson ;
	private boolean availabilityDeliveryPerson ;
	private int salaryDeliveryPerson ;
	@Enumerated(EnumType.STRING)
	private ZoneMap zone;
	
	

	public DeliveryPerson() {
		super();
		
	}
	
	public DeliveryPerson(String firstNameUser, String lastNameUser,String cinUser, String passwordUser, String confirmPasswordUser, boolean stateUser,String phoneNumberUser, String adressUser, Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser, int missionNumberDeliveryPerson, String placeDeliveryPerson, int primeDeliveryPerson, boolean availabilityDeliveryPerson, int salaryDeliveryPerson) {
		super();
	   
		this.firstNameUser=firstNameUser;
		this.lastNameUser=lastNameUser;
		this.cinUser=cinUser;
		this.passwordUser=passwordUser;
		this.confirmPasswordUser=confirmPasswordUser;
		this.stateUser=stateUser;
		this.phoneNumberUser=phoneNumberUser;
		this.adressUser=adressUser;
		this.birthDateUser=birthDateUser;
		this.emailUser=emailUser;
		this.imageUser=imageUser;
		this.sexeUser=sexeUser;
		this.missionNumberDeliveryPerson = missionNumberDeliveryPerson;
		this.placeDeliveryPerson = placeDeliveryPerson;
		this.primeDeliveryPerson = primeDeliveryPerson;
		this.availabilityDeliveryPerson = availabilityDeliveryPerson;
		this.salaryDeliveryPerson = salaryDeliveryPerson;
	
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="DeliveryPerson")
	@JsonIgnore
	private Set<Delivery> Delivery;
	
	
	
	
	/////test//////
	/*public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}*/

	
	/////////test///////////
	
	
	
	
	/*public int getNbrMax() {
		return nbrMax;
	}

	public void setNbrMax(int nbrMax) {
		this.nbrMax = nbrMax;
	}*/

	
	

	public int getMissionNumberDeliveryPerson() {
		return missionNumberDeliveryPerson;
	}
	
	public void setMissionNumberDeliveryPerson(int missionNumberDeliveryPerson) {
		this.missionNumberDeliveryPerson = missionNumberDeliveryPerson;
	}
	public String getPlaceDeliveryPerson() {
		return placeDeliveryPerson;
	}
	public void setPlaceDeliveryPerson(String placeDeliveryPerson) {
		this.placeDeliveryPerson = placeDeliveryPerson;
	}
	public int getPrimeDeliveryPerson() {
		return primeDeliveryPerson;
	}
	public void setPrimeDeliveryPerson(int primeDeliveryPerson) {
		this.primeDeliveryPerson = primeDeliveryPerson;
	}
	public boolean isAvailabilityDeliveryPerson() {
		return availabilityDeliveryPerson;
	}
	public void setAvailabilityDeliveryPerson(boolean availabilityDeliveryPerson) {
		this.availabilityDeliveryPerson = availabilityDeliveryPerson;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public float getSalaryDeliveryPerson() {
		return salaryDeliveryPerson;
	}
	public void setSalaryDeliveryPerson(int salaryDeliveryPerson) {
		this.salaryDeliveryPerson = salaryDeliveryPerson;
	}
	public Set<Delivery> getDelivery() {
		return Delivery;
	}
	public void setDelivery(Set<Delivery> delivery) {
		Delivery = delivery;
	}
	public ZoneMap getZone() {
		return zone;
	}

	public void setZone(ZoneMap zone) {
		this.zone = zone;
	}

	
	
	

	
}
