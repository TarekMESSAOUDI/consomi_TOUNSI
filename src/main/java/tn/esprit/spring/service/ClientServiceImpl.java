package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Department;
import tn.esprit.spring.entities.ImageUser1;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.entities.SexeType;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.IClientRepository;
import tn.esprit.spring.repository.IImageUserRepository;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientRepository Cr;
	
	@Autowired
	IImageUserRepository iur;
	
	@Override
	public Client addClient(Client client) {
		client.setRoleUser("CLIENT");
		return Cr.save(client);
	}

	@Override
	public Client updateClient(Client client) {
		return Cr.save(client);
	}

	@Override
	public boolean deleteClient(int id) {
		if (Cr.existsById(id)){
			Cr.deleteById(id);
			return true;
		}else
		return false;
	}

	@Override
	public Client retrieveClientById(int id) {
		return Cr.findById(id).get();
	}
	
	
	@Override
	public List<Client> retrieveAllClients() {
		return (List<Client>) Cr.findAll();
	}

	@Override
	public List<Client> retrieveClientByRankClient(int rankClient) {
		return (List<Client>) Cr.findByRankClient(rankClient);
	}
	
	@Override
	public List<Client> retrieveClientByPoint(int pointNumberClient) {
		return (List<Client>) Cr.findByPointNumberClientGreaterThan(pointNumberClient);
	}
	
	@Override
	public Client retrieveClientByFirstName(String firstNameUser) {
		return  Cr.findByFirstNameUser(firstNameUser);
	}

	@Override
	public List<Client> retrieveClientByState(boolean stateUser) {
		return (List<Client>) Cr.findByStateUser(stateUser);
	}

	@Override
	public List<Client> retrieveClientByAdress(String adressUser) {
		return (List<Client>) Cr.findByAdressUser(adressUser);
	}

	@Override
	public List<Client> retrieveClientByDate(Date birthDateUser) {
		return (List<Client>) Cr.findByBirthDateUser(birthDateUser);
	}
	
	@Override
	public List<Client> retrieveClientBySexe(SexeType sexeUser) {
		return (List<Client>) Cr.findBySexeUser(sexeUser);
	}

	@Override
	public long retrieveClientByCount() {
		return Cr.count();
	}
	
	/*@Override
	public void affectImageToClient(int idUser, int idImageUser) {
	ImageUser1 imageUser1 = iur.findById(idImageUser).get();
	Client client = Cr.findById(idUser).get();
	client.setImageUser1(imageUser1);
	iur.save(imageUser1);

	}*/
	
public static final int MAX_FAILED_ATTEMPTS = 3;
    
    private static final long LOCK_TIME_DURATION = 24 * 60 * 60 * 1000; // 24 heurs
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	/*@Override
	public List<User> getAllUsers() {
		List<User> usereList = (List<User>) userRepository.findAll();

		if (usereList.size() > 0) {
			return usereList;
		} else {
			return new ArrayList<User>();
		}
	}*/

	/*@Override
	public User getUserById(int id) throws Exception {
		return userRepository.findByidUser(id);
	}
*/
	@Override
	public Client createUser(Client entity) throws Exception {
		return Cr.save(entity);
	}
	
	@Override
	public Client updateUser(Client entity) throws Exception {
		Optional<Client> user = Cr.findById(entity.getIdUser());
		if (user!=null) {
			return Cr.save(entity);
		} else {
			throw new Exception("No the user record exist");
		}
	}

	
	@Override
	public void deleteUserById(Integer userId) throws Exception {
		Cr.deleteById(userId);
	}
	
	@Override
	public Client activateUser (Client user) throws Exception {
		user.setStateUser(true);
		return updateUser(user);
	}
	
	@Override
	public Client desactivateUser (Client user) throws Exception {
		user.setStateUser(false);
		return updateUser(user);
	}
	
/*	@Override
	public List<Client> findUserLastName (String username) throws Exception {
		return Cr.findBylastNameUser(username);
	}*/
	
	public String getUserRoleDescription(int id) {
		return Cr.getUserRole(id);
		
	}
	
	@Override
	public List<String> findUsersActivated() throws Exception {
		return Cr.getUsersFromActivated();
		
	}

	@Override
	public List<String> getUsersFromDisabled() {
		return Cr.getUsersFromDisabled();
	}
	
	@Override
	public void increaseFailedAttempts(Client user) {
        int newFailAttempts = user.getFailedAttempt() + 1;
        Cr.updateFailedAttempts(newFailAttempts, user.getFirstNameUser());
    }
    @Override
    public void resetFailedAttempts(String email) {
    	Cr.updateFailedAttempts(0, email);
    }
    @Override
    public void lock(Client user) {
        user.setAccountNonLocked(false);
        user.setLockTime(new Date());
         
        Cr.save(user);
    }
    
	@Override
    public boolean unlockWhenTimeExpired(Client user) {
        long lockTimeInMillis = user.getLockTime().getTime();
        long currentTimeInMillis = System.currentTimeMillis();
         
        if (lockTimeInMillis + LOCK_TIME_DURATION < currentTimeInMillis) {
            user.setAccountNonLocked(true);
            user.setLockTime(null);
            user.setFailedAttempt(0);
            Cr.save(user);
             
            return true;
        }
         
        return false;
    }

	public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
}

	@Override
	public Client findUserByResetToken(String login) {
		// TODO Auto-generated method stub
		return Cr.findUserByresettoken(login);
	}
	

		@Override
		public Client findById(int idUser) {
			return Cr.findById(idUser).get();
		}

		@Override
		public Client findBymail(String mail) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Client findUserByfirstNameUser(String user) throws Exception {
			// TODO Auto-generated method stub
			return  (Client) Cr.findByFirstNameUser(user);
		}


	
	
}
