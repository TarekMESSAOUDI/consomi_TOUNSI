package tn.esprit.spring.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.ImageUser1;
import tn.esprit.spring.repository.IClientRepository;
import tn.esprit.spring.repository.IImageUserRepository;

@Service
public class ImageUserServiceImpl implements IImageUserService{
	
	@Autowired
	private IImageUserRepository iur;
	
	@Autowired
	IClientRepository cR;
	
	
	  public ImageUser1 addImage(MultipartFile file) throws IOException {
		    String nameImageUser = StringUtils.cleanPath(file.getOriginalFilename());
		    ImageUser1 ImageUser = new ImageUser1(nameImageUser, file.getContentType(), file.getBytes());

		    return iur.save(ImageUser);
		  }


		/*@Override
		public void affecterImageAClient(int idImageUser, int idUser) {
			// TODO Auto-generated method stub
			Client client=cR.findById(idUser);
			ImageUser1 imageUser1=iur.findById(idImageUser);
			imageUser1.setClient(client);
			iur.save(imageUser1);
}
*/
		
	}
