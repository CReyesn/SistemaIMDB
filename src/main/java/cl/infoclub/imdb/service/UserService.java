package cl.infoclub.imdb.service;

import java.util.List;

import cl.infoclub.imdb.model.Users;



public interface UserService {

	void save(Users user);
	void update(Users user);
	List<Users> findAll();
	Users findById(Long id);
	void delete(Users user);
	Users findUsersByEmail(String email);
}
