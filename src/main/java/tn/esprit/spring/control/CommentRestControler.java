package tn.esprit.spring.control;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Comment;
import tn.esprit.spring.service.CommentService;

@RestController
public class CommentRestControler {

	
	@Autowired
	CommentService commentservice;
	
	
	// http://localhost:9090/SpringMVC/servlet/retrieve-all-Comments
	@GetMapping("/retrieve-all-Comments")
	@ResponseBody
	public List<Comment> getCommnets() {
	List<Comment> list = commentservice.retrieveAllComments();
	return list;
	}

	//http://localhost:9090/SpringMVC/servlet/retrieve-comment/{comment-id}
		@GetMapping("/retrieve-comment/{comment-id}")
		@ResponseBody
		public Comment retrieveComment(@PathVariable("comment-id") Long commentId) {
		return commentservice.retrieveComment(commentId);
		}
		
		
		
		// http://localhost:9090/SpringMVC/servlet/add-comment
		@PostMapping("/add-comment")
		@ResponseBody
		public Comment addComment(@RequestBody Comment c) {
		Comment comment1 = commentservice.addComment(c);
		return comment1;
		}
	
	
		//localhost:9090/SpringMVC/servlet/remove-comment/{comment-id}
			@DeleteMapping("/remove-comment/{comment-id}")
			@ResponseBody
			public void removeComment(@PathVariable("comment-id") Long commentId) {
			commentservice.deleteComment(commentId);
			}
			// http://localhost:9090/SpringMVC/servlet/modify-comment
			@PutMapping("/modify-comment")
			@ResponseBody
			public Comment modifyComment(@RequestBody Comment comment) {
			return commentservice.addComment(comment);
			}
	
	
	
}
