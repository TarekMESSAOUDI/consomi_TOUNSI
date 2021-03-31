package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Comment;
import tn.esprit.spring.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	
	
	@Autowired
	CommentRepository commentrepository ;
	
	private static final Logger L = LogManager.getLogger(CommentService.class);
	
	@Override
	public List<Comment> retrieveAllComments() {
		List<Comment> comments =(List<Comment>) commentrepository.findAll();
		for (Comment comment : comments){
			L.info("comment +++ :" + comment);		
		}
		return comments;
	
	}
	
	@Override
	public Comment addComment(Comment c) {
		return commentrepository.save(c);
	}
	
	@Override
	public void deleteComment(Long idComment) {
		commentrepository.deleteById(idComment);
	}
	
	//@Override
//public Comment updateComment(Comment c) {
		
	//	return commentrepository.save(c);
	//}
	
	@Override
	public Comment retrieveComment(Long idComment) {
		
		return commentrepository.findById(idComment).get();
	}
	
	@Override
	public List<Comment> retrieveCommentBylikeNumberComment(int likeNumberComment){
		return commentrepository.findBylikeNumberComment(likeNumberComment);
	}
	
	@Override
	public List<Comment> retrieveCommentBydisLikeNumberComment(int disLikeNumberComment){
		return commentrepository.findBydisLikeNumberComment(disLikeNumberComment);
	}
	
	
	
	
}
