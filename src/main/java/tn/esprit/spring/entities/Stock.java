package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

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
	private Long capacityStock ;
	private Long quantityStock ;
	private float costStock ;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
	private Set<Department> Department;  


	
	
	
	
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

	public Long getCapacityStock() {
		return capacityStock;
	}

	public void setCapacityStock(Long capacityStock) {
		this.capacityStock = capacityStock;
	}

	public Long getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(Long quantityStock) {
		this.quantityStock = quantityStock;
	}

	public float getCostStock() {
		return costStock;
	}

	public void setCostStock(float costStock) {
		this.costStock = costStock;
	}


	public Set<Department> getDepartment() {
		return Department;
	}

	public void setDepartment(Set<Department> department) {
		Department = department;
	}




	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Stock(Long idStock, String nameStock, tn.esprit.spring.entities.TypeStock typeStock, Date validityStock,
			Long capacityStock, Long quantityStock, float costStock,
			Set<tn.esprit.spring.entities.Department> department) {
		super();
		this.idStock = idStock;
		this.nameStock = nameStock;
		TypeStock = typeStock;
		this.validityStock = validityStock;
		this.capacityStock = capacityStock;
		this.quantityStock = quantityStock;
		this.costStock = costStock;
		this.Department = department;
	}

	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", nameStock=" + nameStock + ", TypeStock=" + TypeStock
				+ ", validityStock=" + validityStock + ", capacityStock=" + capacityStock + ", quantityStock="
				+ quantityStock + ", costStock=" + costStock + ", Department=" + Department + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Department == null) ? 0 : Department.hashCode());
		result = prime * result + ((TypeStock == null) ? 0 : TypeStock.hashCode());
		result = prime * result + ((capacityStock == null) ? 0 : capacityStock.hashCode());
		result = prime * result + Float.floatToIntBits(costStock);
		result = prime * result + ((idStock == null) ? 0 : idStock.hashCode());
		result = prime * result + ((nameStock == null) ? 0 : nameStock.hashCode());
		result = prime * result + ((quantityStock == null) ? 0 : quantityStock.hashCode());
		result = prime * result + ((validityStock == null) ? 0 : validityStock.hashCode());
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
		Stock other = (Stock) obj;
		if (Department == null) {
			if (other.Department != null)
				return false;
		} else if (!Department.equals(other.Department))
			return false;
		if (TypeStock != other.TypeStock)
			return false;
		if (capacityStock == null) {
			if (other.capacityStock != null)
				return false;
		} else if (!capacityStock.equals(other.capacityStock))
			return false;
		if (Float.floatToIntBits(costStock) != Float.floatToIntBits(other.costStock))
			return false;
		if (idStock == null) {
			if (other.idStock != null)
				return false;
		} else if (!idStock.equals(other.idStock))
			return false;
		if (nameStock == null) {
			if (other.nameStock != null)
				return false;
		} else if (!nameStock.equals(other.nameStock))
			return false;
		if (quantityStock == null) {
			if (other.quantityStock != null)
				return false;
		} else if (!quantityStock.equals(other.quantityStock))
			return false;
		if (validityStock == null) {
			if (other.validityStock != null)
				return false;
		} else if (!validityStock.equals(other.validityStock))
			return false;
		return true;
	}








	
	}
	
	
	
	
	
	
	
	
	
	
