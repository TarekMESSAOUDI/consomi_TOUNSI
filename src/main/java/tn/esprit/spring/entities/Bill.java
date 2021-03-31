package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;



import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table (name = "T_BILL")
public class Bill implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idBill ;
	private double montant;
	@Temporal (TemporalType.DATE)
	private Date dateBill ;
	
	@Enumerated(EnumType.STRING)
	private PaymentType paymentType;
	
	
	@OneToOne
	private Order order;

	public Bill() {
		super();
	
	}
	
	
	
	public Bill(Long idBill, double montant, Date dateBill, PaymentType paymentType, Order order) {
		super();
		this.idBill = idBill;
		this.montant = montant;
		this.dateBill = dateBill;
		this.paymentType = paymentType;
		this.order = order;
	}



	public Long getIdBill() {
		return idBill;
	}

	public void setIdBill(Long idBill) {
		this.idBill = idBill;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDateBill() {
		return dateBill;
	}

	public void setDateBill(Date dateBill) {
		this.dateBill = dateBill;
	}
	
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateBill == null) ? 0 : dateBill.hashCode());
		result = prime * result + ((idBill == null) ? 0 : idBill.hashCode());
		long temp;
		temp = Double.doubleToLongBits(montant);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((paymentType == null) ? 0 : paymentType.hashCode());
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
		Bill other = (Bill) obj;
		if (dateBill == null) {
			if (other.dateBill != null)
				return false;
		} else if (!dateBill.equals(other.dateBill))
			return false;
		if (idBill == null) {
			if (other.idBill != null)
				return false;
		} else if (!idBill.equals(other.idBill))
			return false;
		if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (paymentType != other.paymentType)
			return false;
		return true;
	}
	
	

}
	
	

	
	
	

	

	

	
	
	
	
	

	
	
