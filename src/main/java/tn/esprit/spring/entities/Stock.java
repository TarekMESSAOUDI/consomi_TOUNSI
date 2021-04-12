package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties

@Entity

@Table (name = "T1_STOCK")
public class Stock implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idStock ;
	private String nameStock ;
	@Enumerated(EnumType.STRING)
	private TypeStock TypeStock ;
	@Temporal (TemporalType.DATE)
	private Date validityStock ;
	private int capacityStock ;
	private int quantityStock ;
	private float sellingcost ;
	
	
	
	
	
	
@JsonIgnore
	@OneToMany( mappedBy="stock",cascade = CascadeType.ALL)
	private List<Product> product;






public Long getIdStock() {
	return idStock;
}






public void setIdStock(Long idStock) {
	this.idStock = idStock;
}






public String getNameStock() {
	return nameStock;
}






public void setNameStock(String nameStock) {
	this.nameStock = nameStock;
}






public TypeStock getTypeStock() {
	return TypeStock;
}






public void setTypeStock(TypeStock typeStock) {
	TypeStock = typeStock;
}






public Date getValidityStock() {
	return validityStock;
}






public void setValidityStock(Date validityStock) {
	this.validityStock = validityStock;
}






public int getCapacityStock() {
	return capacityStock;
}






public void setCapacityStock(int capacityStock) {
	this.capacityStock = capacityStock;
}






public int getQuantityStock() {
	return quantityStock;
}






public void setQuantityStock(int quantityStock) {
	this.quantityStock = quantityStock;
}






public float getSellingcost() {
	return sellingcost;
}






public void setSellingcost(float sellingcost) {
	this.sellingcost = sellingcost;
}






public List<Product> getProduct() {
	return product;
}






public void setProduct(List<Product> product) {
	this.product = product;
}






public Stock(Long idStock, String nameStock, tn.esprit.spring.entities.TypeStock typeStock, Date validityStock,
		int capacityStock, int quantityStock, float sellingcost, List<Product> product) {
	super();
	this.idStock = idStock;
	this.nameStock = nameStock;
	TypeStock = typeStock;
	this.validityStock = validityStock;
	this.capacityStock = capacityStock;
	this.quantityStock = quantityStock;
	this.sellingcost = sellingcost;
	this.product = product;
}






public Stock() {
	super();
	// TODO Auto-generated constructor stub
}






@Override
public String toString() {
	return "Stock [idStock=" + idStock + ", nameStock=" + nameStock + ", TypeStock=" + TypeStock + ", validityStock="
			+ validityStock + ", capacityStock=" + capacityStock + ", quantityStock=" + quantityStock + ", sellingcost="
			+ sellingcost + ", product=" + product + "]";
}







	
	}
	
	
	
	
	
	
	
	
	
	
