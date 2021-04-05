package tn.esprit.spring.service;

import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.spring.entities.ImageUser1;
import tn.esprit.spring.repository.IImageUserRepository;

@Service
public class ImageUserServiceImpl {
	
	@Autowired
	private IImageUserRepository iur;
	
	  public ImageUser1 store(MultipartFile file) throws IOException {
		    String nameImageUser = StringUtils.cleanPath(file.getOriginalFilename());
		    ImageUser1 ImageUser = new ImageUser1(nameImageUser, file.getContentType(), file.getBytes());

		    return iur.save(ImageUser);
		  }

}
