package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Subject;

public interface ISubjectRepository extends CrudRepository <Subject, Integer>{

}