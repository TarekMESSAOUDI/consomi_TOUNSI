package tn.esprit.spring.websocket;


import org.springframework.data.repository.CrudRepository;
public interface ChatRepository extends CrudRepository<ChatMessage,String>{
	
	

}
