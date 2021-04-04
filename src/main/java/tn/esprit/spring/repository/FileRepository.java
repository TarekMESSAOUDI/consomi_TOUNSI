package tn.esprit.spring.repository;



import org.springframework.data.repository.CrudRepository;


import tn.esprit.spring.entities.FileDB;

public interface FileRepository extends CrudRepository<FileDB, Integer>{


}
