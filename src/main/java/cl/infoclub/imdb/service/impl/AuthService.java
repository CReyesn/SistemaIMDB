package cl.infoclub.imdb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.infoclub.imdb.model.Users;
import cl.infoclub.imdb.repository.UserRepository;




@Service
public class AuthService implements UserDetailsService{

	@Autowired
	UserRepository usersRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Users users=usersRepository.findUsersByEmail(email); //busca el usuario por email
		System.out.println(users);
		if (users==null) {
			throw new UsernameNotFoundException(email); // si es nulo manda la excepcion
		}
		List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>(); 
		authorities.add(new SimpleGrantedAuthority(users.getRole().toString())); //seteo de la lista de autoridad
		
		return new User(users.getEmail(),users.getPassword(),authorities);
	}


	
	
}
