package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Entity
@Table (name = "T_CLIENT")
public class Client extends User implements Serializable {
	
	
	/**
	 * 
	 */
	private static long serialVersionUID = 1L;
	private int rankClient ;
	private int fidelityCardNumberClient ;
	private int pointNumberClient ;
	
	public Client(int idUser, String firstNameUser, String lastNameUser, int cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, int phoneNumberUser, String adressUser, Date birthDateUser,
			String emailUser, String imageUser, SexeType sexeUser) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Client(String firstNameUser, String lastNameUser, String cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser,
			Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser) {
		super(firstNameUser, lastNameUser, cinUser, passwordUser, confirmPasswordUser, stateUser, phoneNumberUser, adressUser,
				birthDateUser, emailUser, imageUser, sexeUser);
		// TODO Auto-generated constructor stub
	}



	public Client(String firstNameUser, String lastNameUser, String cinUser, String passwordUser, String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser, Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser, int rankClient, int fidelityCardNumberClient, int pointNumberClient) {
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
	}
	
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy="Client")
    //@JsonIgnore
	private Set<Order> Order;
	
    
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Client")
	@JsonIgnore
	private Set<Comment> Comment;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Client")
	@JsonIgnore
	private Set<Claim> Claim;
	
	


	
	
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((Claim == null) ? 0 : Claim.hashCode());
		result = prime * result + ((Comment == null) ? 0 : Comment.hashCode());
		result = prime * result + ((Order == null) ? 0 : Order.hashCode());
		result = prime * result + fidelityCardNumberClient;
		result = prime * result + pointNumberClient;
		result = prime * result + rankClient;
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
		Client other = (Client) obj;
		
		if (Claim == null) {
			if (other.Claim != null)
				return false;
		} else if (!Claim.equals(other.Claim))
			return false;
		if (Comment == null) {
			if (other.Comment != null)
				return false;
		} else if (!Comment.equals(other.Comment))
			return false;
		if (Order == null) {
			if (other.Order != null)
				return false;
		} else if (!Order.equals(other.Order))
			return false;
		if (fidelityCardNumberClient != other.fidelityCardNumberClient)
			return false;
		if (pointNumberClient != other.pointNumberClient)
			return false;
		if (rankClient != other.rankClient)
			return false;
		return true;
	}
	
	

	
}
