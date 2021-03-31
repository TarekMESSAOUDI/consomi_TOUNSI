package tn.esprit.spring.repository;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Comment;



public interface CommentRepository extends CrudRepository<Comment, Long> {
	
	
	
	@Query(value = "SELECT * FROM t_comment c WHERE c.likeNumberComment = :t " , nativeQuery =true)
	List<Comment> findBylikeNumberComment(@Param("t")int likeNumberComment);
	
	@Query(value = "SELECT * FROM t_comment c WHERE c.disLikeNumberComment = :t " , nativeQuery =true)
	List<Comment> findBydisLikeNumberComment(@Param("t")int disLikeNumberComment);
	
	
	
	
	
}
