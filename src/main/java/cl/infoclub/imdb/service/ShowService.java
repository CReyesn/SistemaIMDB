package cl.infoclub.imdb.service;

import java.util.List;

import cl.infoclub.imdb.model.Showw;



public interface ShowService {

	void save(Showw show);
	void update(Showw show);
	List<Showw> findAll();
	Showw findById(Long id);
	void delete(Showw show);
}
