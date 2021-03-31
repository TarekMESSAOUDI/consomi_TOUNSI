package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties
@Table (name = "T_COMMENT")
public class Comment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idComment ;
	private int likeNumberComment ;
	private int disLikeNumberComment ;
	private String descriptionComment ;
	@Temporal (TemporalType.DATE)
	private Date DateComment ;
	private boolean stateComment ;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Comment(Long idComment, int likeNumberComment, int disLikeNumberComment, String descriptionComment,
			Date dateComment, boolean stateComment) {
		super();
		this.idComment = idComment;
		this.likeNumberComment = likeNumberComment;
		this.disLikeNumberComment = disLikeNumberComment;
		this.descriptionComment = descriptionComment;
		DateComment = dateComment;
		this.stateComment = stateComment;
	}
@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	Client Client; 

	
	@JsonIgnore
	@ManyToOne
	Subject Subject; 
	
	//Association reflexive :
	@JsonIgnore
	@ManyToOne
	Comment comment ; 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Comment")
	@JsonIgnore
	private Set<Comment> Comment;
	
	
	public Date getDateComment() {
		return DateComment;
	}
	public void setDateComment(Date dateComment) {
		DateComment = dateComment;
	}
	public Long getIdComment() {
		return idComment;
	}
	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}
	public int getLikeNumberComment() {
		return likeNumberComment;
	}
	public void setLikeNumberComment(int likeNumberComment) {
		this.likeNumberComment = likeNumberComment;
	}
	public int getDisLikeNumberComment() {
		return disLikeNumberComment;
	}
	public void setDisLikeNumberComment(int disLikeNumberComment) {
		this.disLikeNumberComment = disLikeNumberComment;
	}
	public String getDescriptionComment() {
		return descriptionComment;
	}
	public void setDescriptionComment(String descriptionComment) {
		this.descriptionComment = descriptionComment;
	}
	public boolean isStateComment() {
		return stateComment;
	}
	public void setStateComment(boolean stateComment) {
		this.stateComment = stateComment;
	}
	
	
	
	@JsonIgnore
	public Client getClient() {
		return Client;
	}
	@JsonIgnore
	public void setClient(Client client) {
		Client = client;
	}
	@JsonIgnore
	public Subject getSubject() {
		return Subject;
	}
	@JsonIgnore
	public void setSubject(Subject subject) {
		Subject = subject;
	}
	@JsonIgnore
	public Comment getComment() {
		return comment;
	}
	@JsonIgnore
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	@JsonIgnore
	public void setComment(Set<Comment> comment) {
		Comment = comment;
	}

	
	
}
