package tn.esprit.spring.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

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
	public int countNbcommentaire(int idComment) {
		return  commentrepository.countNbCommentaire(idComment);
	
	
}
	
	
	
	
	
	
	
	
	
	
	@Transactional
	@Override
	public int ajouterCommentaire(Comment c) {
		List<String> badwords=new ArrayList<>();
		badwords.add("badbad");
		badwords.add("badwords");
		badwords.add("bads");
		String motcommentaire[]=c.getDescriptionComment().split(" ");
		String com ="";
		 
	for(String mots:motcommentaire){
//		if(motcommentaire.length==1 && motcommentaire.equals("b"))
		
			if (badwords.contains(mots)){
			    mots="(@#à*&è)";
				com=com+" "+mots;	
			}
		else
			com=com+" "+mots;}
	 c.setDescriptionComment(com);
	 commentrepository.save(c);
	return c.getIdComment().intValue();
	}
	
	
}