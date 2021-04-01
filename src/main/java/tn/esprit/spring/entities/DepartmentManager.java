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

@Entity
@JsonIgnoreProperties
@Table (name = "T_DEPARTMENT_MANAGER")
public class DepartmentManager extends User implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public DepartmentManager(int idUser, String firstNameUser, String lastNameUser, int cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, int phoneNumberUser, String adressUser, Date birthDateUser,
			String emailUser, String imageUser, SexeType sexeUser) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private float salaryDepartmentManager ;
	private int NumberDepartmentManager ;

	
	public DepartmentManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentManager(String firstNameUser, String lastNameUser, String cinUser, String passwordUser,
			String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser,
			Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser) {
		super(firstNameUser, lastNameUser, cinUser, passwordUser, confirmPasswordUser, stateUser, phoneNumberUser, adressUser,
				birthDateUser, emailUser, imageUser, sexeUser);
		// TODO Auto-generated constructor stub
	}
	public DepartmentManager(String firstNameUser, String lastNameUser, String cinUser, String passwordUser, String confirmPasswordUser, boolean stateUser, String phoneNumberUser, String adressUser, Date birthDateUser, String emailUser, String imageUser, SexeType sexeUser, float salaryDepartmentManager, int NumberDepartmentManager) {
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
		this.salaryDepartmentManager = salaryDepartmentManager;
		this.NumberDepartmentManager = NumberDepartmentManager;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="DepartmentManager")
	//@JsonIgnore
	private Set<Department> Department;
	
	

	public float getSalaryDepartmentManager() {
		return salaryDepartmentManager;
	}
	public void setSalaryDepartmentManager(float salaryDepartmentManager) {
		this.salaryDepartmentManager = salaryDepartmentManager;
	}
	
	public int getNumberDepartmentManager() {
		return NumberDepartmentManager;
	}
	public void setNumberDepartmentManager(int numberDepartmentManager) {
		NumberDepartmentManager = numberDepartmentManager;
	}
	public Set<Department> getDepartment() {
		return Department;
	}
	public void setDepartment(Set<Department> department) {
		Department = department;
	}
	
	
}
