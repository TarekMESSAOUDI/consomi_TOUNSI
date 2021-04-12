package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name="T_PRODUCT")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct ;
	private int idPayment ;
	private String titleProduct ;
	private String nombre;
	private String descriptionProduct ;
	private int quantityProduct ;
	private float priceProduct ;
	private int barcodeProduct ;
	private float weightProduct ;
	private float buyingPriceProduct ;
	private int maxQuantityProduct ;
	
	
	
	

	@JsonIgnore
	@ManyToOne
	Department Department;
	
	 
	
	@ManyToOne
	Basket Basket;
	
	@JsonIgnore
	@ManyToOne
	UnderCategory UnderCategory;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int idProduct, int idPayment, String titleProduct, String nombre, String descriptionProduct,
			int quantityProduct, int priceProduct, int barcodeProduct, float weightProduct, float buyingPriceProduct,
			int idUnderCategory, String pictureProduct, int idDepartment, int idStock, int maxQuantityProduct,
			tn.esprit.spring.entities.Department department, Order order,
			tn.esprit.spring.entities.UnderCategory underCategory) {}

	
	public Product( int idProduct, String titleProduct, String descriptionProduct, int quantityProduct,

		float priceProduct, int barcodeProduct, float weightProduct, float buyingPriceProduct, int maxQuantityProduct) {
		

	
		super();
		this.idProduct = idProduct;
		this.idPayment = idPayment;
		this.titleProduct = titleProduct;
		this.nombre = nombre;
		this.descriptionProduct = descriptionProduct;
		this.quantityProduct = quantityProduct;
		this.priceProduct = priceProduct;
		this.barcodeProduct = barcodeProduct;
		this.weightProduct = weightProduct;
		this.buyingPriceProduct = buyingPriceProduct;
		this.maxQuantityProduct = maxQuantityProduct;
		
		UnderCategory = getUnderCategory();
	}

	
	
	@ManyToOne
	Stock stock ;
	
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}


	@JsonIgnore
	@OneToMany
	Set <FileDB> images;
	
	@JsonIgnore
	@ManyToOne
	Basket Basket; 

	
	
	

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(int idPayment) {
		this.idPayment = idPayment;
	}

	public String getTitleProduct() {
		return titleProduct;
	}

	public void setTitleProduct(String titleProduct) {
		this.titleProduct = titleProduct;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public void setPriceProduct(float f) {
		this.priceProduct = f;
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

	

	public UnderCategory getUnderCategory() {
		return UnderCategory;
	}

	public void setUnderCategory(UnderCategory underCategory) {
		UnderCategory = underCategory;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		float result = 1;
		result = prime * result + ((Basket == null) ? 0 : Basket.hashCode());
		result = prime * result + ((Department == null) ? 0 : Department.hashCode());
		result = prime * result + ((UnderCategory == null) ? 0 : UnderCategory.hashCode());
		result = prime * result + barcodeProduct;
		result = prime * result + Float.floatToIntBits(buyingPriceProduct);
		result = prime * result + ((descriptionProduct == null) ? 0 : descriptionProduct.hashCode());
		result = prime * result + idDepartment;
		result = prime * result + idPayment;
		result = prime * result + idProduct;
		result = prime * result + idStock;
		result = prime * result + idUnderCategory;
		result = prime * result + maxQuantityProduct;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pictureProduct == null) ? 0 : pictureProduct.hashCode());
		result = prime * result + priceProduct;
		result = prime * result + quantityProduct;
		result = prime * result + ((titleProduct == null) ? 0 : titleProduct.hashCode());
		result = prime * result + Float.floatToIntBits(weightProduct);
		return (int) result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Basket == null) {
			if (other.Basket != null)
				return false;
		} else if (!Basket.equals(other.Basket))
			return false;
		if (Department == null) {
			if (other.Department != null)
				return false;
		} else if (!Department.equals(other.Department))
			return false;
		if (UnderCategory == null) {
			if (other.UnderCategory != null)
				return false;
		} else if (!UnderCategory.equals(other.UnderCategory))
			return false;
		if (barcodeProduct != other.barcodeProduct)
			return false;
		if (Float.floatToIntBits(buyingPriceProduct) != Float.floatToIntBits(other.buyingPriceProduct))
			return false;
		if (descriptionProduct == null) {
			if (other.descriptionProduct != null)
				return false;
		} else if (!descriptionProduct.equals(other.descriptionProduct))
			return false;
		if (idDepartment != other.idDepartment)
			return false;
		if (idPayment != other.idPayment)
			return false;
		if (idProduct != other.idProduct)
			return false;
		if (idStock != other.idStock)
			return false;
		if (idUnderCategory != other.idUnderCategory)
			return false;
		if (maxQuantityProduct != other.maxQuantityProduct)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pictureProduct == null) {
			if (other.pictureProduct != null)
				return false;
		} else if (!pictureProduct.equals(other.pictureProduct))
			return false;
		if (priceProduct != other.priceProduct)
			return false;
		if (quantityProduct != other.quantityProduct)
			return false;
		if (titleProduct == null) {
			if (other.titleProduct != null)
				return false;
		} else if (!titleProduct.equals(other.titleProduct))
			return false;
		if (Float.floatToIntBits(weightProduct) != Float.floatToIntBits(other.weightProduct))
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
	
	

}
