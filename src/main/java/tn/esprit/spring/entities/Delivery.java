package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Entity
@Table (name = "T_DELIVERY")
public class Delivery implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idDelivery ;
	@Temporal (TemporalType.DATE)
	private Date dateDelivery ;
	private String placeDelivery ;
	private boolean stateDelivery ;
	@Enumerated (EnumType.STRING)
	private MeansOfTransport meansOfTransportDelivery ;
	private String adressDelivery ;
	private boolean finishedDelivery;
	
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Delivery(int idDelivery, Date dateDelivery, String placeDelivery, boolean stateDelivery,
			MeansOfTransport meansOfTransportDelivery, String adressDelivery, boolean finishedDelivery) {
		super();
		this.idDelivery = idDelivery;
		this.dateDelivery = dateDelivery;
		this.placeDelivery = placeDelivery;
		this.stateDelivery = stateDelivery;
		this.meansOfTransportDelivery = meansOfTransportDelivery;
		this.adressDelivery = adressDelivery;
		this.finishedDelivery = finishedDelivery;
	}

	@JsonIgnore
	@ManyToOne
	DeliveryPerson DeliveryPerson;
	
	
	public Date getDateDelivery() {
		return dateDelivery;
	}
	public void setDateDelivery(Date dateDelivery) {
		this.dateDelivery = dateDelivery;
	}
	public int getIdDelivery() {
		return idDelivery;
	}
	public void setIdDelivery(int idDelivery) {
		this.idDelivery = idDelivery;
	}
	public String getPlaceDelivery() {
		return placeDelivery;
	}
	public void setPlaceDelivery(String placeDelivery) {
		this.placeDelivery = placeDelivery;
	}
	public boolean isStateDelivery() {
		return stateDelivery;
	}
	public void setStateDelivery(boolean stateDelivery) {
		this.stateDelivery = stateDelivery;
	}
	public String getAdressDelivery() {
		return adressDelivery;
	}
	public void setAdressDelivery(String adressDelivery) {
		this.adressDelivery = adressDelivery;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public MeansOfTransport getMeansOfTransportDelivery() {
		return meansOfTransportDelivery;
	}
	public void setMeansOfTransportDelivery(MeansOfTransport meansOfTransportDelivery) {
		this.meansOfTransportDelivery = meansOfTransportDelivery;
	}
	public boolean isFinishedDelivery() {
		return finishedDelivery;
	}
	public void setFinishedDelivery(boolean finishedDelivery) {
		this.finishedDelivery = finishedDelivery;
	}
	public DeliveryPerson getDeliveryPerson() {
		return DeliveryPerson;
	}
	public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
		DeliveryPerson = deliveryPerson;
	}
	
	

}
