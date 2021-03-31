package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.DepartmentManager;

public interface IDepartmentManagerRepository extends CrudRepository <DepartmentManager, Integer>{

}
