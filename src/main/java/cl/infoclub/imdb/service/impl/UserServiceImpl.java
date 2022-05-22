package cl.infoclub.imdb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cl.infoclub.imdb.model.Users;
import cl.infoclub.imdb.repository.UserRepository;
import cl.infoclub.imdb.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	/*@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder; */
	
	@Override
	public void save(Users user) {
		userRepository.save(user);
		
	}

	@Override
	public void update(Users user) {
		userRepository.save(user);
		
	}

	@Override
	public List<Users> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Users findById(Long id) {
		return userRepository.findById(id).orElse(new Users());
	}

	@Override
	public void delete(Users user) {
		userRepository.delete(user);
		
	}

	@Override
	public Users findUsersByEmail(String email) {

		return userRepository.findUsersByEmail(email);
	}

}
