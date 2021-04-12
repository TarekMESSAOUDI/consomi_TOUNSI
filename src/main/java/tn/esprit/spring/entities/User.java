package tn.esprit.spring.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table (name = "T_USER")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	protected int idUser ;
	protected String firstNameUser ;
	protected String lastNameUser ;
	protected String cinUser ;
	protected String passwordUser ;
	protected String confirmPasswordUser ;
	protected boolean stateUser ;
	protected String phoneNumberUser ;
	protected String adressUser ;
	@Temporal (TemporalType.DATE)
	protected Date birthDateUser ;
	protected String emailUser ;
	protected String imageUser ;
	@Enumerated (EnumType.STRING)
	protected SexeType sexeUser ;
	protected String roleUser;
	protected boolean accountNonLocked;
	@Column(name = "failedAttempt", columnDefinition = "int default 0")
	protected int failedAttempt;
	@Column(name = "lockTime")
	protected Date lockTime;
	@Column(name = "resettoken")
	protected String resettoken;
	protected boolean isBlocked;
	protected LocalDate blockDate;
	protected LocalDate unBlockDate;
	protected boolean isPrivate;


	public User(int idUser, String firstNameUser, String lastNameUser, String cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser,
			Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser, String roleUser,
			boolean accountNonLocked, int failedAttempt, Date lockTime, String resettoken, boolean isBlocked,
			LocalDate blockDate, LocalDate unBlockDate, boolean isPrivate) {
		super();
		this.idUser = idUser;
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
		this.cinUser = cinUser;
		this.passwordUser = passwordUser;
		this.confirmPasswordUser = confirmPasswordUser;
		this.stateUser = stateUser;
		this.phoneNumberUser = phoneNumberUser;
		this.adressUser = adressUser;
		this.birthDateUser = birthDateUser;
		this.emailUser = emailUser;
		this.imageUser = imageUser;
		this.sexeUser = sexeUser;
		this.roleUser = roleUser;
		this.accountNonLocked = accountNonLocked;
		this.failedAttempt = failedAttempt;
		this.lockTime = lockTime;
		this.resettoken = resettoken;
		this.isBlocked = isBlocked;
		this.blockDate = blockDate;
		this.unBlockDate = unBlockDate;
		this.isPrivate = isPrivate;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public int getFailedAttempt() {
		return failedAttempt;
	}

	public void setFailedAttempt(int failedAttempt) {
		this.failedAttempt = failedAttempt;
	}

	public Date getLockTime() {
		return lockTime;
	}

	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}

	public String getResettoken() {
		return resettoken;
	}

	public void setResettoken(String resettoken) {
		this.resettoken = resettoken;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public LocalDate getBlockDate() {
		return blockDate;
	}

	public void setBlockDate(LocalDate blockDate) {
		this.blockDate = blockDate;
	}

	public LocalDate getUnBlockDate() {
		return unBlockDate;
	}

	public void setUnBlockDate(LocalDate unBlockDate) {
		this.unBlockDate = unBlockDate;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String firstNameUser, String lastNameUser, String cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser,
			Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser) {
		super();
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
		this.cinUser = cinUser;
		this.passwordUser = passwordUser;
		this.confirmPasswordUser = confirmPasswordUser;
		this.stateUser = stateUser;
		this.phoneNumberUser = phoneNumberUser;
		this.adressUser = adressUser;
		this.birthDateUser = birthDateUser;
		this.emailUser = emailUser;
		this.imageUser = imageUser;
		this.sexeUser = sexeUser;
		this.roleUser= roleUser;
	}


	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getFirstNameUser() {
		return firstNameUser;
	}
	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}
	public String getLastNameUser() {
		return lastNameUser;
	}
	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}
	public String getCinUser() {
		return cinUser;
	}
	public void setCinUser(String cinUser) {
		this.cinUser = cinUser;
	}
	
	public String getPasswordUser() {
		return passwordUser;
	}
	
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public boolean isStateUser() {
		return stateUser;
	}
	public void setStateUser(boolean stateUser) {
		this.stateUser = stateUser;
	}
	public String getPhoneNumberUser() {
		return phoneNumberUser;
	}
	public void setPhoneNumberUser(String phoneNumberUser) {
		this.phoneNumberUser = phoneNumberUser;
	}
	public String getAdressUser() {
		return adressUser;
	}
	public void setAdressUser(String adressUser) {
		this.adressUser = adressUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getImageUser() {
		return imageUser;
	}
	public void setImageUser(String imageUser) {
		this.imageUser = imageUser;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public SexeType getSexeUser() {
		return sexeUser;
	}
	public void setSexeUser(SexeType sexeUser) {
		this.sexeUser = sexeUser;
	}

	public String getConfirmPasswordUser() {
		return confirmPasswordUser;
	}
	
	public void setConfirmPasswordUser(String confirmPasswordUser) {
		this.confirmPasswordUser = confirmPasswordUser;
	}
	public Date getBirthDateUser() {
		return birthDateUser;
	}
	public void setBirthDateUser(Date birthDateUser) {
		this.birthDateUser = birthDateUser;
	}


	public String getRoleUser() {
		return roleUser;
	}


	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}

	
}
