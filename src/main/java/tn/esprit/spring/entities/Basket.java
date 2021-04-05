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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Entity
@Table (name = "T_BASKET")
public class Basket implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idBasket ;
	private int productNumberBasket ;
	private float amountBasket;
	
	


	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Basket")
	//@JsonIgnore
	private Set<Product> Product;
	
	

	public Basket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Basket(int idBasket, int productNumberBasket, float amountBasket,
			Set<tn.esprit.spring.entities.Product> product, Order order) {
		super();
		this.idBasket = idBasket;
		this.productNumberBasket = productNumberBasket;
		this.amountBasket = amountBasket;
		Product = product;
		
	}

	public int getIdBasket() {
		return idBasket;
	}

	public void setIdBasket(int idBasket) {
		this.idBasket = idBasket;
	}

	public int getProductNumberBasket() {
		return productNumberBasket;
	}

	public void setProductNumberBasket(int productNumberBasket) {
		this.productNumberBasket = productNumberBasket;
	}

	public float getAmountBasket() {
		return amountBasket;
	}

	public void setAmountBasket(float amountBasket) {
		this.amountBasket = amountBasket;
	}

	public Set<Product> getProduct() {
		return Product;
	}

	public void setProduct(Set<Product> product) {
		Product = product;
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


	

	
	
	

}
