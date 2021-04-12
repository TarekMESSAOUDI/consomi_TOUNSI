package tn.esprit.spring.entities;

import java.io.Serializable;
import java.time.LocalDate;
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


@Entity
@Table(name="T_PAYMENT")
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPayment;
	
	@Enumerated(EnumType.STRING)
	private PaymentType typePayment;
    
	@Temporal(TemporalType.DATE)
	Date datePayment;
	
	@JsonIgnore
	@ManyToOne
	Client Client;
	
	
	public Long getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(Long idPayment) {
		this.idPayment = idPayment;
	}
	public PaymentType getTypePayment() {
		return typePayment;
	}
	public void setTypePayment(PaymentType typePayment) {
		this.typePayment = typePayment;
	}
	public Date getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(Date datePayment) {
		this.datePayment = datePayment;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Payment(Long idPayment, PaymentType typePayment, Date datePayment) {
		super();
		this.idPayment = idPayment;
		this.typePayment = typePayment;
		this.datePayment = datePayment;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Client == null) ? 0 : Client.hashCode());
		result = prime * result + ((datePayment == null) ? 0 : datePayment.hashCode());
		result = prime * result + ((idPayment == null) ? 0 : idPayment.hashCode());
		result = prime * result + ((typePayment == null) ? 0 : typePayment.hashCode());
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
		Payment other = (Payment) obj;
		if (Client == null) {
			if (other.Client != null)
				return false;
		} else if (!Client.equals(other.Client))
			return false;
		if (datePayment == null) {
			if (other.datePayment != null)
				return false;
		} else if (!datePayment.equals(other.datePayment))
			return false;
		if (idPayment == null) {
			if (other.idPayment != null)
				return false;
		} else if (!idPayment.equals(other.idPayment))
			return false;
		if (typePayment != other.typePayment)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Payment [idPayment=" + idPayment + ", typePayment=" + typePayment + ", datePayment=" + datePayment
				+ ", Client=" + Client + "]";
	}
	public Object getAmount() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCurrency() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
    
	
	
	
	
	
	
}
