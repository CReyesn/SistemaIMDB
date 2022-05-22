package cl.infoclub.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.infoclub.imdb.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	public List<Users> findAll();
	
	public Users findByUsername(String username);
	
	public Users findUsersByEmail(String email);
}
