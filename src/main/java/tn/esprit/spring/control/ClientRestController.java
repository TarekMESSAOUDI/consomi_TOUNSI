package tn.esprit.spring.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.service.IClientService;


@RestController
public class ClientRestController {
	
	@Autowired 
	IClientService cS;

			// http://localhost:9090/SpringMVC/servlet/retrieve-all-clients
			@GetMapping("/retrieve-all-clients")
			@ResponseBody
			public List<Client> getclient() {
			List<Client> list = cS.retrieveAllClients();
			return list;
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-client-by-id/{user-id}
			@GetMapping("/retrieve-client-by-id/{user-id}")
			@ResponseBody
			public Optional<Client> retrieveClient(@PathVariable("user-id") int userId) {
			return cS.retrieveClientById(userId);
			}
	
			// http://localhost:9090/SpringMVC/servlet/add-client
			@PostMapping("/add-client")
			@ResponseBody
			public Client addClient(@RequestBody Client client) {
			Client cl = cS.addClient(client);
			return cl;
			}

			// http://localhost:9090/SpringMVC/servlet/delete-client/{user-id}
			@DeleteMapping("/delete-client/{user-id}")
			@ResponseBody
			public void deleteClient(@PathVariable("user-id") int userId) {
			cS.deleteClient(userId);
			}
			
			// http://localhost:9090/SpringMVC/servlet/update-client
			@PutMapping("/update-client")
			@ResponseBody
			public Client updateClient(@RequestBody Client client) {
			return cS.updateClient(client);
			}
}
