package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PaysException.class);
	
	
	public UserDTO getUser(long userId) {
		logger.info("Recherche utilisateur numero: " + userId);
		User user = userRepository.findById(userId);
		if(user==null)return null;
		else return usertoUserDTO(user);
	}
	
	public long countUsers() {
		return userRepository.count();
	}

	public void createUser(UserDTO userDTO) {
		if(userDTO.getAge()<18) {
			throw new AgeException("L'Age doit être superieur à 18.");
		}
		if(!userDTO.getPays().equalsIgnoreCase("france")) {
			throw new PaysException("Le pays doit être la 'France'");
		}
		else {
			userRepository.save(userDTOtoUser(userDTO));
			logger.info("Utilisateur créé");
		}
	}
	
	public User userDTOtoUser(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getPrenom(), userDTO.getAge(), userDTO.getPays());
	}
	
	public UserDTO usertoUserDTO(User user) {
		return new UserDTO(user.getId(), user.getPrenom(), user.getAge(), user.getPays());
	}
	
}
