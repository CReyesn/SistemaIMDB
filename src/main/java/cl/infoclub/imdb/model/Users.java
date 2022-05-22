package cl.infoclub.imdb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String password;
	private String passwordConfirmation;
	private Role role;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER) //fetch = FetchType.EAGER)
	private List<Rating> ratings;	

	
	@OneToMany(mappedBy = "creadorShow", cascade=CascadeType.ALL)
	private List<Showw> showws;
	
	

}
