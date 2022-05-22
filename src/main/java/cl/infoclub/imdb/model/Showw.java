package cl.infoclub.imdb.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
public class Showw { //en mysql daba error al crear la tabla nombre "show" palabra reservada 

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String showTitle;
	private String showNetwork;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private Users creadorShow;
	
	@OneToMany(mappedBy = "show", cascade=CascadeType.ALL)
	private List<Rating> ratings;
}
