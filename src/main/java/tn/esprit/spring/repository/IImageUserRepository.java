package tn.esprit.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.ImageUser1;

public interface IImageUserRepository extends CrudRepository <ImageUser1,Integer> {

	
}
