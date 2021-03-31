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


@JsonIgnoreProperties
@Entity
@Table (name = "T_DELIVERY_PERSON")
public class DeliveryPerson extends User implements Serializable {
	
	public DeliveryPerson(int idUser, String firstNameUser, String lastNameUser, int cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, int phoneNumberUser, String adressUser, Date birthDateUser,
			String emailUser, String imageUser, SexeType sexeUser) {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	private int missionNumberDeliveryPerson ;
	private String placeDeliveryPerson ;
	private int primeDeliveryPerson ;
	private boolean availabilityDeliveryPerson ;
	private float salaryDeliveryPerson ;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
