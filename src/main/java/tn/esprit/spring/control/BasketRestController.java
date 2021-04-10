package tn.esprit.spring.control;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Administrator;
import tn.esprit.spring.entities.Basket;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repository.IBasketRepository;
import tn.esprit.spring.service.BasketServiceImpl;
import tn.esprit.spring.service.IBasketService;
import tn.esprit.spring.service.IClientService;

@RestController
@CrossOrigin("http://localhost:9090")
public class BasketRestController {
	
	@Autowired
	IBasketService bs;
	
	@Autowired
	IBasketRepository br;
	
	@Autowired
	BasketServiceImpl bsi;
	
	@Autowired
	IClientService Cs;
	
	// http://localhost:9090/SpringMVC/servlet/add-basket
			@PostMapping("/add-basket")
			@ResponseBody
			public Basket addBasket(@RequestBody Basket basket) {
			Basket ba = bs.addBasket(basket);
			return ba;
			}
	
	// http://localhost:9090/SpringMVC/servlet/affect-basket-to-client
			@PostMapping("/affect-basket-to-client/{idbasket}/{iduser}")
			@ResponseBody
			public void affectationBasketToClient(@PathVariable("idbasket")int idBasket,@PathVariable("iduser")int idUser) throws IOException{
			//Client client =new Client();
				//Basket basket=new Basket();
				//Cs.addClient(client).getIdUser();
				//bsi.addBasket(basket);
				bsi.affectationBasketToClient(idBasket, idUser);
		}
			
			/*@GetMapping("/get-rankclient-by-basketid/{idBasket}")
			@ResponseBody
			public Double getRankClientByBasketId(@PathVariable("idBasket")int idBasket){
				return br.getRankClientByBasketId(idBasket);
			}*/

}
