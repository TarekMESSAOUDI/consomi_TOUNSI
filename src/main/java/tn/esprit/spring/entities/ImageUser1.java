package tn.esprit.spring.entities;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "T_IMAGE_USER")
public class ImageUser1 {
	
	private static long SerialVersionUID=1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idImageUser ;
	
	private String nameImageUser;
	//private String typeImageUser;
	
	

	public static void setSerialversionuid(long serialversionuid) {
		SerialVersionUID = serialversionuid;
	}
	
	@ManyToOne
	Client Client;
	

	@Lob
	  private byte[] data;

	public int getIdImageUser() {
		return idImageUser;
	}

	public void setIdImageUser(int idImageUser) {
		this.idImageUser = idImageUser;
	}

	public String getNameImageUser() {
		return nameImageUser;
	}

	public void setNameImageUser(String nameImageUser) {
		this.nameImageUser = nameImageUser;
	}

	/*public String getTypeImageUser() {
		return typeImageUser;
	}

	public void setTypeImageUser(String typeImageUser) {
		this.typeImageUser = typeImageUser;
	}*/

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public ImageUser1(int idImageUser, String nameImageUser, String typeImageUser, byte[] data) {
		super();
		this.idImageUser = idImageUser;
		this.nameImageUser = nameImageUser;
		//this.typeImageUser = typeImageUser;
		this.data = data;
	}

	

	public Client getClient() {
		return Client;
	}

	public void setClient(Client client) {
		Client = client;
	}

	public ImageUser1(int idImageUser, String nameImageUser, String typeImageUser,
			tn.esprit.spring.entities.Client client, byte[] data) {
		super();
		this.idImageUser = idImageUser;
		this.nameImageUser = nameImageUser;
		//this.typeImageUser = typeImageUser;
		Client = client;
		this.data = data;
	}

	public static long getSerialVersionUID() {
		return SerialVersionUID;
	}

	public static void setSerialVersionUID(long serialVersionUID) {
		SerialVersionUID = serialVersionUID;
	}


	public ImageUser1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImageUser1(String nameImageUser, String type, byte[] data) {
		super();
		this.nameImageUser = nameImageUser;
		//this.typeImageUser = typeImageUser;
		this.data = data;
	}

	public ImageUser1(String nameImageUser2, String contentType, String nameImageUser3, byte[] bytes) {
		// TODO Auto-generated constructor stub
	}

	public static long getSerialversionuid() {
		return SerialVersionUID;
	}

	
}
