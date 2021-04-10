package tn.esprit.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.esprit.spring.entities.Basket;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.ImageUser1;
import tn.esprit.spring.repository.IBasketRepository;
import tn.esprit.spring.repository.IClientRepository;

@Service
public class BasketServiceImpl implements IBasketService{

	@Autowired
	IClientRepository cR;
	
	@Autowired
	public BasketServiceImpl bsi;
	
	@Autowired
	IBasketRepository br;
	
	@Override
	public void affectationBasketToClient(int idBasket, int idUser) {
		/*Client client=cR.findById(idUser).get();
		Basket basket=br.findById(idBasket).get();
		basket.setClient(client);
		br.save(basket);*/
		Basket basket=br.findById(idBasket).get();
		Client client=cR.findById(idUser).get();
		client.setBasket(basket);
		cR.save(client);
		
	}

	private Basket findById(int idBasket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Basket addBasket(Basket basket) {
		// TODO Auto-generated method stub
		return br.save(basket);
	}
	
	@Override
	public boolean deleteBasket(int id) {
		if (br.existsById(id)){
			br.deleteById(id);
			return true;
		}else
		return false;
	}

}
