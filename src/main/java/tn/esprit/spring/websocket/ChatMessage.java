package tn.esprit.spring.websocket;


public class ChatMessage {
    
    private MessageType type;
    private String Chat_Id ;
    private String content;
    private String sender;
   
 
    public enum MessageType {
        CHAT, JOIN, LEAVE
    }


	public MessageType getType() {
		return type;
	}


	public void setType(MessageType type) {
		this.type = type;
	}


	public String getChat_Id() {
		return Chat_Id;
	}


	public void setChat_Id(String chat_Id) {
		Chat_Id = chat_Id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getSender() {
		return sender;
	}


	public void setSender(String sender) {
		this.sender = sender;
	}

	
}