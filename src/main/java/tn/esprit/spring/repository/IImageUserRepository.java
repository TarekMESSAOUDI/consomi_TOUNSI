package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.ImageUser1;

@Repository
public interface IImageUserRepository extends CrudRepository <ImageUser1,Integer> {


	
}
