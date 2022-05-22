package cl.infoclub.imdb.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.infoclub.imdb.model.Showw;

public interface ShowRepository extends JpaRepository<Showw, Long>{

	public List<Showw> findAll();
	
}
