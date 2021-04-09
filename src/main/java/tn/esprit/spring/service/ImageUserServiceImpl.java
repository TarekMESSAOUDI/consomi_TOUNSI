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
	IImageUserRepository iur;
	
	@Autowired
	IClientRepository cR;
	
	@Autowired
	ImageUserServiceImpl usi;
	
	
	  public ImageUser1 addImage(MultipartFile file) throws IOException {
		    String nameImageUser = StringUtils.cleanPath(file.getOriginalFilename());
		    ImageUser1 ImageUser = new ImageUser1(nameImageUser, file.getContentType(), file.getBytes());

		    return iur.save(ImageUser);
		  }


	/*public void affecterMissionADepartement(int i, int j) {
		Client client=cR.findById(j).get();
		MultipartFile imageUser1=usi.findById(i);
		((ImageUser1) imageUser1).setClient(client);
		iur.save(null);
		
	}*/


	private MultipartFile findById(int i) {
		// TODO Auto-generated method stub
		return null;
	}



		@Override
		public void affectationImageToClient(int idImageUser, int idUser) {
			// TODO Auto-generated method stub
			Client client=cR.findById(idUser).get();
			ImageUser1 imageUser1=iur.findById(idImageUser).get();
			imageUser1.setClient(client);
			iur.save(imageUser1);
}

		
	}
