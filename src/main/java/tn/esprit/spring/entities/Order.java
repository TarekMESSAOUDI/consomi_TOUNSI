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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@JsonIgnoreProperties
@Entity
@Table(name="T_ORDER")
public class Order implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrder ;
	@Temporal (TemporalType.DATE)
	private Date dateOrder ;
	private int productNumberOrder ;
	private String stateOrder ;
	private float amountOrder ;
	private double prix;
	
	@Enumerated(EnumType.STRING)
	private PaymentType paymentType;
	
	@OneToOne(mappedBy="order")
	//@JsonIgnore
	private Bill bill;
	
	
	//@JsonIgnore
	@ManyToOne
	Client Client;


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Order(Long idOrder, Date dateOrder, int productNumberOrder, String stateOrder, float amountOrder,
			double prix, PaymentType paymentType, Bill bill, tn.esprit.spring.entities.Client client) {
		super();
		this.idOrder = idOrder;
		this.dateOrder = dateOrder;
		this.productNumberOrder = productNumberOrder;
		this.stateOrder = stateOrder;
		this.amountOrder = amountOrder;
		this.prix = prix;
		this.paymentType = paymentType;
		this.bill = bill;
		Client = client;
	}




	public Long getIdOrder() {
		return idOrder;
	}


	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}


	public Date getDateOrder() {
		return dateOrder;
	}


	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}


	public int getProductNumberOrder() {
		return productNumberOrder;
	}


	public void setProductNumberOrder(int productNumberOrder) {
		this.productNumberOrder = productNumberOrder;
	}


	public String getStateOrder() {
		return stateOrder;
	}


	public void setStateOrder(String stateOrder) {
		this.stateOrder = stateOrder;
	}


	public float getAmountOrder() {
		return amountOrder;
	}


	public void setAmountOrder(float amountOrder) {
		this.amountOrder = amountOrder;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public PaymentType getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}


	public Bill getBill() {
		return bill;
	}


	public void setBill(Bill bill) {
		this.bill = bill;
	}


	public Client getClient() {
		return Client;
	}


	public void setClient(Client client) {
		this.Client = client;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amountOrder);
		result = prime * result + ((bill == null) ? 0 : bill.hashCode());
		result = prime * result + ((Client == null) ? 0 : Client.hashCode());
		result = prime * result + ((dateOrder == null) ? 0 : dateOrder.hashCode());
		result = prime * result + ((idOrder == null) ? 0 : idOrder.hashCode());
		result = prime * result + ((paymentType == null) ? 0 : paymentType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prix);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productNumberOrder;
		result = prime * result + ((stateOrder == null) ? 0 : stateOrder.hashCode());
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
		Order other = (Order) obj;
		if (Float.floatToIntBits(amountOrder) != Float.floatToIntBits(other.amountOrder))
			return false;
		if (bill == null) {
			if (other.bill != null)
				return false;
		} else if (!bill.equals(other.bill))
			return false;
		if (Client == null) {
			if (other.Client != null)
				return false;
		} else if (!Client.equals(other.Client))
			return false;
		if (dateOrder == null) {
			if (other.dateOrder != null)
				return false;
		} else if (!dateOrder.equals(other.dateOrder))
			return false;
		if (idOrder == null) {
			if (other.idOrder != null)
				return false;
		} else if (!idOrder.equals(other.idOrder))
			return false;
		if (paymentType != other.paymentType)
			return false;
		if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
			return false;
		if (productNumberOrder != other.productNumberOrder)
			return false;
		if (stateOrder == null) {
			if (other.stateOrder != null)
				return false;
		} else if (!stateOrder.equals(other.stateOrder))
			return false;
		return true;
	}

	

	

	

	

	
	
	
	

	
	
	
    
	
	
	

	
}
