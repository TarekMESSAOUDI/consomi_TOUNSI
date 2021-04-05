package tn.esprit.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.ImageUser1;
import tn.esprit.spring.fileUpmessage.ResponseMessage;
import tn.esprit.spring.service.IClientService;
import tn.esprit.spring.service.IImageUserService;
import tn.esprit.spring.service.ImageUserServiceImpl;

@RestController
@CrossOrigin("http://localhost:9090")
public class ImageUserRestController {
	
	@Autowired
	  private ImageUserServiceImpl usi;
	
	  @Autowired
		IClientService Cs;
		
		@Autowired
		IImageUserService ius;
	
	// http://localhost:9090/SpringMVC/servlet/uploaded
	  @PostMapping("/uploaded")
	  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";
	    try {
	      usi.addImage(file);

	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	    } catch (Exception e) {
	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	    }
	  }
	  
		
	/*	@PostMapping("/affect-image-to-client")
		@ResponseBody
		public void affectationImageToClient(){
		Client client =new Client();
			MultipartFile file=(MultipartFile) new ImageUser1();
			Cs.addClient(client).getFirstNameUser();
			usi.addImage(file);
			usi.affecterMissionADepartement(1, 1);
	}*/

}
