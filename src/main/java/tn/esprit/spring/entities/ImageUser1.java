package tn.esprit.spring.entities;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "T_IMAGE_USER")
public class ImageUser1 implements MultipartFile {
	
	private static long SerialVersionUID=1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idImageUser ;
	
	private String nameImageUser;
	
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
		this.data = data;
	}

	

	public Client getClient() {
		return Client;
	}

	public void setClient (Client client2) {
		Client = client2;
	}

	public ImageUser1(int idImageUser, String nameImageUser, String typeImageUser,
			tn.esprit.spring.entities.Client client, byte[] data) {
		super();
		this.idImageUser = idImageUser;
		this.nameImageUser = nameImageUser;
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
	}

	public ImageUser1(String nameImageUser, String type, byte[] data) {
		super();
		this.nameImageUser = nameImageUser;
		this.data = data;
	}

	public ImageUser1(String nameImageUser2, String contentType, String nameImageUser3, byte[] bytes) {
	}

	public static long getSerialversionuid() {
		return SerialVersionUID;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getOriginalFilename() {
		return null;
	}

	@Override
	public String getContentType() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public long getSize() {
		return 0;
	}

	@Override
	public byte[] getBytes() throws IOException {
		return null;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return null;
	}

	@Override
	public void transferTo(File dest) throws IOException, IllegalStateException {
	}

	
}
