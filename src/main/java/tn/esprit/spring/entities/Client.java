package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import javax.persistence.OneToOne;

@Entity
public class Client extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int rankClient ;
	private int fidelityCardNumberClient ;
	private int pointNumberClient ;
	
	public Client(int idUser, String firstNameUser, String lastNameUser, int cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, int phoneNumberUser, String adressUser, Date birthDateUser,
			String emailUser, String imageUser, SexeType sexeUser) {
		super();
	}

	public Client() {
		super();
	}

	public Client(String firstNameUser, String lastNameUser, String cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser,
			Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser, int i, int j, int k) {
		super(firstNameUser, lastNameUser, cinUser, passwordUser, confirmPasswordUser, stateUser, phoneNumberUser, adressUser,
				birthDateUser, emailUser, imageUser, sexeUser);
	}

	public Client(String firstNameUser, String lastNameUser, String cinUser, String passwordUser, String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser, Date birthDateUser, String emailUser, /*String imageUser,*/ SexeType sexeUser, int rankClient, int fidelityCardNumberClient, int pointNumberClient, String imageUser) {
		super();
		this.firstNameUser = firstNameUser ;
		this.lastNameUser = lastNameUser ;
		this.cinUser = cinUser ;
		this.passwordUser = passwordUser;
		this.confirmPasswordUser = confirmPasswordUser ;
		this.stateUser = stateUser ;
		this.phoneNumberUser = phoneNumberUser ;
		this.adressUser = adressUser ;
		this.birthDateUser = birthDateUser;
		this.emailUser = emailUser ;
		this.imageUser = imageUser;
		this.sexeUser = sexeUser ;
		this.rankClient = rankClient;
		this.fidelityCardNumberClient = fidelityCardNumberClient;
		this.pointNumberClient = pointNumberClient;
		Order = getOrder();
		Basket = getBasket();
		Comment = getComment();
		Claim = getClaim();
		ImageUser1 = getImageUser1();
	}
	
    
	private tn.esprit.spring.entities.Basket getBasket() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBasket(Basket basket) {
		Basket = basket;
	}

	public Client(int rankClient, int fidelityCardNumberClient, int pointNumberClient,
			Set<tn.esprit.spring.entities.Order> order, Basket Basket,
			Set<Comment> comment, Set<Claim> claim, Set<ImageUser1> ImageUser1) {
		super();
		this.rankClient = rankClient;
		this.fidelityCardNumberClient = fidelityCardNumberClient;
		this.pointNumberClient = pointNumberClient;
		Order = order;
		Basket = Basket;
		Comment = comment;
		Claim = claim;
		this.ImageUser1=ImageUser1;
	}


	@OneToMany(cascade = CascadeType.ALL, mappedBy="Client")
	private Set<Order> Order;
	
	@OneToOne //( mappedBy="Client")
	private Basket Basket; 

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Client")
	private Set<Comment> Comment;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Client")
	private Set<Claim> Claim;
	
	

	@OneToMany(cascade = CascadeType.ALL)
	private Set<ImageUser1> ImageUser1;

	public Set<ImageUser1> getImageUser1() {
		return ImageUser1;
	}

	public void setImageUser1(Set<ImageUser1> imageUser1) {
		ImageUser1 = imageUser1;
	}

	public int getRankClient() {
		return rankClient;
	}
	public void setRankClient(int rankClient) {
		this.rankClient = rankClient;
	}
	public int getFidelityCardNumberClient() {
		return fidelityCardNumberClient;
	}
	public void setFidelityCardNumberClient(int fidelityCardNumberClient) {
		this.fidelityCardNumberClient = fidelityCardNumberClient;
	}
	public int getPointNumberClient() {
		return pointNumberClient;
	}
	public void setPointNumberClient(int pointNumberClient) {
		this.pointNumberClient = pointNumberClient;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Set<Order> getOrder() {
		return Order;
	}
	public void setOrder(Set<Order> order) {
		Order = order;
	}

	

	public Set<Comment> getComment() {
		return Comment;
	}
	public void setComment(Set<Comment> comment) {
		Comment = comment;
	}
	public Set<Claim> getClaim() {
		return Claim;
	}
	public void setClaim(Set<Claim> claim) {
		Claim = claim;
	}


	public void setClient(Basket basket2) {
		// TODO Auto-generated method stub

	}

}
