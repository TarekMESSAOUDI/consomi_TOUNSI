package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Comment;

public interface CommentService {

	

	Comment addComment(Comment c);

	void deleteComment(Long id);

	//Comment updateComment(Comment c);

	Comment retrieveComment(Long id);

	List<Comment> retrieveAllComments();

	
	int countNbcommentaire(int idSubject);

	int ajouterCommentaire(Comment c);

	

	

}
