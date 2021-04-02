package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties
@Table(name="T_PRODUCT")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct ;
	private String titleProduct ;
	private String descriptionProduct ;
	private int quantityProduct ;
	private float priceProduct ;
	private int barcodeProduct ;
	private float weightProduct ;
	private float buyingPriceProduct ;
	private int idUnderCategory ;
	private String pictureProduct ;
	private int idDepartment ;
	private int idStock ;
	private int maxQuantityProduct ;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product( int idProduct, String titleProduct, String descriptionProduct, int quantityProduct,
			float priceProduct, int barcodeProduct, float weightProduct, float buyingPriceProduct, int idUnderCategory,
			String pictureProduct, int idDepartment, int idStock, int maxQuantityProduct) {
		super();
		this.idProduct = idProduct;
		this.titleProduct = titleProduct;
		this.descriptionProduct = descriptionProduct;
		this.quantityProduct = quantityProduct;
		this.priceProduct = priceProduct;
		this.barcodeProduct = barcodeProduct;
		this.weightProduct = weightProduct;
		this.buyingPriceProduct = buyingPriceProduct;
		this.idUnderCategory = idUnderCategory;
		this.pictureProduct = pictureProduct;
		this.idDepartment = idDepartment;
		this.idStock = idStock;
		this.maxQuantityProduct = maxQuantityProduct;
	}

	@JsonIgnore
	@ManyToOne
	Department Department;
	
	@JsonIgnore
	@ManyToOne
	Basket Basket; 
	
	@JsonIgnore
	@ManyToOne
	UnderCategory UnderCategory;
	
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getTitleProduct() {
		return titleProduct;
	}
	public void setTitleProduct(String titleProduct) {
		this.titleProduct = titleProduct;
	}
	public String getDescriptionProduct() {
		return descriptionProduct;
	}
	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}
	public int getQuantityProduct() {
		return quantityProduct;
	}
	public void setQuantityProduct(int quantityProduct) {
		this.quantityProduct = quantityProduct;
	}
	public float getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(float priceProduct) {
		this.priceProduct = priceProduct;
	}
	public int getBarcodeProduct() {
		return barcodeProduct;
	}
	public void setBarcodeProduct(int barcodeProduct) {
		this.barcodeProduct = barcodeProduct;
	}
	public float getWeightProduct() {
		return weightProduct;
	}
	public void setWeightProduct(float weightProduct) {
		this.weightProduct = weightProduct;
	}
	public float getBuyingPriceProduct() {
		return buyingPriceProduct;
	}
	public void setBuyingPriceProduct(float buyingPriceProduct) {
		this.buyingPriceProduct = buyingPriceProduct;
	}
	public int getIdUnderCategory() {
		return idUnderCategory;
	}
	public void setIdUnderCategory(int idUnderCategory) {
		this.idUnderCategory = idUnderCategory;
	}
	public String getPictureProduct() {
		return pictureProduct;
	}
	public void setPictureProduct(String pictureProduct) {
		this.pictureProduct = pictureProduct;
	}
	public int getIdDepartment() {
		return idDepartment;
	}
	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}
	public int getIdStock() {
		return idStock;
	}
	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getMaxQuantityProduct() {
		return maxQuantityProduct;
	}
	public void setMaxQuantityProduct(int maxQuantityProduct) {
		this.maxQuantityProduct = maxQuantityProduct;
	}
	public Department getDepartment() {
		return Department;
	}
	public void setDepartment(Department department) {
		Department = department;
	}
	public Basket getBasket() {
		return Basket;
	}
	public void setBasket(Basket basket) {
		Basket = basket;
	}
	public UnderCategory getUnderCategory() {
		return UnderCategory;
	}
	public void setUnderCategory(UnderCategory underCategory) {
		UnderCategory = underCategory;
	}
	
	

}
