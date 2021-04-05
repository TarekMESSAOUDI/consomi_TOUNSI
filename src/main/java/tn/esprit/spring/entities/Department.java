package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties
@Entity

@Table (name = "T_DEPARTMENT")
public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//test
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartment ;
	private String nameDepartment ;
	@Enumerated(EnumType.STRING)
	private TypeDepartment typeDepartment ;
	private int capacityDepartment ;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(int idDepartment, String nameDepartment, TypeDepartment typeDepartment, int capacityDepartment) {
		super();
		this.idDepartment = idDepartment;
		this.nameDepartment = nameDepartment;
		this.typeDepartment = typeDepartment;
		this.capacityDepartment = capacityDepartment;
	}

	@JsonIgnore
	@ManyToOne
	Stock stock ;
	
	
	//@JsonIgnore
	@ManyToOne
	DepartmentManager DepartmentManager ;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Department")
	@JsonIgnore
	private Set<Product> Product;


	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public TypeDepartment getTypeDepartment() {
		return typeDepartment;
	}

	public void setTypeDepartment(TypeDepartment typeDepartment) {
		this.typeDepartment = typeDepartment;
	}

	public int getCapacityDepartment() {
		return capacityDepartment;
	}

	public void setCapacityDepartment(int capacityDepartment) {
		this.capacityDepartment = capacityDepartment;
	}
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public DepartmentManager getDepartmentManager() {
		return DepartmentManager;
	}

	public void setDepartmentManager(DepartmentManager departmentManager) {
		DepartmentManager = departmentManager;
	}

	public Set<Product> getProduct() {
		return Product;
	}

	public void setProduct(Set<Product> product) {
		Product = product;
	}

	@Override
	public String toString() {
		return "Department [idDepartment=" + idDepartment + ", nameDepartment=" + nameDepartment + ", typeDepartment="
				+ typeDepartment + ", capacityDepartment=" + capacityDepartment + ", stock=" + stock
				+ ", DepartmentManager=" + DepartmentManager + ", Product=" + Product + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
