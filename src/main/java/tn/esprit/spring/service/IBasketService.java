package tn.esprit.spring.service;

import tn.esprit.spring.entities.Basket;

public interface IBasketService {
	
	void affectationBasketToClient(int idBasket, int idUser);

	Basket addBasket(Basket basket);

	boolean deleteBasket(int id);

}
