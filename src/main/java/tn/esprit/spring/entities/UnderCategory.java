package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
@Table (name = "T_UNDER_CATEGORY")
public class UnderCategory implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idUnderCategory ;
	private String nameUnderCategory ;
	
	public UnderCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UnderCategory(int idUnderCategory, String nameUnderCategory) {
		super();
		this.idUnderCategory = idUnderCategory;
		this.nameUnderCategory = nameUnderCategory;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="UnderCategory")
	@JsonIgnore
	private Set<Product> Product;
	
	@JsonIgnore
	@ManyToOne
	Category Category;
	
	public int getIdUnderCategory() {
		return idUnderCategory;
	}
	public void setIdUnderCategory(int idUnderCategory) {
		this.idUnderCategory = idUnderCategory;
	}
	public String getNameUnderCategory() {
		return nameUnderCategory;
	}
	public void setNameUnderCategory(String nameUnderCategory) {
		this.nameUnderCategory = nameUnderCategory;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Set<Product> getProduct() {
		return Product;
	}
	public void setProduct(Set<Product> product) {
		Product = product;
	}
	public Category getCategory() {
		return Category;
	}
	public void setCategory(Category category) {
		Category = category;
	}

}
