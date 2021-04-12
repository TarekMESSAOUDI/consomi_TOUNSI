package tn.esprit.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Administrator;

public interface IAdministratorRepository extends CrudRepository <Administrator, Integer>{
	
	@Query("SELECT a.firstNameUser,a.lastNameUser,a.specialityAdmin FROM User a")
	List<String> getNameAndSpecialityAdmin();
	List<Administrator> findByTypeAdmin(String typeAdmin);
	List<Administrator> findBySpecialityAdmin(String SpecialityAdmin);
	
}