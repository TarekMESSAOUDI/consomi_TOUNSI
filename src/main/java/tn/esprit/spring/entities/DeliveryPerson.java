package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
//@Table (name = "T_DELIVERY_PERSON")
public class DeliveryPerson extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int missionNumberDeliveryPerson ;
	private String placeDeliveryPerson ;
	private int primeDeliveryPerson ;
	private boolean availabilityDeliveryPerson ;
	private float salaryDeliveryPerson ;
	
	public DeliveryPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DeliveryPerson(int idUser,String firstNameUser, String lastNameUser,String cinUser, String passwordUser, String confirmPasswordUser, boolean stateUser,String phoneNumberUser, String adressUser, Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser, int missionNumberDeliveryPerson, String placeDeliveryPerson, int primeDeliveryPerson, boolean availabilityDeliveryPerson, float salaryDeliveryPerson) {
		super();
	    this.idUser=idUser;
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
	public void setSalaryDeliveryPerson(float salaryDeliveryPerson) {
		this.salaryDeliveryPerson = salaryDeliveryPerson;
	}
	public Set<Delivery> getDelivery() {
		return Delivery;
	}
	public void setDelivery(Set<Delivery> delivery) {
		Delivery = delivery;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Delivery == null) ? 0 : Delivery.hashCode());
		result = prime * result + (availabilityDeliveryPerson ? 1231 : 1237);
		result = prime * result + missionNumberDeliveryPerson;
		result = prime * result + ((placeDeliveryPerson == null) ? 0 : placeDeliveryPerson.hashCode());
		result = prime * result + primeDeliveryPerson;
		result = prime * result + Float.floatToIntBits(salaryDeliveryPerson);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeliveryPerson other = (DeliveryPerson) obj;
		if (Delivery == null) {
			if (other.Delivery != null)
				return false;
		} else if (!Delivery.equals(other.Delivery))
			return false;
		if (availabilityDeliveryPerson != other.availabilityDeliveryPerson)
			return false;
		if (missionNumberDeliveryPerson != other.missionNumberDeliveryPerson)
			return false;
		if (placeDeliveryPerson == null) {
			if (other.placeDeliveryPerson != null)
				return false;
		} else if (!placeDeliveryPerson.equals(other.placeDeliveryPerson))
			return false;
		if (primeDeliveryPerson != other.primeDeliveryPerson)
			return false;
		if (Float.floatToIntBits(salaryDeliveryPerson) != Float.floatToIntBits(other.salaryDeliveryPerson))
			return false;
		return true;
	}

	
}
