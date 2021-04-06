package tn.esprit.spring.repository;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Comment;



public interface CommentRepository extends CrudRepository<Comment, Long> {
	
	
	
	
	
	
	@Query(value = "select count(*) from t_comment where id_sujet= ?1", nativeQuery = true)
	 public int countNbCommentaire(int idComment);
	
	
}
